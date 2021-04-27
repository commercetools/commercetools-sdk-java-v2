
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpRequest;

import java.util.concurrent.TimeoutException;

public class RmfTimeoutException extends BaseException {
    private final ApiHttpRequest request;

    public RmfTimeoutException(final TimeoutException cause) {
        super(cause.getMessage(), cause);
        request = null;
    }

    public RmfTimeoutException(final TimeoutException cause, final ApiHttpRequest request) {
        super(cause.getMessage(), cause);
        this.request = request;
    }

    public ApiHttpRequest getRequest() {
        return request;
    }
}
