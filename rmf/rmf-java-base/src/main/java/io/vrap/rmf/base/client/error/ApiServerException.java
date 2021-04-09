
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.*;

public class ApiServerException extends ApiHttpException {
    public ApiServerException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }

    public ApiServerException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request) {
        super(statusCode, body, headers, message, response, request);
    }

    public ApiServerException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, serializer);
    }

    public ApiServerException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request,
            final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, request, serializer);
    }
}
