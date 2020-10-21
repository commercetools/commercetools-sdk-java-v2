package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpHeaders;

public class BadGatewayException extends ApiServerException {
    public BadGatewayException(int statusCode, String body, ApiHttpHeaders headers, String message) {
        super(statusCode, body, headers, message);
    }
}
