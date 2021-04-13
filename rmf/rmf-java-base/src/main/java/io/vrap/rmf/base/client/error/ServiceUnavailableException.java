
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class ServiceUnavailableException extends ApiServerException {
    public ServiceUnavailableException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response) {
        super(statusCode, body, headers, message, response);
    }

    public ServiceUnavailableException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request) {
        super(statusCode, body, headers, message, response, request);
    }

    public ServiceUnavailableException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, serializer);
    }

    public ServiceUnavailableException(final int statusCode, final String body, final ApiHttpHeaders headers,
            final String message, final ApiHttpResponse<byte[]> response, final ApiHttpRequest request,
            final ResponseSerializer serializer) {
        super(statusCode, body, headers, message, response, request, serializer);
    }
}
