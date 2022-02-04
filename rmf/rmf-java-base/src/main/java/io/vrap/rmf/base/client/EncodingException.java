
package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.error.BaseException;

public class EncodingException extends BaseException {
    public EncodingException(final Throwable cause) {
        super(cause);
    }

    public EncodingException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
