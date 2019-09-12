package io.vrap.rmf.base.client;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

public class ApiHttpRequest {

    private ApiHttpMethod method;
    private String relativeUrl;
    private String baseUrl;
    private ApiHttpHeaders headers;
    private byte[] body;

    public ApiHttpRequest() {

    }

    public ApiHttpRequest(ApiHttpMethod method, String relativeUrl, String baseUrl, ApiHttpHeaders headers, byte[] body) {
        this.method = method;
        this.relativeUrl = relativeUrl;
        this.baseUrl = baseUrl;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpMethod getMethod() {
        return method;
    }

    public void setMethod(ApiHttpMethod method) {
        this.method = method;
    }

    public ApiHttpHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }

    public void addHeader(String key, String value) {
        if (this.headers == null) {
            this.headers = new ApiHttpHeaders();
        }
        this.headers.addHeader(key, value);
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public void setBody(String body) {
        if (body == null) {
            this.body = null;
            return;
        }
        setBody(body.getBytes());
    }

    public String getRelativeUrl() {
        return relativeUrl;
    }

    public void setRelativeUrl(String relativeUrl) {
        this.relativeUrl = relativeUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String fullUrl() {
        if (getBaseUrl() == null) {
            throw new IllegalStateException("base url should be set");
        }
        if (getRelativeUrl() == null) {
            return getBaseUrl();
        }
        return getBaseUrl() + getRelativeUrl();
    }
}
