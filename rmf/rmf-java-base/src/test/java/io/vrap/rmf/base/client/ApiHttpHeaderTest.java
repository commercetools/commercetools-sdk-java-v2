
package io.vrap.rmf.base.client;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiHttpHeaderTest {

    @Test
    public void testImmutableWithHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders();

        ApiHttpHeaders newHeaders = headers.withHeader("foo", "bar");

        Assertions.assertEquals(1, newHeaders.getHeaders().size());
        Assertions.assertEquals(0, headers.getHeaders().size());
        Assertions.assertEquals("bar", newHeaders.getFirst("foo"));
        Assertions.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableWithoutHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "bar");

        ApiHttpHeaders newHeaders = headers.withoutHeader("foo");

        Assertions.assertEquals(0, newHeaders.getHeaders().size());
        Assertions.assertEquals(1, headers.getHeaders().size());
        Assertions.assertEquals("bar", headers.getFirst("foo"));
        Assertions.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableAddHeader() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        ApiHttpHeaders newHeaders = headers.addHeader("bar", "bar");

        Assertions.assertEquals(2, newHeaders.getHeaders().size());
        Assertions.assertEquals(1, headers.getHeaders().size());
        Assertions.assertNull(headers.getFirst("bar"));
        Assertions.assertEquals("bar", newHeaders.getFirst("bar"));
        Assertions.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableWithHeaders() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        ApiHttpHeaders newHeaders = headers.withHeaders(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assertions.assertEquals(1, newHeaders.getHeaders().size());
        Assertions.assertEquals(1, headers.getHeaders().size());

        Assertions.assertNull(headers.getFirst("bar"));
        Assertions.assertNull(newHeaders.getFirst("foo"));

        Assertions.assertEquals("foo", headers.getFirst("foo"));
        Assertions.assertEquals("bar", newHeaders.getFirst("bar"));
        Assertions.assertNotEquals(headers, newHeaders);
    }

    @Test
    public void testImmutableGetHeaders() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        final List<Map.Entry<String, String>> headers1 = headers.getHeaders();
        headers1.add(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assertions.assertEquals(1, headers.getHeaders().size());

        Assertions.assertNull(headers.getFirst("bar"));
        Assertions.assertEquals("foo", headers.getFirst("foo"));
        Assertions.assertNotEquals(headers.getHeaders(), headers1);
    }

    @Test
    public void testImmutableGetHeadersByKey() {
        ApiHttpHeaders headers = new ApiHttpHeaders().withHeader("foo", "foo");

        final List<Map.Entry<String, String>> headers1 = headers.getHeaders("foo");
        headers1.add(ApiHttpHeaders.headerEntry("bar", "bar"));

        Assertions.assertEquals(1, headers.getHeaders().size());

        Assertions.assertNull(headers.getFirst("bar"));
        Assertions.assertEquals("foo", headers.getFirst("foo"));
        Assertions.assertNotEquals(headers.getHeaders(), headers1);
    }
}
