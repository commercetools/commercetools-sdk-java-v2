
package io.vrap.rmf.base.client;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ApiHttpHeaderTest {

    @Test
    public void testImmutableWithHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders();

        ApiHttpHeaders newHeaders = headers.withHeader("foo", "bar");

        Assert.assertEquals(1, newHeaders.getHeaders().size());
        Assert.assertEquals(0, headers.getHeaders().size());
        Assert.assertEquals("bar", newHeaders.getFirst("foo"));
        Assert.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableWithoutHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "bar");

        ApiHttpHeaders newHeaders = headers.withoutHeader("foo");

        Assert.assertEquals(0, newHeaders.getHeaders().size());
        Assert.assertEquals(1, headers.getHeaders().size());
        Assert.assertEquals("bar", headers.getFirst("foo"));
        Assert.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableAddHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        ApiHttpHeaders newHeaders = headers.addHeader("bar", "bar");

        Assert.assertEquals(2, newHeaders.getHeaders().size());
        Assert.assertEquals(1, headers.getHeaders().size());
        Assert.assertNull(headers.getFirst("bar"));
        Assert.assertEquals("bar", newHeaders.getFirst("bar"));
        Assert.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableWithHeaders() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        ApiHttpHeaders newHeaders = headers.withHeaders(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assert.assertEquals(1, newHeaders.getHeaders().size());
        Assert.assertEquals(1, headers.getHeaders().size());

        Assert.assertNull(headers.getFirst("bar"));
        Assert.assertNull(newHeaders.getFirst("foo"));

        Assert.assertEquals("foo", headers.getFirst("foo"));
        Assert.assertEquals("bar", newHeaders.getFirst("bar"));
        Assert.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableGetHeaders() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        final List<Map.Entry<String, String>> headers1 = headers.getHeaders();
        headers1.add(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assert.assertEquals(1, headers.getHeaders().size());

        Assert.assertNull(headers.getFirst("bar"));
        Assert.assertEquals("foo", headers.getFirst("foo"));
        Assert.assertNotEquals(headers.getHeaders(), headers1);
    }

    @Test
    public void testImmutableGetHeadersByKey() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        final List<Map.Entry<String, String>> headers1 = headers.getHeaders("foo");
        headers1.add(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assert.assertEquals(1, headers.getHeaders().size());

        Assert.assertNull(headers.getFirst("bar"));
        Assert.assertEquals("foo", headers.getFirst("foo"));
        Assert.assertNotEquals(headers.getHeaders(), headers1);
    }
}
