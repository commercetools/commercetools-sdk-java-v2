
package io.vrap.rmf.base.client.error;

public class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(final String message) {
        super(message);
    }

    public BaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BaseException(final Throwable cause) {
        super(cause);
    }

    public BaseException(final String message, final Throwable cause, final boolean enableSuppression,
            final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
