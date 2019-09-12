package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public final class MiddlewareArg {

    private final ApiHttpRequest request;
    private final ApiHttpResponse<byte[]> response;
    private final Throwable error;
    private final Middleware next;

    private MiddlewareArg(ApiHttpRequest request, ApiHttpResponse<byte[]> response, Throwable error, Middleware next) {
        this.request = request;
        this.response = response;
        this.error = error;
        this.next = next;
    }

    public static MiddlewareArg from(ApiHttpRequest request, ApiHttpResponse<byte[]> response, Throwable error, Middleware next) {
        return new MiddlewareArg(request, response, error, next);
    }

    public static MiddlewareArg from(ApiHttpRequest request) {
        return MiddlewareArg.from(request, null, null, null);
    }


    public ApiHttpRequest getRequest() {
        return request;
    }

    public ApiHttpResponse<byte[]> getResponse() {
        return response;
    }

    public Throwable getError() {
        return error;
    }

    public Middleware getNext() {
        return next;
    }
}
