
package com.commercetools.http.apachehttp;

/**
 * Exception which is thrown by {@link org.apache.hc.client5.http.async.HttpAsyncClient}.
 *
 * <p>Typical problems are timeouts, connection problems and problems with the DNS configuration.</p>
 */
public class HttpException extends RuntimeException {
    private static final long serialVersionUID = 0L;

    public HttpException(final Throwable cause) {
        super(cause);
    }

    public HttpException(final String message) {
        super(message);
    }

    public HttpException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
