package io.vrap.rmf.base.client;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class ApiHttpResponseTest {

    @Test
    public void testImmutableStatusCode()
    {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, null, null);

        ApiHttpResponse<byte[]> newResponse = response.withStatusCode(201);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(201, newResponse.getStatusCode());
        Assert.assertNotEquals(response, newResponse);

    }

    @Test
    public void testImmutableMessage()
    {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, null, "foo");

        ApiHttpResponse<byte[]> newResponse = response.withMessage("bar");

        Assert.assertEquals("foo", response.getMessage());
        Assert.assertEquals("bar", newResponse.getMessage());
        Assert.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableBody()
    {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, null, "foo".getBytes(StandardCharsets.UTF_8),null);

        ApiHttpResponse<byte[]> newResponse = response.withBody("bar".getBytes(StandardCharsets.UTF_8));

        Assert.assertEquals("foo", response.getSecuredBody());
        Assert.assertEquals("bar", newResponse.getSecuredBody());
        Assert.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableHeaders()
    {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "foo")), null,null);

        ApiHttpResponse<byte[]> newResponse = response.withHeaders(response.getHeaders().withHeader("foo", "bar"));

        Assert.assertEquals("foo", response.getHeaders().getFirst("foo"));
        Assert.assertEquals("bar", newResponse.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(response, newResponse);
    }

    @Test
    public void testImmutableGetHeaders()
    {
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "foo")), null, null);

        response.getHeaders().addHeader("foo", "bar");

        Assert.assertEquals(1, response.getHeaders().getHeaders("foo").size());
    }
}
