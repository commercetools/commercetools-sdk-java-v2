
package io.vrap.rmf.base.client.http;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ConcurrentModificationException;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.event.Level;

/**
 * <p>Default implementation for the {@link InternalLoggerMiddleware}</p>
 */
class InternalLoggerMiddlewareImpl implements InternalLoggerMiddleware {
    private static final Logger classLogger = LoggerFactory.getLogger(InternalLoggerMiddlewareImpl.class);
    private final InternalLoggerFactory factory;
    private final Level deprecationLogEvent;
    private final Level responseLogEvent;
    private final Level defaultExceptionLogEvent;
    private final Map<Class<? extends Throwable>, Level> exceptionLogEvents;
    private final ResponseLogFormatter responseLogFormatter;
    private final ErrorLogFormatter errorLogFormatter;

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory) {
        this(factory, Level.INFO, Level.INFO);
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            Level deprecationLogEvent) {
        this(factory, responseLogEvent, deprecationLogEvent, Level.ERROR,
            Collections.singletonMap(ConcurrentModificationException.class, Level.INFO), LogFormatter::formatResponse,
            LogFormatter::formatError);
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        this(factory, responseLogEvent, deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents,
            LogFormatter::formatResponse, LogFormatter::formatError);
    }

    public InternalLoggerMiddlewareImpl(final InternalLoggerFactory factory, final Level responseLogEvent,
            final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents,
            final ResponseLogFormatter responseLogFormatter, final ErrorLogFormatter errorLogFormatter) {
        this.factory = factory;
        this.responseLogEvent = responseLogEvent;
        this.deprecationLogEvent = deprecationLogEvent;
        this.defaultExceptionLogEvent = defaultExceptionLogEvent;
        this.exceptionLogEvents = exceptionLogEvents;
        this.responseLogFormatter = responseLogFormatter;
        this.errorLogFormatter = errorLogFormatter;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        final InternalLogger logger = factory.createFor(request, InternalLogger.TOPIC_REQUEST);
        final Optional<MDCContext> requestContext = Optional.ofNullable(request.getContext(MDCContext.class));
        requestContext.ifPresent(c -> MDC.setContextMap(c.getValue()));
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
        requestContext.ifPresent(c -> MDC.clear());
        final long startTime = System.currentTimeMillis();
        return next.apply(request).whenComplete((response, throwable) -> {
            final long executionTime = System.currentTimeMillis() - startTime;
            final InternalLogger responseLogger = factory.createFor(request, InternalLogger.TOPIC_RESPONSE);

            if (throwable != null) {
                requestContext.ifPresent(c -> MDC.setContextMap(c.getValue()));
                Throwable cause = throwable instanceof CompletionException ? throwable.getCause() : throwable;
                if (cause instanceof ApiHttpException) {
                    final ApiHttpResponse<byte[]> errorResponse = ((ApiHttpException) throwable.getCause())
                            .getResponse();
                    final Level level = exceptionLogEvents.entrySet()
                            .stream()
                            .filter(classLevelEntry -> classLevelEntry.getKey()
                                    .isAssignableFrom(throwable.getCause().getClass()))
                            .findFirst()
                            .map(Map.Entry::getValue)
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, () -> responseLogFormatter.format(request, errorResponse, executionTime));
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
                    final Level level = exceptionLogEvents.entrySet()
                            .stream()
                            .filter(classLevelEntry -> classLevelEntry.getKey()
                                    .isAssignableFrom(throwable.getCause().getClass()))
                            .findFirst()
                            .map(Map.Entry::getValue)
                            .orElse(defaultExceptionLogEvent);
                    responseLogger.log(level, () -> errorLogFormatter.format(request, cause, executionTime), cause);
                }
                requestContext.ifPresent(c -> MDC.clear());
            }
            else {
                final Optional<MDCContext> responseContext = Optional.ofNullable(response.getContext(MDCContext.class));
                responseContext.ifPresent(c -> MDC.setContextMap(c.getValue()));

                responseLogger.log(responseLogEvent,
                    () -> responseLogFormatter.format(request, response, executionTime));
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
                responseContext.ifPresent(c -> MDC.clear());
            }
        });
    }
}
