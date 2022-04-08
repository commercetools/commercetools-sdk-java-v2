
package io.vrap.rmf.base.client.http;

import java.util.Map;

import org.slf4j.event.Level;

/**
 * Middleware instrumenting the {@link InternalLogger}
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
