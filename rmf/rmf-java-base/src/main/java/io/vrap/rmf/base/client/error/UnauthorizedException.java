package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;

public class UnauthorizedException extends ApiClientException {
    public UnauthorizedException(int statusCode, String body, ApiHttpHeaders headers, String message) {
        super(statusCode, body, headers, message);
    }
}
