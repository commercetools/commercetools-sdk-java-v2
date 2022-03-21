
package com.commercetools.api.client;

import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.commercetools.api.client.error.ConcurrentModificationException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.RetryPolicy;
import dev.failsafe.event.ExecutionAttemptedEvent;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcurrentModificationMiddlewareImpl implements ConcurrentModificationMiddleware {
    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry.concurrent_modification";
    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(ConcurrentModificationMiddleware.class);

    public static final String VERSION = "version";
    public static final int DEFAULT_MAX_DELAY = 60000;
    public static final int DEFAULT_INITIAL_DELAY = 200;

    private final ObjectMapper mapper;
    private final FailsafeExecutor<ApiHttpResponse<byte[]>> executor;

    public ConcurrentModificationMiddlewareImpl() {
        this(1, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, new ObjectMapper());
    }

    public ConcurrentModificationMiddlewareImpl(final int maxRetries) {
        this(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, new ObjectMapper());
    }

    public ConcurrentModificationMiddlewareImpl(final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, new ObjectMapper());
    }

    public ConcurrentModificationMiddlewareImpl(final int maxRetries, final long delay, final long maxDelay,
            ObjectMapper mapper) {
        this.mapper = mapper;
        RetryPolicy<ApiHttpResponse<byte[]>> retryPolicy = RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                .withJitter(0.25)
                .withMaxRetries(maxRetries)
                .onRetry(this::logEventFailure)
                .handle(ConcurrentModificationException.class)
                .build();
        this.executor = Failsafe.with(retryPolicy);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {

        Function<Throwable, CompletableFuture<ApiHttpResponse<byte[]>>> fn = (throwable) -> {
            if (throwable instanceof ConcurrentModificationException) {
                final Long newVersion = ((ConcurrentModificationException) throwable).getCurrentVersion();
                final JsonNode jsonNode;
                if (newVersion != null) {
                    try {
                        jsonNode = mapper.readTree(request.getBody());
                        if (jsonNode instanceof ObjectNode && jsonNode.has(VERSION)) {
                            ((ObjectNode) jsonNode).replace(VERSION, new LongNode(newVersion));
                            return next.apply(request.withBody(jsonNode.toString()));
                        }
                    }
                    catch (IOException ignored) {
                    }
                }
            }

            CompletableFuture<ApiHttpResponse<byte[]>> f = new CompletableFuture<>();
            f.completeExceptionally(throwable);
            return f;
        };

        return executor.getStageAsync((context) -> {
            if (context.isFirstAttempt()) {
                return next.apply(request);
            }
            return fn.apply(context.getLastFailure());
        });
    }

    private void logEventFailure(ExecutionAttemptedEvent<ApiHttpResponse<byte[]>> event) {
        final int attempt = event.getAttemptCount();

        logger.info(() -> "ConcurrentModification Retry #" + attempt);
        logger.trace(() -> {
            final Throwable failure = event.getLastFailure();
            if (failure instanceof ApiHttpException) {
                final ApiHttpException httpException = (ApiHttpException) failure;
                final ApiHttpRequest request = httpException.getRequest();
                final ApiHttpResponse<byte[]> response = httpException.getResponse();
                if (request != null) {
                    return requestLog(attempt, request, response);
                }
            }
            return event.toString();
        });
    }

    private String requestLog(final int attempt, ApiHttpRequest request, ApiHttpResponse<?> response) {
        String output;
        final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
        if (request.getBody() != null) {
            final String unformattedBody = request.getSecuredBody();
            final boolean isJsonRequest = request.getHeaders()
                    .getHeaders(ApiHttpHeaders.CONTENT_TYPE)
                    .stream()
                    .findFirst()
                    .map(ct -> ct.getValue().toLowerCase().contains("json"))
                    .orElse(true);
            if (isJsonRequest) {
                String prettyPrint;
                try {
                    prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                }
                catch (final JsonException e) {
                    classLogger.warn("pretty print failed", e);
                    prettyPrint = unformattedBody;
                }
                output = "ConcurrentModification Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl
                        + "\nformatted: " + prettyPrint;
            }
            else {
                output = "ConcurrentModification Retry #" + attempt + ": " + request + "\n" + request.getMethod().name()
                        + " " + request.getUrl() + " " + unformattedBody;
            }
        }
        else {
            output = "ConcurrentModification Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl
                    + " <no body>";
        }
        if (response != null) {
            output += "\nFailure response: " + response.getStatusCode() + "\n" + response + "\n"
                    + Optional.ofNullable(response.getBody())
                            .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                            .orElse("<no body>");
        }
        return output;
    }
}
