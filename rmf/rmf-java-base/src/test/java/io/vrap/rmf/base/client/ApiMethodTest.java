package io.vrap.rmf.base.client;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ApiMethodTest {
    static class TestApiMethod extends ApiMethod<TestApiMethod> {

        public TestApiMethod(ApiHttpClient apiHttpClient) {
            super(apiHttpClient);
        }

        public TestApiMethod(TestApiMethod t) {
            super(t);
        }

        @Override
        protected TestApiMethod copy() {
            return new TestApiMethod(this);
        }
    }

    private ApiHttpClient createClient() {
        return new ApiHttpClient("", null);
    }

    @Test
    public void testImmutableWithQueryParam()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient());

        ApiMethod<TestApiMethod> newMethod = method.withQueryParam("foo", "bar");

        Assert.assertEquals(1, newMethod.getQueryParams().size());
        Assert.assertEquals(0, method.getQueryParams().size());
        Assert.assertEquals("bar", newMethod.getQueryParam("foo").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("", String.join("&", method.getQueryParamUriStrings()));
        Assert.assertEquals("foo=bar", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableWithoutQueryParam()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        ApiMethod<TestApiMethod> newMethod = method.withoutQueryParam("foo");

        Assert.assertEquals(1, method.getQueryParams().size());
        Assert.assertEquals(0, newMethod.getQueryParams().size());
        Assert.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assert.assertEquals("", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableWithQueryParams()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        ApiMethod<TestApiMethod> newMethod = method.withQueryParams(Lists.newArrayList(new ApiMethod.ParamEntry<>("fooz", "barz")));

        Assert.assertEquals(1, method.getQueryParams().size());
        Assert.assertEquals(1, newMethod.getQueryParams().size());
        Assert.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assert.assertEquals("barz", newMethod.getQueryParam("fooz").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assert.assertEquals("fooz=barz", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableAddQueryParam()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        ApiMethod<TestApiMethod> newMethod = method.addQueryParam("fooz", "barz");

        Assert.assertEquals(1, method.getQueryParams().size());
        Assert.assertEquals(2, newMethod.getQueryParams().size());
        Assert.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assert.assertEquals("bar", newMethod.getQueryParam("foo").stream().findFirst().get());
        Assert.assertEquals("barz", newMethod.getQueryParam("fooz").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assert.assertEquals("foo=bar&fooz=barz", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableGetQueryParams()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient()).withQueryParam("foo", "foo");

        final List<ApiMethod.ParamEntry<String, String>> queryParams = method.getQueryParams();
        queryParams.add(new ApiMethod.ParamEntry<>("bar", "bar"));

        Assert.assertEquals(1, method.getQueryParams().size());

        Assert.assertNull(method.getFirstQueryParam("bar"));
        Assert.assertEquals("foo", method.getFirstQueryParam("foo"));
        Assert.assertNotEquals(method.getQueryParams(), queryParams);
    }

    @Test
    public void testImmutableGetQueryParamsByKey()
    {
        ApiMethod<TestApiMethod> method = new TestApiMethod(createClient()).withQueryParam("foo", "foo");

        final List<String> queryParams = method.getQueryParam("foo");
        queryParams.add("bar");


        Assert.assertEquals(1, method.getQueryParams().size());

        Assert.assertNull(method.getFirstQueryParam("bar"));
        Assert.assertEquals("foo", method.getFirstQueryParam("foo"));
        Assert.assertNotEquals(method.getQueryParams(), queryParams);
    }

    @Test
    public void testImmutableAddHeader()
    {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.addHeader("foo", "bar");

        Assert.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assert.assertEquals(2, newMethod.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", newMethod.getHeaders().getHeaders("foo").get(0).getValue());
        Assert.assertEquals("bar", newMethod.getHeaders().getHeaders("foo").get(1).getValue());
        Assert.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithHeader()
    {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withHeader("foo", "bar");

        Assert.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assert.assertEquals(1, newMethod.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("bar", newMethod.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithoutHeader()
    {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withoutHeader("foo");

        Assert.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assert.assertEquals(0, newMethod.getHeaders().getHeaders("foo").size());
        Assert.assertNull(newMethod.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithHeaders()
    {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withHeaders(new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "bar")));

        Assert.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assert.assertEquals(1, newMethod.getHeaders().getHeaders("foo").size());
        Assert.assertEquals("bar", newMethod.getHeaders().getFirst("foo"));
        Assert.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableGetHeaders()
    {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        final ApiHttpHeaders headers1 = method.getHeaders();
        headers1.addHeader("bar", "bar");


        Assert.assertEquals(1, method.getHeaders().getHeaders().size());

        Assert.assertNull(method.getHeaders().getFirst("bar"));
        Assert.assertEquals("foo", method.getHeaders().getFirst("foo"));
    }
}
