package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.ApiHttpHeaders;

@Deprecated
public class LoggerMessage {

    private String url;
    private String method;
    private ApiHttpHeaders requestHeaders;
    private String requestBody;
    private int responseStatusCode;
    private ApiHttpHeaders responseHeaders;
    private String responseBody;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public int getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(int responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public ApiHttpHeaders getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(ApiHttpHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public ApiHttpHeaders getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(ApiHttpHeaders responseHeaders) {
        this.responseHeaders = responseHeaders;
    }
}
