package io.vrap.rmf.base.client;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class ApiHttpRequest extends Base  {

    private ApiHttpMethod method;
    private URI uri;
    private ApiHttpHeaders headers;
    private byte[] body;


    public ApiHttpRequest() {

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
    }

    public ApiHttpMethod getMethod() {
        return method;
    }

    public void setMethod(ApiHttpMethod method) {
        this.method = method;
    }

    public ApiHttpHeaders getHeaders() {
        if (headers == null) {
            this.headers = new ApiHttpHeaders();
        }
        return headers;
    }


    public void setHeaders(ApiHttpHeaders headers) {
        this.headers = headers;
    }

    public ApiHttpRequest addHeader(String key, String value) {
        this.headers = getHeaders().addHeader(key, value);

        return this;
    }

    public ApiHttpRequest withHeader(String key, String value) {
        this.headers = getHeaders().withHeader(key, value);

        return this;
    }

    public ApiHttpRequest withoutHeader(String key) {
        this.headers = getHeaders().withoutHeader(key);

        return this;
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

    public URI getUri() {
        return uri;
    }

    public URL getUrl() {
        try {
            return uri.toURL();
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Malformed URI", e);
        }
    }

    public void setUri(String uri) {
        this.uri = URI.create(uri);
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public ApiHttpRequest resolve(URI baseUri)
    {
        ApiHttpRequest request = new ApiHttpRequest(this);
        request.setUri(baseUri.resolve(this.uri));
        return request;
    }

    @Override
    public String toString() {
        String textInterpretedBody = "";
        try {
            textInterpretedBody = Optional.ofNullable(body).map(b -> tryToFilter(new String(b, StandardCharsets.UTF_8))).orElse("empty body");
        } catch (final Exception e) {
            textInterpretedBody = "not parseable: " + e;
        }

        return new ToStringBuilder(this)
                .append("method", method)
                .append("uri", "\"" + uri + "\"")
                .append("headers", headers)
                .append("textInterpretedBody", textInterpretedBody)
                .toString();
    }

    static String tryToFilter(final String input) {
        return input.replaceAll("(\"\\w*([Pp]ass|access_token|refresh_token)\\w*\"):\"[^\"]*\"", "$1:\"**removed from output**\"");
    }
}
