package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import io.vrap.rmf.base.client.utils.json.JsonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class InternalLoggerMiddleware implements Middleware {
    private final Logger classLogger = LoggerFactory.getLogger(InternalLoggerMiddleware.class);
    private final InternalLoggerFactory factory;

    public InternalLoggerMiddleware(InternalLoggerFactory factory) {
        this.factory = factory;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        InternalLogger logger = factory.createFor(request);
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

                        prettyPrint = VrapJsonUtils.prettyPrint(unformattedBody);
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
                if (throwable != null) {
                    if (throwable.getCause() instanceof ApiHttpException) {
                        final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException)throwable.getCause()).getResponse();
                        logger.error(() -> String.format("%s %s %s", request.getMethod().name(), request.getUrl(), errorResponse.getStatusCode()));
                        logger.debug(() -> errorResponse, throwable);
                        logger.trace(() -> errorResponse.getStatusCode() + "\n" + Optional.ofNullable(errorResponse.getBody()).map(body -> VrapJsonUtils.prettyPrint(errorResponse.getBodyAsString().orElse(""))).orElse("<no body>"));
                    } else {
                        logger.error(throwable::getCause, throwable);
                    }
                } else {
                    logger.info(() -> String.format("%s %s %s", request.getMethod().name(), request.getUrl(), response.getStatusCode()));
                    logger.debug(() -> response);
                    logger.trace(() -> response.getStatusCode() + "\n" + Optional.ofNullable(response.getBody()).map(body -> VrapJsonUtils.prettyPrint(response.getBodyAsString().orElse(""))).orElse("<no body>"));
                }
            }
        );
    }
}
