
package io.vrap.rmf.base.client;

import java.nio.charset.StandardCharsets;

import io.vrap.rmf.base.client.http.HttpStatusCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiHttpResponseTest {

    @Test
    public void testImmutableStatusCode() {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, null, null);

        ApiHttpResponse<byte[]> newResponse = response.withStatusCode(201);

        Assertions.assertEquals(HttpStatusCode.OK_200, response.getStatusCode());
        Assertions.assertEquals(HttpStatusCode.CREATED_201, newResponse.getStatusCode());
        Assertions.assertNotEquals(response, newResponse);

    }

    @Test
    public void testImmutableMessage() {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, null, "foo");

        ApiHttpResponse<byte[]> newResponse = response.withMessage("bar");

        Assertions.assertEquals("foo", response.getMessage());
        Assertions.assertEquals("bar", newResponse.getMessage());
        Assertions.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableBody() {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, "foo".getBytes(StandardCharsets.UTF_8),
            null);

        ApiHttpResponse<byte[]> newResponse = response.withBody("bar".getBytes(StandardCharsets.UTF_8));

        Assertions.assertEquals("foo", response.getSecuredBody());
        Assertions.assertEquals("bar", newResponse.getSecuredBody());
        Assertions.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableHeaders() {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200,
            new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "foo")), null, null);

        ApiHttpResponse<byte[]> newResponse = response.withHeaders(response.getHeaders().withHeader("foo", "bar"));

        Assertions.assertEquals("foo", response.getHeaders().getFirst("foo"));
        Assertions.assertEquals("bar", newResponse.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableGetHeaders() {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200,
            new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "foo")), null, null);

        response.getHeaders().addHeader("foo", "bar");

        Assertions.assertEquals(1, response.getHeaders().getHeaders("foo").size());
    }
}
