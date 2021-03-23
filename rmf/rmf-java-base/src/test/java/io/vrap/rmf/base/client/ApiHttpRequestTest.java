
package io.vrap.rmf.base.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

public class ApiHttpRequestTest {

    @Test
    public void testImmutableMethod() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null);

        ApiHttpRequest newRequest = request.withMethod(ApiHttpMethod.GET);

        Assert.assertEquals(ApiHttpMethod.POST, request.getMethod());
        Assert.assertEquals(ApiHttpMethod.GET, newRequest.getMethod());
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableUriString() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/foo"), null, null);

        ApiHttpRequest newRequest = request.withUri("/bar");

        Assert.assertEquals("/foo", request.getUri().toString());
        Assert.assertEquals("/bar", newRequest.getUri().toString());
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableUri() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/foo"), null, null);

        ApiHttpRequest newRequest = request.withUri(URI.create("/bar"));

        Assert.assertEquals("/foo", request.getUri().toString());
        Assert.assertEquals("/bar", newRequest.getUri().toString());
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableBody() {

        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null,
            "foo".getBytes(StandardCharsets.UTF_8));

        ApiHttpRequest newRequest = request.withBody("bar");

        Assert.assertEquals("foo", request.getSecuredBody());
        Assert.assertEquals("bar", newRequest.getSecuredBody());
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableAddHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.addHeader("foo", "bar");

        Assert.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assert.assertEquals(2, newRequest.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", newRequest.getHeaders().getHeaders("foo").get(0).getValue());
        Assert.assertEquals("bar", newRequest.getHeaders().getHeaders("foo").get(1).getValue());
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withHeader("foo", "bar");

        Assert.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assert.assertEquals(1, newRequest.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("bar", newRequest.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithoutHeader() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withoutHeader("foo");

        Assert.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assert.assertEquals(0, newRequest.getHeaders().getHeaders("foo").size());
        Assert.assertNull(newRequest.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableWithHeaders() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, null, null, null).withHeader("foo", "foo");

        ApiHttpRequest newRequest = request.withHeaders(new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "bar")));

        Assert.assertEquals(1, request.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", request.getHeaders().getFirst("foo"));
        Assert.assertEquals(1, newRequest.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("bar", newRequest.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(request, newRequest);
    }

    @Test
    public void testImmutableResolve() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/test"), null, null);

        ApiHttpRequest newRequest = request.resolve(URI.create("https://example.com/"));

        Assert.assertEquals("/test", request.getUri().toString());
        Assert.assertEquals("https://example.com/test", newRequest.getUri().toString());
        Assert.assertNotEquals(request, newRequest);
    }

    public void testImmutableGetHeaders() {
        ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST, URI.create("/test"), null, null)
                .withHeader("foo", "foo");

        request.getHeaders().addHeader("foo", "bar");

        Assert.assertEquals(1, request.getHeaders().getHeaders("foo").size());
    }
}
