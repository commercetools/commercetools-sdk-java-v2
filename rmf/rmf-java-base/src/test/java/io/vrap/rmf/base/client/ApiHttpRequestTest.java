
package io.vrap.rmf.base.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiHttpRequestTest {

    @Test
    public void testImmutableMethod() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null);

        ApiHttpRequest newRequest = request.withMethod(ApiHttpMethod.GET);

        Assertions.assertEquals(ApiHttpMethod.POST, request.getMethod());
        Assertions.assertEquals(ApiHttpMethod.GET, newRequest.getMethod());
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableUriString() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/foo"), null, null);

        ApiHttpRequest newRequest = request.withUri("/bar");

        Assertions.assertEquals("/foo", request.getUri().toString());
        Assertions.assertEquals("/bar", newRequest.getUri().toString());
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableUri() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/foo"), null, null);

        ApiHttpRequest newRequest = request.withUri(URI.create("/bar"));

        Assertions.assertEquals("/foo", request.getUri().toString());
        Assertions.assertEquals("/bar", newRequest.getUri().toString());
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableBody() {

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null,
            "foo".getBytes(StandardCharsets.UTF_8));

        ApiHttpRequest newRequest = request.withBody("bar");

        Assertions.assertEquals("foo", request.getSecuredBody());
        Assertions.assertEquals("bar", newRequest.getSecuredBody());
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableAddHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.addHeader("foo", "bar");

        Assertions.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assertions.assertEquals(2, newRequest.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", newRequest.getHeaders().getHeaders("foo").get(0).getValue());
        Assertions.assertEquals("bar", newRequest.getHeaders().getHeaders("foo").get(1).getValue());
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withHeader("foo", "bar");

        Assertions.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assertions.assertEquals(1, newRequest.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("bar", newRequest.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithoutHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withoutHeader("foo");

        Assertions.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assertions.assertEquals(0, newRequest.getHeaders().getHeaders("foo").size());
        Assertions.assertNull(newRequest.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithHeaders() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withHeaders(new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "bar")));

        Assertions.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assertions.assertEquals(1, newRequest.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("bar", newRequest.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableResolve() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/test"), null, null);

        ApiHttpRequest newRequest = request.resolve(URI.create("https://example.com/"));

        Assertions.assertEquals("/test", request.getUri().toString());
        Assertions.assertEquals("https://example.com/test", newRequest.getUri().toString());
        Assertions.assertNotEquals(request, newRequest);
    }

    public void testImmutableGetHeaders() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/test"), null, null)
                .withHeader("foo", "foo");

        request.getHeaders().addHeader("foo", "bar");

        Assertions.assertEquals(1, request.getHeaders().getHeaders("foo").size());
    }
}
