
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class BadRequestException extends ApiClientException {
    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request) {
        super(statusCode, body, headers, message, response, request);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, serializer);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request,
            final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, request, serializer);
    }
}
