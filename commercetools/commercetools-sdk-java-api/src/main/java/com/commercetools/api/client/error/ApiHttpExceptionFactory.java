
package com.commercetools.api.client.error;

import java.util.Optional;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.error.*;

/**
 * Creates an exception bases on the status code of the {@link ApiHttpResponse} with module specific exception for
 * {@link BadRequestException} and {@link ConcurrentModificationException}
 */
public class ApiHttpExceptionFactory implements HttpExceptionFactory {
    private final ResponseSerializer responseSerializer;

    public ApiHttpExceptionFactory(ResponseSerializer serializer) {
        this.responseSerializer = serializer;
    }

    public ResponseSerializer getResponseSerializer() {
        return responseSerializer;
    }

    @Override
    public ApiHttpException createClientException(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
        final ResponseSerializer serializer = getResponseSerializer();
        String message = "Client error response [url] " + request.getUri().toString() + " [status code] "
                + response.getStatusCode() + " [reason phrase] " + response.getMessage();

        final String body = Optional.ofNullable(response.getBody()).map(String::new).orElse("");
        switch (response.getStatusCode()) {
            case 400:
                return new BadRequestException(response.getStatusCode(), body, request.getHeaders(), message, response,
                    request, serializer);
            case 401:
                return new UnauthorizedException(response.getStatusCode(), body, request.getHeaders(), message,
                    response, request, serializer);
            case 403:
                return new ForbiddenException(response.getStatusCode(), body, request.getHeaders(), message, response,
                    request, serializer);
            case 404:
                return new NotFoundException(response.getStatusCode(), body, request.getHeaders(), message, response,
                    request, serializer);
            case 409:
                return new ConcurrentModificationException(response.getStatusCode(), body, request.getHeaders(),
                    message, response, request, serializer);
        }
        return new ApiClientException(response.getStatusCode(), body, response.getHeaders(), message, response,
            request);
    }

    public static HttpExceptionFactory of(ResponseSerializer serializer) {
        return new ApiHttpExceptionFactory(serializer);
    }
}
