
package com.commercetools;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.client.ByProjectKeyProductProjectionsSearchPost;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiMethod;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest {

    private ApiHttpClient createClient() {
        return ApiHttpClient.of("", null);
    }

    @Test
    public void postSearch() {
        final ByProjectKeyRequestBuilder project = ApiRootBuilder.createForProject("test", createClient());
        ApiHttpRequest request = project.productProjections()
                .search()
                .post()
                .addQueryParam("param", true)
                .addFormParam("filter.query", "categories.id:\"abc123\"")
                .addFormParam("filter", "variants.attributes.name:\"foo\"")
                .createHttpRequest();

        Assertions.assertThat(request.getUri().toString()).isEqualTo("/test/product-projections/search?param=true");
        Assertions.assertThat(request.getSecuredBody())
                .isEqualTo("filter.query=categories.id%3A%22abc123%22&filter=variants.attributes.name%3A%22foo%22");
        Assertions.assertThat(request.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE))
                .isEqualTo("application/x-www-form-urlencoded");
    }

    @Test
    public void testImmutableWithFormParam() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>());

        ByProjectKeyProductProjectionsSearchPost newMethod = method.withFormParam("foo", "bar");

        Assert.assertEquals(1, newMethod.getFormParams().size());
        Assert.assertEquals(0, method.getFormParams().size());
        Assert.assertEquals("bar", newMethod.getFormParam("foo").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("", String.join("&", method.getFormParamUriStrings()));
        Assert.assertEquals("foo=bar", String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableWithoutFormParam() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method.withoutFormParam("foo");

        Assert.assertEquals(1, method.getFormParams().size());
        Assert.assertEquals(0, newMethod.getFormParams().size());
        Assert.assertEquals("bar", method.getFormParam("foo").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getFormParamUriStrings()));
        Assert.assertEquals("", String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableWithFormParams() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method
                .withFormParams(Lists.newArrayList(new ApiMethod.ParamEntry<>("fooz", "barz")));

        Assert.assertEquals(1, method.getFormParams().size());
        Assert.assertEquals(1, newMethod.getFormParams().size());
        Assert.assertEquals("bar", method.getFormParam("foo").stream().findFirst().get());
        Assert.assertEquals("barz", newMethod.getFormParam("fooz").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getFormParamUriStrings()));
        Assert.assertEquals("fooz=barz", String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableAddFormParam() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method.addFormParam("fooz", "barz");

        Assert.assertEquals(1, method.getFormParams().size());
        Assert.assertEquals(2, newMethod.getFormParams().size());
        Assert.assertEquals("bar", method.getFormParam("foo").stream().findFirst().get());
        Assert.assertEquals("bar", newMethod.getFormParam("foo").stream().findFirst().get());
        Assert.assertEquals("barz", newMethod.getFormParam("fooz").stream().findFirst().get());
        Assert.assertNotEquals(method, newMethod);
        Assert.assertEquals("foo=bar", String.join("&", method.getFormParamUriStrings()));
        Assert.assertEquals("foo=bar&fooz=barz", String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableGetFormParams() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "foo");

        final List<ApiMethod.ParamEntry<String, String>> formParams = method.getFormParams();
        formParams.add(new ApiMethod.ParamEntry<>("bar", "bar"));

        Assert.assertEquals(1, method.getFormParams().size());

        Assert.assertNull(method.getFirstFormParam("bar"));
        Assert.assertEquals("foo", method.getFirstFormParam("foo"));
        Assert.assertNotEquals(method.getFormParams(), formParams);
    }

    @Test
    public void testImmutableGetFormParamsByKey() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "foo");

        final List<String> formParams = method.getFormParam("foo");
        formParams.add("bar");

        Assert.assertEquals(1, method.getFormParams().size());

        Assert.assertNull(method.getFirstFormParam("bar"));
        Assert.assertEquals("foo", method.getFirstFormParam("foo"));
        Assert.assertNotEquals(method.getFormParams(), formParams);
    }
}
