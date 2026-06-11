
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.client.ByProjectKeyProductProjectionsSearchPost;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.product.*;

import com.commercetools.api.models.product_search.ProductPagedSearchResponse;
import com.commercetools.api.models.product_search.ProductSearchFacetResult;
import com.commercetools.api.models.product_search.ProductSearchFacetResultStats;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

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

        Assertions.assertThat(request.getUri().toString()).isEqualTo("test/product-projections/search?param=true");
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

        Assertions.assertThat(1).isEqualTo(newMethod.getFormParams().size());
        Assertions.assertThat(0).isEqualTo(method.getFormParams().size());
        Assertions.assertThat("bar").isEqualTo(newMethod.getFormParam("foo").stream().findFirst().get());
        Assertions.assertThat(method).isNotEqualTo(newMethod);
        Assertions.assertThat("").isEqualTo(String.join("&", method.getFormParamUriStrings()));
        Assertions.assertThat("foo=bar").isEqualTo(String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableWithoutFormParam() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method.withoutFormParam("foo");

        Assertions.assertThat(1).isEqualTo(method.getFormParams().size());
        Assertions.assertThat(0).isEqualTo(newMethod.getFormParams().size());
        Assertions.assertThat("bar").isEqualTo(method.getFormParam("foo").stream().findFirst().get());
        Assertions.assertThat(method).isNotEqualTo(newMethod);
        Assertions.assertThat("foo=bar").isEqualTo(String.join("&", method.getFormParamUriStrings()));
        Assertions.assertThat("").isEqualTo(String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableWithFormParams() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method
                .withFormParams(Lists.newArrayList(new ApiMethod.ParamEntry<>("fooz", "barz")));

        Assertions.assertThat(1).isEqualTo(method.getFormParams().size());
        Assertions.assertThat(1).isEqualTo(newMethod.getFormParams().size());
        Assertions.assertThat("bar").isEqualTo(method.getFormParam("foo").stream().findFirst().get());
        Assertions.assertThat("barz").isEqualTo(newMethod.getFormParam("fooz").stream().findFirst().get());
        Assertions.assertThat(method).isNotEqualTo(newMethod);
        Assertions.assertThat("foo=bar").isEqualTo(String.join("&", method.getFormParamUriStrings()));
        Assertions.assertThat("fooz=barz").isEqualTo(String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableAddFormParam() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "bar");

        ByProjectKeyProductProjectionsSearchPost newMethod = method.addFormParam("fooz", "barz");

        Assertions.assertThat(1).isEqualTo(method.getFormParams().size());
        Assertions.assertThat(2).isEqualTo(newMethod.getFormParams().size());
        Assertions.assertThat("bar").isEqualTo(method.getFormParam("foo").stream().findFirst().get());
        Assertions.assertThat("bar").isEqualTo(newMethod.getFormParam("foo").stream().findFirst().get());
        Assertions.assertThat("barz").isEqualTo(newMethod.getFormParam("fooz").stream().findFirst().get());
        Assertions.assertThat(method).isNotEqualTo(newMethod);
        Assertions.assertThat("foo=bar").isEqualTo(String.join("&", method.getFormParamUriStrings()));
        Assertions.assertThat("foo=bar&fooz=barz").isEqualTo(String.join("&", newMethod.getFormParamUriStrings()));
    }

    @Test
    public void testImmutableGetFormParams() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "foo");

        final List<ApiMethod.ParamEntry<String, String>> formParams = method.getFormParams();
        formParams.add(new ApiMethod.ParamEntry<>("bar", "bar"));

        Assertions.assertThat(1).isEqualTo(method.getFormParams().size());
        Assertions.assertThat(method.getFirstFormParam("bar")).isNull();
        Assertions.assertThat("foo").isEqualTo(method.getFirstFormParam("foo"));
        Assertions.assertThat(method.getFormParams()).isNotEqualTo(formParams);
    }

    @Test
    public void testImmutableGetFormParamsByKey() {
        ByProjectKeyProductProjectionsSearchPost method = new ByProjectKeyProductProjectionsSearchPost(createClient(),
            "", new ArrayList<>()).withFormParam("foo", "foo");

        final List<String> formParams = method.getFormParam("foo");
        formParams.add("bar");

        Assertions.assertThat(1).isEqualTo(method.getFormParams().size());
        Assertions.assertThat(method.getFirstFormParam("bar")).isNull();
        Assertions.assertThat("foo").isEqualTo(method.getFirstFormParam("foo"));
    }

    @Test
    public void testFacetResultsAccessor() {
        ProductProjectionPagedSearchResponse response = JsonUtils.fromJsonString(stringFromResource("facets.json"),
            ProductProjectionPagedSearchResponse.class);

        FacetResult redThings = response.getFacets()
                .withFacetResults(FacetResultsAccessor::asFacetResultMap)
                .get("red-things");
        Assertions.assertThat(redThings).isInstanceOf(FilteredFacetResult.class);
        Assertions.assertThat(redThings.getType()).isEqualTo(FacetTypes.FILTER);

        FacetResult size = response.getFacets().values().get("variants.attributes.size");
        Assertions.assertThat(redThings).isInstanceOf(FilteredFacetResult.class);
        Assertions.assertThat(size.getType()).isEqualTo(FacetTypes.FILTER);

        FacetResult prices = response.getFacets().values().get("size");
        Assertions.assertThat(prices).isInstanceOf(TermFacetResult.class);
        Assertions.assertThat(((TermFacetResult) prices).getTerms().size()).isEqualTo(3);
        Assertions.assertThat(((TermFacetResult) prices).getTerms().get(0).getTerm()).isEqualTo("S");
    }

    @Test
    public void testStatsFacetResultsDeserialization() {
        ProductPagedSearchResponse response = JsonUtils.fromJsonString(
            stringFromResource("search_stats_facet_response.json"), ProductPagedSearchResponse.class);

        ProductSearchFacetResult facet = response.getFacets().get(0);
        Assertions.assertThat(facet).isInstanceOf(ProductSearchFacetResultStats.class);

        ProductSearchFacetResultStats statsFacet = (ProductSearchFacetResultStats) facet;
        Assertions.assertThat(statsFacet.getName()).isEqualTo("price");
        Assertions.assertThat(statsFacet.getCount()).isEqualTo(42L);
        Assertions.assertThat(statsFacet.getMin()).isEqualTo(1000.);
        Assertions.assertThat(statsFacet.getMax()).isEqualTo(50000.);
        Assertions.assertThat(statsFacet.getMean()).isEqualTo(15000.5);
        Assertions.assertThat(statsFacet.getSum()).isEqualTo(1500050.);

        response = JsonUtils.fromJsonString(
            stringFromResource("search_stats_facet_response_1.json"), ProductPagedSearchResponse.class);

        facet = response.getFacets().get(0);
        Assertions.assertThat(facet).isInstanceOf(ProductSearchFacetResultStats.class);

        statsFacet = (ProductSearchFacetResultStats) facet;
        Assertions.assertThat(statsFacet.getName()).isEqualTo("price");
        Assertions.assertThat(statsFacet.getCount()).isEqualTo(859016);
        Assertions.assertThat(statsFacet.getMin()).isEqualTo(199.0);
        Assertions.assertThat(statsFacet.getMax()).isEqualTo(3599900.0);
        Assertions.assertThat(statsFacet.getMean()).isEqualTo(233019.64729760564);
        Assertions.assertThat(statsFacet.getSum()).isEqualTo(2.00167605343E11);
    }
}
