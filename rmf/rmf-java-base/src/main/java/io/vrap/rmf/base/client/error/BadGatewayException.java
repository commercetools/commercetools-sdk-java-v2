package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class BadGatewayException extends ApiServerException {
    public BadGatewayException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }
}
