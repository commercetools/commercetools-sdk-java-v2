
package com.commercetools.monitoring.newrelic;

import static com.commercetools.monitoring.newrelic.NewrelicInfo.*;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.newrelic.api.agent.*;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ContextApiHttpClientImpl;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

/**
 * <p>The NewRelicTelemetry middleware can be used to report outgoing request to commercetools to NewRelic.
 * It can be registered as TelemetryMiddleware to the {@link io.vrap.rmf.base.client.ClientBuilder#withTelemetryMiddleware(TelemetryMiddleware) ClientBuilder}
 * or the ApiRootBuilder.</p>
 *
 * {@include.example example.NewRelicApiRootBuilderTest#addNewRelic()}
 *
 * The middleware adds the following metrics to Newrelic:
 * <ul>
 *     <li>Custom/Commercetools/Client/Duration: The duration of the request in milliseconds</li>
 *     <li>Custom/Commercetools/Client/Request/Total: The total number of requests</li>
 *     <li>Custom/Commercetools/Client/Request/Error: The total number of requests with a status code greater or equal to 400</li>
 * </ul>
 *
 * <p>The metrics are added as metric timeslice data, therefore an APM is expected in the application.</p>
 *
 * <br/>
 * <h2>Implementation details</h2>
 *
 * <p>The middleware reads the {@link NewRelicContext} from the Request and restores the transaction using a {@link Token}
 * The details of the request and response are then reported as {@link Segment} with {@link HttpParameters}</p>
 *
 * <p>The Context has to be attached in your application either to a {@link io.vrap.rmf.base.client.ContextApiHttpClient}
 * or the {@link ApiHttpRequest#addContext(Object) Request} itself.</p>
 *
 * {@include.example example.NewRelicApiRootBuilderTest#contextClient()}
 *
 * {@include.example example.NewRelicApiRootBuilderTest#contextApiRoot()}
 *
 * The {@link NewRelicContextImpl} will {@link Token#expire() expire} the {@link Token} when it's closed. Closing a {@link io.vrap.rmf.base.client.Context}
 * is ensured by {@link ContextApiHttpClientImpl#close() ContextApiHttpClient} if it's implementing {@link java.io.Closeable}
 *
 * See also the Spring MVC example application in the examples folder for further details.
 */
public class NewRelicTelemetryMiddleware implements TelemetryMiddleware {

    private final Map<String, Object> attributes;

    public NewRelicTelemetryMiddleware() {
        this.attributes = Collections.emptyMap();
    }

    public NewRelicTelemetryMiddleware(final Map<String, String> attributes) {
        this.attributes = Collections.unmodifiableMap(attributes);
    }

    @Trace(async = true)
    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        final Instant start = Instant.now();
        Optional<NewRelicContext> context = Optional.ofNullable(request.getContext(NewRelicContext.class));
        context.map(NewRelicContext::getToken).ifPresent(Token::link);
        Optional<Token> token = context.map(NewRelicContext::getTransaction).map(Transaction::getToken);
        Optional<Segment> segment = context.map(c -> c.getTransaction()
                .startSegment("commercetools", request.getMethod() + " " + request.getUri().getPath()));
        segment.ifPresent(s -> s.addCustomAttributes(this.attributes));
        return next.apply(request).handle((response, throwable) -> {
            token.ifPresent(Token::linkAndExpire);

            final int statusCode;
            final String message;
            if (response != null) {
                statusCode = response.getStatusCode();
                message = response.getMessage();
            }
            else if (throwable instanceof ApiHttpException && ((ApiHttpException) throwable).getResponse() != null) {
                ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) throwable).getResponse();
                statusCode = errorResponse.getStatusCode();
                message = errorResponse.getMessage();
            }
            else {
                statusCode = 0;
                message = throwable.getMessage();
            }

            segment.ifPresent(s -> s.reportAsExternal(HttpParameters.library("commercetools-sdk-java-v2")
                    .uri(request.getUri())
                    .procedure(request.getMethod().name())
                    .noInboundHeaders()
                    .status(statusCode, message)
                    .build()));
            segment.ifPresent(Segment::end);

            NewRelic.incrementCounter(PREFIX + CLIENT_REQUEST_TOTAL);
            NewRelic.recordResponseTimeMetric(PREFIX + CLIENT_DURATION,
                Duration.between(start, Instant.now()).toMillis());

            if (statusCode >= 400 || throwable != null) {
                NewRelic.incrementCounter(PREFIX + CLIENT_REQUEST_ERROR);
            }
            return response;
        });
    }
}
