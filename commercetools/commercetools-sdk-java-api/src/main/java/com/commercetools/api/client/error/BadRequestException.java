
package com.commercetools.api.client.error;

import com.commercetools.api.models.error.ErrorResponse;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class BadRequestException extends io.vrap.rmf.base.client.error.BadRequestException
        implements ErrorResponseException {
    private final ErrorResponse errorResponse;

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
        errorResponse = getBodyAs(ErrorResponse.class);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request) {
        super(statusCode, body, headers, message, response, request);
        errorResponse = getBodyAs(ErrorResponse.class);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, serializer);
        errorResponse = getBodyAs(ErrorResponse.class);
    }

    public BadRequestException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request,
            final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, request, serializer);
        errorResponse = getBodyAs(ErrorResponse.class);
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
