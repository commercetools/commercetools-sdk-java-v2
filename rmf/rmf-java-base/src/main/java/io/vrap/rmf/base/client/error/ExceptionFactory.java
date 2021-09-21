
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

/**
 * @deprecated use {@link HttpExceptionFactory} instead
 */
@Deprecated
public class ExceptionFactory {
    public static ApiHttpException create(final ApiHttpRequest request, final ApiHttpResponse<byte[]> response) {
        if (response.getStatusCode() >= 500) {
            return createServerException(request, response);
        }
        return createClientException(request, response);
    }

    public static ApiHttpException create(final ApiHttpRequest request, final ApiHttpResponse<byte[]> response,
            final ResponseSerializer serializer) {
        if (response.getStatusCode() >= 500) {
            return createServerException(request, response, serializer);
        }
        return createClientException(request, response, serializer);
    }

    public static ApiHttpException createServerException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) {
        return createServerException(request, response, ResponseSerializer.of());
    }

    public static ApiHttpException createServerException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        return HttpExceptionFactory.of(serializer).createServerException(request, response);
    }

    public static ApiHttpException createClientException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) {
        return createClientException(request, response, ResponseSerializer.of());
    }

    public static ApiHttpException createClientException(ApiHttpRequest request, ApiHttpResponse<byte[]> response,
            final ResponseSerializer serializer) {
        return HttpExceptionFactory.of(serializer).createClientException(request, response);
    }
}
