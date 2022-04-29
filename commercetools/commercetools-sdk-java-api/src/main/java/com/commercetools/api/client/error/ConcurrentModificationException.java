
package com.commercetools.api.client.error;

import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.ErrorResponse;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class ConcurrentModificationException extends io.vrap.rmf.base.client.error.ConcurrentModificationException
        implements ErrorResponseException {
    private final ErrorResponse errorResponse;
    private final Long currentVersion;

    public ConcurrentModificationException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
        errorResponse = getBodyAs(ErrorResponse.class);
        currentVersion = retrieveCurrentVersion(errorResponse);
    }

    public ConcurrentModificationException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, ApiHttpResponse<byte[]> response, ApiHttpRequest request) {
        super(statusCode, body, headers, message, response, request);
        errorResponse = getBodyAs(ErrorResponse.class);
        currentVersion = retrieveCurrentVersion(errorResponse);
    }

    public ConcurrentModificationException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, serializer);
        errorResponse = getBodyAs(ErrorResponse.class);
        currentVersion = retrieveCurrentVersion(errorResponse);
    }

    public ConcurrentModificationException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request,
            final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, request, serializer);
        errorResponse = getBodyAs(ErrorResponse.class);
        currentVersion = retrieveCurrentVersion(errorResponse);
    }

    @Override
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public Long getCurrentVersion() {
        return currentVersion;
    }

    public static Long retrieveCurrentVersion(final ErrorResponse errorResponse) {
        return errorResponse.getErrors()
                .stream()
                .filter(errorObject -> errorObject instanceof ConcurrentModificationError)
                .findFirst()
                .map(errorObject -> ((ConcurrentModificationError) errorObject).getCurrentVersion())
                .orElse(null);
    }
}
