package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import io.vrap.rmf.base.client.utils.json.JsonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class InternalLoggerMiddleware implements Middleware {
    private static final Logger classLogger = LoggerFactory.getLogger(InternalLoggerMiddleware.class);
    private final InternalLoggerFactory factory;

    public InternalLoggerMiddleware(InternalLoggerFactory factory) {
        this.factory = factory;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        InternalLogger logger = factory.createFor(request, InternalLogger.TOPIC_REQUEST);
        logger.debug(() -> request);
        logger.trace(() -> {
            final String output;
            final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
            if (request.getBody() != null) {
                final String unformattedBody = request.getSecuredBody();
                final boolean isJsonRequest = request.getHeaders().getHeaders(ApiHttpHeaders.CONTENT_TYPE).stream().findFirst().map(ct -> ct.getValue().toLowerCase().contains("json")).orElse(true);
                if (isJsonRequest) {
                    String prettyPrint;
                    try {

                        prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                    } catch (final JsonException e) {
                        classLogger.warn("pretty print failed", e);
                        prettyPrint = unformattedBody;
                    }
                    output = "send: " + httpMethodAndUrl + "\nformatted: " + prettyPrint;
                } else {
                    output = "send: " + request.getMethod().name() + " " + request.getUrl() + " " + unformattedBody;
                }
            } else {
                output = httpMethodAndUrl + " <no body>";
            }
            return output;
        });
        return next.apply(request).whenComplete(
            (response, throwable) -> {
                InternalLogger responseLogger = factory.createFor(request, InternalLogger.TOPIC_RESPONSE);
                if (throwable != null) {
                    if (throwable.getCause() instanceof ApiHttpException) {
                        final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException)throwable.getCause()).getResponse();
                        responseLogger.error(() -> String.format("%s %s %s", request.getMethod().name(), request.getUrl(), errorResponse.getStatusCode()));
                        responseLogger.debug(() -> errorResponse, throwable);
                        responseLogger.trace(() -> errorResponse.getStatusCode() + "\n" + Optional.ofNullable(errorResponse.getBody()).map(body -> JsonUtils.prettyPrint(errorResponse.getBodyAsString().orElse(""))).orElse("<no body>"));
                    } else {
                        responseLogger.error(throwable::getCause, throwable);
                    }
                } else {
                    responseLogger.info(() -> String.format("%s %s %s", request.getMethod().name(), request.getUrl(), response.getStatusCode()));
                    responseLogger.debug(() -> response);
                    responseLogger.trace(() -> response.getStatusCode() + "\n" + Optional.ofNullable(response.getBody()).map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse(""))).orElse("<no body>"));
                }
            }
        );
    }
}
