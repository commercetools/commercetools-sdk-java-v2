
package io.vrap.rmf.base.client.http;

/**
 * Middleware instrumenting the {@link InternalLogger}
 */
public interface InternalLoggerMiddleware extends Middleware {

    static InternalLoggerMiddleware of(final InternalLoggerFactory internalLoggerFactory) {
        return new InternalLoggerMiddlewareImpl(internalLoggerFactory);
    }
}
