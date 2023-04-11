
package io.vrap.rmf.base.client;

public class DeserializationException extends RuntimeException {
    public DeserializationException(final String message) {
        super(message);
    }

    public DeserializationException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
}
