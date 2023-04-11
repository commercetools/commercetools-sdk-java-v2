
package io.vrap.rmf.base.client;

public class SerializationException extends RuntimeException {
    public SerializationException(final String message) {
        super(message);
    }

    public SerializationException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
}
