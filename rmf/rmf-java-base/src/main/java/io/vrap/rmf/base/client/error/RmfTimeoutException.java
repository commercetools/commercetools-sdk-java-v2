package io.vrap.rmf.base.client.error;

import java.util.concurrent.TimeoutException;

public class RmfTimeoutException extends BaseException {
    public RmfTimeoutException(final TimeoutException cause) {
        super(cause.getMessage(), cause);
    }
}
