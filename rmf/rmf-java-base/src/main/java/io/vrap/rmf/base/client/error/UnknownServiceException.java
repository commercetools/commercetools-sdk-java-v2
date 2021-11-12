
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpResponse;

public class UnknownServiceException extends BaseException {
    private static final long serialVersionUID = 0L;

    public UnknownServiceException(final Throwable cause) {
        super(cause);
    }

    public UnknownServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public <T> UnknownServiceException(final ApiHttpResponse<T> httpResponse) {
        super(httpResponse.toString());
    }
}
