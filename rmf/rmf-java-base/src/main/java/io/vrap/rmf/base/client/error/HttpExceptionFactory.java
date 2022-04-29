
package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.http.HttpStatusCode;

public interface HttpExceptionFactory {

    ResponseSerializer getResponseSerializer();

    public default ApiHttpException create(final ApiHttpRequest request, final ApiHttpResponse<byte[]> response) {
        if (response.getStatusCode() >= HttpStatusCode.INTERNAL_SERVER_ERROR_500) {
            return createServerException(request, response);
        }
        return createClientException(request, response);
    }

    public default ApiHttpException createServerException(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) {
        final ResponseSerializer serializer = getResponseSerializer();
        String message = "Server error response [url] " + request.getUri().toString() + " [status code] "
                + response.getStatusCode() + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case HttpStatusCode.INTERNAL_SERVER_ERROR_500:
                return new InternalServerErrorException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.BAD_GATEWAY_502:
                return new BadGatewayException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.SERVICE_UNAVAILABLE_503:
                return new ServiceUnavailableException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.GATEWAY_TIMEOUT_504:
                return new GatewayTimeoutException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
        }
        return new ApiServerException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(),
            message, response, request);
    }

    public default ApiHttpException createClientException(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
        final ResponseSerializer serializer = getResponseSerializer();
        String message = "Client error response [url] " + request.getUri().toString() + " [status code] "
                + response.getStatusCode() + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case HttpStatusCode.BAD_REQUEST_400:
                return new BadRequestException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.UNAUTHORIZED_401:
                return new UnauthorizedException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.FORBIDDEN_403:
                return new ForbiddenException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.NOT_FOUND_404:
                return new NotFoundException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
            case HttpStatusCode.CONFLICT_409:
                return new ConcurrentModificationException(response.getStatusCode(), new String(response.getBody()),
                    request.getHeaders(), message, response, request, serializer);
        }
        return new ApiClientException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(),
            message, response, request);
    }

    public static HttpExceptionFactory of(final ResponseSerializer serializer) {
        return new DefaultHttpExceptionFactory(serializer);
    }
}
