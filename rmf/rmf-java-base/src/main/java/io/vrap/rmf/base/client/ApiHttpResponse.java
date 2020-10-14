package io.vrap.rmf.base.client;

public class ApiHttpResponse<U> {

    private int statusCode;
    private ApiHttpHeaders headers;
    private U body;
    private String message;

    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, U body) {
        this(statusCode, headers, body, null);
    }

    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, U body, String message) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }

    public U getBody() {
        return body;
    }

    public void setBody(U body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
