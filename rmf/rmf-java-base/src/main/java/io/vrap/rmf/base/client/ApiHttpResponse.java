package io.vrap.rmf.base.client;

public class ApiHttpResponse<U> {
    
    private int statusCode;
    private ApiHttpHeaders headers;
    private U body;
    
    public ApiHttpResponse(int statusCode, ApiHttpHeaders headers, U body) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
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
}
