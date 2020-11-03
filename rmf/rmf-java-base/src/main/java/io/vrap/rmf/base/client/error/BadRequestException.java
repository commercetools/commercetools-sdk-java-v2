package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class BadRequestException extends ApiClientException {
    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers, final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }
}
