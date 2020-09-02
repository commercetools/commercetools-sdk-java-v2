package io.vrap.rmf.base.client;

import java.net.URI;

public class ApiHttpRequest {

    private ApiHttpMethod method;
    private URI uri;
//    @Deprecated
    private String relativeUrl;
//    @Deprecated
    private String baseUrl;
    private ApiHttpHeaders headers;
    private byte[] body;


    public ApiHttpRequest() {

    }

//    @Deprecated
    public ApiHttpRequest(ApiHttpMethod method, String relativeUrl, String baseUrl, ApiHttpHeaders headers, byte[] body) {
        this.method = method;
        this.relativeUrl = relativeUrl;
        this.baseUrl = baseUrl;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpRequest(ApiHttpMethod method, URI uri, ApiHttpHeaders headers, byte[] body) {
        this.method = method;
        this.uri = uri;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpRequest(ApiHttpRequest r) {
        this.method = r.method;
        this.uri = r.uri;
        this.headers = r.headers;
        this.body = r.body;
        this.relativeUrl = r.relativeUrl;
        this.baseUrl = r.baseUrl;
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

//    @Deprecated
    public String getRelativeUrl() {
        return relativeUrl;
    }

//    @Deprecated
    public void setRelativeUrl(String relativeUrl) {
        this.relativeUrl = relativeUrl;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

//    @Deprecated
    public String getBaseUrl() {
        return baseUrl;
    }

//    @Deprecated
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

    public ApiHttpRequest resolve(URI baseUri)
    {
        ApiHttpRequest request = new ApiHttpRequest(this);
        request.setUri(baseUri.resolve(this.uri));
        return request;
    }
}
