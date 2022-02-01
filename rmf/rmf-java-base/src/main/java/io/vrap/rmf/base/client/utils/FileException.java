
package io.vrap.rmf.base.client.utils;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.BaseException;

public class FileException extends BaseException {
    private static final long serialVersionUID = 0L;

    public FileException(final Throwable cause) {
        super(cause);
    }

    public FileException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public <T> FileException(final ApiHttpResponse<T> httpResponse) {
        super(httpResponse.toString());
    }
}
