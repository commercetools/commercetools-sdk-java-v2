
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class ExceptionFactory {
    @Deprecated
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

    @Deprecated
    public static ApiHttpException createServerException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) {
        return createServerException(request, response, ResponseSerializer.of());
    }

    public static ApiHttpException createServerException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response, final ResponseSerializer serializer) {
        String message = "Server error response [url] " + request.getUri().toString() + " [status code] "
                + response.getStatusCode() + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case 500:
                return new InternalServerErrorException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 502:
                return new BadGatewayException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 503:
                return new ServiceUnavailableException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 504:
                return new GatewayTimeoutException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
        }
        return new ApiServerException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(),
            message, response, request);
    }

    @Deprecated
    public static ApiHttpException createClientException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) {
        return createClientException(request, response, ResponseSerializer.of());
    }

    public static ApiHttpException createClientException(ApiHttpRequest request, ApiHttpResponse<byte[]> response,
            final ResponseSerializer serializer) {
        String message = "Client error response [url] " + request.getUri().toString() + " [status code] "
                + response.getStatusCode() + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case 400:
                return new BadRequestException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 401:
                return new UnauthorizedException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 403:
                return new ForbiddenException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 404:
                return new NotFoundException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case 409:
                return new ConcurrentModificationException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
        }
        return new ApiClientException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(),
            message, response, request);
    }
}
