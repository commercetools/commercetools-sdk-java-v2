
package io.vrap.rmf.base.client;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiMethodTest {
    static class TestApiMethod extends ApiMethod<TestApiMethod, Object> {

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

        @Override
        protected ApiHttpRequest buildHttpRequest() {
            return new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), getHeaders(), null);
        }

        @Override
        public CompletableFuture<ApiHttpResponse<Object>> execute() {
            return null;
        }

        @Override
        public CompletableFuture<ApiHttpResponse<Object>> execute(ApiHttpClient client) {
            return null;
        }

        @Override
        public ApiHttpResponse<Object> executeBlocking() {
            return null;
        }

        @Override
        public ApiHttpResponse<Object> executeBlocking(Duration timeout) {
            return null;
        }

        @Override
        public ApiHttpResponse<Object> executeBlocking(ApiHttpClient client, Duration timeout) {
            return null;
        }

        @Override
        public boolean equals(Object o) {
            return reflectionEquals(o);
        }

        @Override
        public int hashCode() {
            return reflectionHashCode();
        }

        public TestApiMethod withTestParam(final String value) {
            return withQueryParam("test", value);
        }
    }

    private ApiHttpClient createClient() {
        return ApiHttpClient.of("", null, ResponseSerializer.of());
    }

    @Test
    public void testImmutableWithQueryParam() {
        TestApiMethod method = new TestApiMethod(createClient());

        TestApiMethod newMethod = method.withQueryParam("foo", "bar");

        Assertions.assertEquals(1, newMethod.getQueryParams().size());
        Assertions.assertEquals(0, method.getQueryParams().size());
        Assertions.assertEquals("bar", newMethod.getQueryParam("foo").stream().findFirst().get());
        Assertions.assertNotEquals(method, newMethod);
        Assertions.assertEquals("", String.join("&", method.getQueryParamUriStrings()));
        Assertions.assertEquals("foo=bar", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableWithoutQueryParam() {
        TestApiMethod method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        TestApiMethod newMethod = method.withoutQueryParam("foo");

        Assertions.assertEquals(1, method.getQueryParams().size());
        Assertions.assertEquals(0, newMethod.getQueryParams().size());
        Assertions.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assertions.assertNotEquals(method, newMethod);
        Assertions.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assertions.assertEquals("", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableWithQueryParams() {
        TestApiMethod method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        TestApiMethod newMethod = method
                .withQueryParams(Lists.newArrayList(new ApiMethod.ParamEntry<>("fooz", "barz")));

        Assertions.assertEquals(1, method.getQueryParams().size());
        Assertions.assertEquals(1, newMethod.getQueryParams().size());
        Assertions.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assertions.assertEquals("barz", newMethod.getQueryParam("fooz").stream().findFirst().get());
        Assertions.assertNotEquals(method, newMethod);
        Assertions.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assertions.assertEquals("fooz=barz", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableAddQueryParam() {
        TestApiMethod method = new TestApiMethod(createClient()).withQueryParam("foo", "bar");

        TestApiMethod newMethod = method.addQueryParam("fooz", "barz");

        Assertions.assertEquals(1, method.getQueryParams().size());
        Assertions.assertEquals(2, newMethod.getQueryParams().size());
        Assertions.assertEquals("bar", method.getQueryParam("foo").stream().findFirst().get());
        Assertions.assertEquals("bar", newMethod.getQueryParam("foo").stream().findFirst().get());
        Assertions.assertEquals("barz", newMethod.getQueryParam("fooz").stream().findFirst().get());
        Assertions.assertNotEquals(method, newMethod);
        Assertions.assertEquals("foo=bar", String.join("&", method.getQueryParamUriStrings()));
        Assertions.assertEquals("foo=bar&fooz=barz", String.join("&", newMethod.getQueryParamUriStrings()));
    }

    @Test
    public void testImmutableGetQueryParams() {
        TestApiMethod method = new TestApiMethod(createClient()).withQueryParam("foo", "foo");

        final List<ApiMethod.ParamEntry<String, String>> queryParams = method.getQueryParams();
        queryParams.add(new ApiMethod.ParamEntry<>("bar", "bar"));

        Assertions.assertEquals(1, method.getQueryParams().size());

        Assertions.assertNull(method.getFirstQueryParam("bar"));
        Assertions.assertEquals("foo", method.getFirstQueryParam("foo"));
        Assertions.assertNotEquals(method.getQueryParams(), queryParams);
    }

    @Test
    public void testImmutableGetQueryParamsByKey() {
        TestApiMethod method = new TestApiMethod(createClient()).withQueryParam("foo", "foo");

        final List<String> queryParams = method.getQueryParam("foo");
        queryParams.add("bar");

        Assertions.assertEquals(1, method.getQueryParams().size());

        Assertions.assertNull(method.getFirstQueryParam("bar"));
        Assertions.assertEquals("foo", method.getFirstQueryParam("foo"));
        Assertions.assertNotEquals(method.getQueryParams(), queryParams);
    }

    @Test
    public void testImmutableAddHeader() {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.addHeader("foo", "bar");

        Assertions.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assertions.assertEquals(2, newMethod.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", newMethod.getHeaders().getHeaders("foo").get(0).getValue());
        Assertions.assertEquals("bar", newMethod.getHeaders().getHeaders("foo").get(1).getValue());
        Assertions.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithHeader() {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withHeader("foo", "bar");

        Assertions.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assertions.assertEquals(1, newMethod.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("bar", newMethod.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithoutHeader() {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withoutHeader("foo");

        Assertions.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assertions.assertEquals(0, newMethod.getHeaders().getHeaders("foo").size());
        Assertions.assertNull(newMethod.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableWithHeaders() {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        TestApiMethod newMethod = method.withHeaders(new ApiHttpHeaders(ApiHttpHeaders.headerEntry("foo", "bar")));

        Assertions.assertEquals(1, method.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("foo", method.getHeaders().getFirst("foo"));
        Assertions.assertEquals(1, newMethod.getHeaders().getHeaders("foo").size());
        Assertions.assertEquals("bar", newMethod.getHeaders().getFirst("foo"));
        Assertions.assertNotEquals(method, newMethod);
    }

    @Test
    public void testImmutableGetHeaders() {
        TestApiMethod method = new TestApiMethod(createClient()).withHeader("foo", "foo");

        final ApiHttpHeaders headers1 = method.getHeaders();
        headers1.addHeader("bar", "bar");

        Assertions.assertEquals(1, method.getHeaders().getHeaders().size());

        Assertions.assertNull(method.getHeaders().getFirst("bar"));
        Assertions.assertEquals("foo", method.getHeaders().getFirst("foo"));
    }

    @Test
    public void testRequestDecorator() {
        TestApiMethod method = new TestApiMethod(createClient())
                .withHttpRequest(apiHttpRequest -> apiHttpRequest.addHeader("foo", "foo"));
        Assertions.assertNull(method.getHeaders().getFirst("foo"));
        Assertions.assertNull(method.getHeaders().getFirst("bar"));

        final ApiHttpRequest httpRequest = method.buildHttpRequest();
        Assertions.assertNull(httpRequest.getHeaders().getFirst("foo"));
        Assertions.assertNull(httpRequest.getHeaders().getFirst("bar"));

        final ApiHttpRequest httpRequestDecorated = method.createHttpRequest();
        Assertions.assertEquals("foo", httpRequestDecorated.getHeaders().getFirst("foo"));
        Assertions.assertNull(httpRequestDecorated.getHeaders().getFirst("bar"));

        final TestApiMethod method2 = method.withHttpRequest(apiHttpRequest -> apiHttpRequest.addHeader("bar", "bar"));
        final ApiHttpRequest httpRequestDecorated2 = method2.createHttpRequest();
        Assertions.assertEquals("foo", httpRequestDecorated2.getHeaders().getFirst("foo"));
        Assertions.assertEquals("bar", httpRequestDecorated2.getHeaders().getFirst("bar"));
    }

    @Test
    public void testMethodDecorator() {
        TestApiMethod method = new TestApiMethod(createClient());
        Assertions.assertNull(method.getHeaders().getFirst("foo"));
        Assertions.assertNull(method.getHeaders().getFirst("bar"));

        final TestApiMethod decoratedMethod = method.with(ApiMethodTest::addFoo);
        Assertions.assertEquals("foo", decoratedMethod.getHeaders().getFirst("foo"));
        Assertions.assertNull(decoratedMethod.getHeaders().getFirst("bar"));

        final TestApiMethod decoratedMethod2 = method.with(ApiMethodTest::addBar);
        Assertions.assertNull(decoratedMethod2.getHeaders().getFirst("foo"));
        Assertions.assertEquals("bar", decoratedMethod2.getHeaders().getFirst("bar"));

        final TestApiMethod decoratedMethod3 = method.with(m -> m.withTestParam("foo"));
        Assertions.assertNull(decoratedMethod3.getHeaders().getFirst("foo"));
        Assertions.assertNull(decoratedMethod3.getHeaders().getFirst("bar"));
        Assertions.assertEquals("foo", decoratedMethod3.getFirstQueryParam("test"));
    }

    public static <T extends ApiMethod<T, TResult>, TResult> T addFoo(ApiMethod<T, TResult> method) {
        return method.addHeader("foo", "foo");
    }

    public static <T extends ApiMethod<T, TResult>, TResult> T addBar(ApiMethod<T, TResult> method) {
        return method.addHeader("bar", "bar");
    }
}
