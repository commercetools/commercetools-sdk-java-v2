
package io.vrap.rmf.base.client.http;

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
}
