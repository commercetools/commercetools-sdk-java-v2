
package io.vrap.rmf.base.client.http;

import java.util.Map;

import io.vrap.rmf.base.client.ApiHttpHeaders;

import org.slf4j.event.Level;

/**
 * Middleware instrumenting the {@link InternalLogger}
 *
 * <p>Responses are logged by default with {@link Level#INFO}.
 * In case of an {@link ApiHttpHeaders#X_DEPRECATION_NOTICE deprecation} header the notice will be logged with {@link Level#INFO}
 * Any exception will be logged with {@link Level#ERROR}</p>
 *
 * <p>The response, deprecation and error logger levels are configurable. Additionally, a map can be provided with the key a throwable type class
 * and the value of the log level the exception should be logged with</p>
 *
 * <p>The middleware logs with debug also the request and the whole response including headers. With trace level the request and response will
 * be logged pretty printed.</p>
 *
 * <p>All log events are written as lambda function to avoid rendering the message if the respective level is not enabled.</p>
 */
public interface InternalLoggerMiddleware extends Middleware {

    static InternalLoggerMiddleware of(final InternalLoggerFactory internalLoggerFactory) {
        return new InternalLoggerMiddlewareImpl(internalLoggerFactory);
    }

    static InternalLoggerMiddleware of(final InternalLoggerFactory internalLoggerFactory, final Level responseLogEvent,
            final Level deprecationLogEvent) {
        return new InternalLoggerMiddlewareImpl(internalLoggerFactory, responseLogEvent, deprecationLogEvent);
    }

    static InternalLoggerMiddleware of(final InternalLoggerFactory internalLoggerFactory, final Level responseLogEvent,
            final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        return new InternalLoggerMiddlewareImpl(internalLoggerFactory, responseLogEvent, deprecationLogEvent,
            defaultExceptionLogEvent, exceptionLogEvents);
    }
}
