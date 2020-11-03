package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class ClientFactory {

    public static final String COMMERCETOOLS = "commercetools";

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, new ArrayList<>());
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), middlewares);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, internalLoggerFactory, middlewares, null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider
        ) {
        List<Middleware> middlewareStack = new ArrayList<>(MiddlewareFactory.createDefault(tokenSupplier, LoggerFactory.getLogger(COMMERCETOOLS)));
        if (correlationIdProvider != null) {
            middlewares.add((request, next) -> {
                request.withHeader(ApiHttpHeaders.X_CORRELATION_ID, correlationIdProvider.getCorrelationId());
                return next.apply(request);
            });
        }
        middlewareStack.addAll(middlewares);
        middlewareStack.add(new InternalLoggerMiddleware(internalLoggerFactory));
        final HandlerStack stack = HandlerStack.create(HttpHandler.create(httpClient), middlewareStack);

        return new ApiHttpClient(
                apiBaseUrl,
                stack
        );
    }
}
