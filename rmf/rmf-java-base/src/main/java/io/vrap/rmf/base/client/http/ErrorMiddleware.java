
package io.vrap.rmf.base.client.http;

import java.util.Arrays;
import java.util.Optional;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

/**
 * Used to convert API errors to Exceptions
 */
public interface ErrorMiddleware extends Middleware {

    enum ExceptionMode {
        COMPLETION_EXCEPTION("completion_exception"), UNWRAP_COMPLETION_EXCEPTION("unwrap");
        private final String mode;

        ExceptionMode(String mode) {
            this.mode = mode;
        }

        public String getMode() {
            return mode;
        }

        public static Optional<ExceptionMode> get(String mode) {
            return Arrays.stream(ExceptionMode.values()).filter(env -> env.mode.equals(mode)).findFirst();
        }
    }

    static ErrorMiddleware of() {
        return of(HttpExceptionFactory.of(ResponseSerializer.of()), ExceptionMode.COMPLETION_EXCEPTION);
    }

    @Deprecated
    static ErrorMiddleware of(final ResponseSerializer serializer) {
        return of(HttpExceptionFactory.of(serializer), ExceptionMode.COMPLETION_EXCEPTION);
    }

    static ErrorMiddleware of(final HttpExceptionFactory exceptionFactory) {
        return of(exceptionFactory, ExceptionMode.COMPLETION_EXCEPTION);
    }

    static ErrorMiddleware of(final ExceptionMode exceptionMode) {
        return of(HttpExceptionFactory.of(ResponseSerializer.of()), exceptionMode);
    }

    static ErrorMiddleware of(final HttpExceptionFactory exceptionFactory, final ExceptionMode exceptionMode) {
        return new ErrorMiddlewareImpl(exceptionFactory, exceptionMode);
    }
}
