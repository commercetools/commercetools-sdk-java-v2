
package io.vrap.rmf.base.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApiHttpRequest extends Base implements ContextAware<ApiHttpRequest> {

    private ApiHttpMethod method;
    private URI uri;
    private ApiHttpHeaders headers;
    private byte[] body;

    private Map<Object, Object> contextMap = new HashMap<>();

    public ApiHttpRequest() {
    }

    public ApiHttpRequest(final ApiHttpMethod method, final URI uri, final ApiHttpHeaders headers, final byte[] body,
            final Map<Object, Object> contextMap) {
        this.method = method;
        this.uri = uri;
        this.headers = headers;
        this.body = body;
        this.contextMap = contextMap;
    }

    public ApiHttpRequest(final ApiHttpMethod method, final URI uri, final ApiHttpHeaders headers, final byte[] body) {
        this.method = method;
        this.uri = uri;
        this.headers = headers;
        this.body = body;
    }

    public ApiHttpRequest(final ApiHttpRequest r) {
        this.method = r.method;
        this.uri = r.uri;
        this.headers = r.headers;
        this.body = r.body;
        this.contextMap = r.contextMap;
    }

    public Map<Object, Object> getContextMap() {
        return contextMap;
    }

    public ApiHttpRequest withContextMap(final Map<Object, Object> contextMap) {
        final ApiHttpRequest request = copy();
        request.contextMap = new HashMap<>(contextMap);

        return request;
    }

    @SuppressWarnings("unchecked")
    public <T> T getContext(Class<T> key) {
        return (T) contextMap.get(key);
    }

    public <T> ApiHttpRequest addContext(T value) {
        final ApiHttpRequest request = copy();
        final Map<Object, Object> contextMap = new HashMap<>(request.contextMap);
        contextMap.put(value.getClass(), value);
        request.contextMap = contextMap;

        return request;
    }

    public Object getContext(Object key) {
        return contextMap.get(key);
    }

    public ApiHttpRequest addContext(Object key, Object value) {
        final ApiHttpRequest request = copy();
        final Map<Object, Object> contextMap = new HashMap<>(request.contextMap);
        contextMap.put(key, value);
        request.contextMap = contextMap;

        return request;
    }

    public ApiHttpMethod getMethod() {
        return method;
    }

    public ApiHttpRequest withMethod(final ApiHttpMethod method) {
        ApiHttpRequest request = copy();
        request.method = method;

        return request;
    }

    public ApiHttpHeaders getHeaders() {
        if (headers == null) {
            this.headers = new ApiHttpHeaders();
        }
        return headers;
    }

    public ApiHttpRequest addHeader(final String key, final String value) {
        ApiHttpRequest request = copy();
        request.headers = getHeaders().addHeader(key, value);

        return request;
    }

    public ApiHttpRequest withHeaders(final ApiHttpHeaders headers) {
        ApiHttpRequest request = copy();
        request.headers = headers;
        return request;
    }

    public ApiHttpRequest withHeader(final String key, final String value) {
        ApiHttpRequest request = copy();
        request.headers = getHeaders().withHeader(key, value);

        return request;
    }

    public ApiHttpRequest withoutHeader(final String key) {
        ApiHttpRequest request = copy();
        request.headers = getHeaders().withoutHeader(key);

        return request;
    }

    public byte[] getBody() {
        return body;
    }

    public ApiHttpRequest withBody(final byte[] body) {
        ApiHttpRequest request = copy();
        request.body = body;
        return request;
    }

    public ApiHttpRequest withBody(final String body) {
        ApiHttpRequest request = copy();
        if (body == null) {
            request.body = null;
        }
        else {
            request.body = body.getBytes(StandardCharsets.UTF_8);
        }

        return request;
    }

    public URI getUri() {
        return uri;
    }

    public URL getUrl() {
        try {
            return uri.toURL();
        }
        catch (MalformedURLException e) {
            throw new IllegalStateException("Malformed URI", e);
        }
    }

    public ApiHttpRequest withUri(final String uri) {
        ApiHttpRequest request = copy();
        request.uri = URI.create(uri);
        return request;
    }

    public ApiHttpRequest withUri(final URI uri) {
        ApiHttpRequest request = copy();
        request.uri = uri;

        return request;
    }

    public ApiHttpRequest resolve(final URI baseUri) {
        return withUri(baseUri.resolve(this.uri));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("method", method)
                .append("uri", "\"" + uri + "\"")
                .append("headers", headers)
                .append("textInterpretedBody", getSecuredBody())
                .toString();
    }

    public String getSecuredBody() {
        return Optional.ofNullable(body)
                .map(b -> tryToFilter(new String(b, StandardCharsets.UTF_8)))
                .orElse("empty body");
    }

    static String tryToFilter(final String input) {
        return input.replaceAll("(\"\\w*([Pp]ass|access_token|refresh_token)\\w*\"):\"[^\"]*\"",
            "$1:\"**removed from output**\"");
    }

    private ApiHttpRequest copy() {
        return new ApiHttpRequest(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApiHttpRequest request = (ApiHttpRequest) o;

        return new EqualsBuilder().append(method, request.method)
                .append(uri, request.uri)
                .append(headers, request.headers)
                .append(body, request.body)
                .append(contextMap, request.contextMap)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(method)
                .append(uri)
                .append(headers)
                .append(body)
                .append(contextMap)
                .toHashCode();
    }
}
