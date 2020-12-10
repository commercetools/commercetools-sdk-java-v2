package io.vrap.rmf.base.client.error;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class ExceptionFactory {
    public static ApiHttpException create(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
        if (response.getStatusCode() >= 500) {
            return createServerException(request, response);
        }
        return createClientException(request, response);
    }

    public static ApiHttpException createServerException(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
        String message = "Server error response [url] " + request.getUri().toString()
                + " [status code] " + response.getStatusCode()
                + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case 500:
                return new InternalServerErrorException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 502:
                return new BadGatewayException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 503:
                return new ServiceUnavailableException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 504:
                return new GatewayTimeoutException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
        }
        return new ApiServerException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(), message, response, request);
    }

    public static ApiHttpException createClientException(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
        String message = "Client error response [url] " + request.getUri().toString()
                + " [status code] " + response.getStatusCode()
                + " [reason phrase] " + response.getMessage();

        switch (response.getStatusCode()) {
            case 400:
                return new BadRequestException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 401:
                return new UnauthorizedException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 403:
                return new ForbiddenException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 404:
                return new NotFoundException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
            case 409:
                return new ConcurrentModificationException(response.getStatusCode(), new String(response.getBody()), request.getHeaders(), message, response, request);
        }
        return new ApiClientException(response.getStatusCode(), new String(response.getBody()), response.getHeaders(), message, response, request);
    }
}
