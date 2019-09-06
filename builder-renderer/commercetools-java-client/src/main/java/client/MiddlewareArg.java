package client;

public final class MiddlewareArg {

    private final ApiHttpRequest request;
    private final ApiHttpResponse response;
    private final Exception error;
    private final Middleware next;

    private MiddlewareArg(ApiHttpRequest request, ApiHttpResponse response, Exception error, Middleware next) {
        this.request = request;
        this.response = response;
        this.error = error;
        this.next = next;
    }

    public static MiddlewareArg from(ApiHttpRequest request, ApiHttpResponse response, Exception error, Middleware next) {
        return new MiddlewareArg(request, response, error, next);
    }

    public static MiddlewareArg from(ApiHttpRequest request) {
        return MiddlewareArg.from(request, null, null, null);
    }


    public ApiHttpRequest getRequest() {
        return request;
    }

    public ApiHttpResponse getResponse() {
        return response;
    }

    public Exception getError() {
        return error;
    }

    public Middleware getNext() {
        return next;
    }
}
