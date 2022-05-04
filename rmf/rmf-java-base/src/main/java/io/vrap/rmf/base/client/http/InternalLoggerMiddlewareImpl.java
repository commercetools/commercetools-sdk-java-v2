
package io.vrap.rmf.base.client.http;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Default implementation for the {@link InternalLoggerMiddleware}
 */
class InternalLoggerMiddlewareImpl implements InternalLoggerMiddleware {
    private static final Logger classLogger = LoggerFactory.getLogger(InternalLoggerMiddlewareImpl.class);
    private final InternalLoggerFactory factory;
    private final Level deprecationLogEvent;
    private final Level responseLogEvent;
    private final Level defaultExceptionLogEvent;
    private final Map<Class<? extends Throwable>, Level> exceptionLogEvents;

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory) {
        this(factory, Level.INFO, Level.INFO);
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            Level deprecationLogEvent) {
        this(factory, responseLogEvent, deprecationLogEvent, Level.ERROR,
            Collections.singletonMap(ConcurrentModificationException.class, Level.INFO));
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        this.factory = factory;
        this.responseLogEvent = responseLogEvent;
        this.deprecationLogEvent = deprecationLogEvent;
        this.defaultExceptionLogEvent = defaultExceptionLogEvent;
        this.exceptionLogEvents = exceptionLogEvents;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        InternalLogger logger = factory.createFor(request, InternalLogger.TOPIC_REQUEST);
        logger.debug(() -> request);
        logger.trace(() -> {
            final String output;
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
                    output = "send: " + httpMethodAndUrl + "\nformatted: " + prettyPrint;
                }
                else {
                    output = "send: " + request.getMethod().name() + " " + request.getUrl() + " " + unformattedBody;
                }
            }
            else {
                output = httpMethodAndUrl + " <no body>";
            }
            return output;
        });
        final long startTime = System.currentTimeMillis();
        return next.apply(request).whenComplete((response, throwable) -> {
            final long executionTime = System.currentTimeMillis() - startTime;
            InternalLogger responseLogger = factory.createFor(request, InternalLogger.TOPIC_RESPONSE);
            if (throwable != null) {
                if (throwable.getCause() instanceof ApiHttpException) {
                    final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) throwable.getCause())
                            .getResponse();
                    final Level level = Optional.ofNullable(exceptionLogEvents.get(throwable.getCause().getClass()))
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, () -> String
                            .format("%s %s %s %s %s %s", request.getMethod().name(), request.getUrl(),
                                errorResponse.getStatusCode(), executionTime,
                                Optional.ofNullable(errorResponse.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING))
                                        .orElse("-"),
                                Optional.ofNullable(
                                    errorResponse.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID)).orElse("-"))
                            .trim());
                    final List<Map.Entry<String, String>> notices = errorResponse.getHeaders()
                            .getHeaders(ApiHttpHeaders.X_DEPRECATION_NOTICE);
                    if (notices != null) {
                        notices.forEach(
                            message -> logger.log(deprecationLogEvent, () -> "Deprecation notice: " + message));
                    }
                    responseLogger.debug(() -> errorResponse, throwable);
                    responseLogger.trace(() -> errorResponse.getStatusCode() + "\n"
                            + Optional.ofNullable(errorResponse.getBody())
                                    .map(body -> JsonUtils.prettyPrint(errorResponse.getBodyAsString().orElse("")))
                                    .orElse("<no body>"));
                }
                else {
                    final Level level = Optional.ofNullable(exceptionLogEvents.get(throwable.getCause().getClass()))
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, throwable::getCause, throwable);
                }
            }
            else {
                responseLogger.log(responseLogEvent, () -> String.format("%s %s %s %s %s %s",
                    request.getMethod().name(), request.getUrl(), response.getStatusCode(), executionTime,
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.SERVER_TIMING)).orElse("-"),
                    Optional.ofNullable(response.getHeaders().getFirst(ApiHttpHeaders.X_CORRELATION_ID)).orElse("-"))
                        .trim());
                final List<Map.Entry<String, String>> notices = response.getHeaders()
                        .getHeaders(ApiHttpHeaders.X_DEPRECATION_NOTICE);
                if (notices != null) {
                    notices.forEach(message -> logger.log(deprecationLogEvent, () -> "Deprecation notice: " + message));
                }

                responseLogger.debug(() -> response);
                responseLogger.trace(() -> response.getStatusCode() + "\n"
                        + Optional.ofNullable(response.getBody())
                                .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                                .orElse("<no body>"));
            }
        });
    }
}
