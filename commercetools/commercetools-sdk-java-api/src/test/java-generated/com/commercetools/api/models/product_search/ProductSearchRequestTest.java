
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchRequestBuilder builder) {
        ProductSearchRequest productSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(productSearchRequest).isInstanceOf(ProductSearchRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "query",
                        ProductSearchRequest.builder()
                                .query(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "sort",
                        ProductSearchRequest.builder()
                                .sort(Collections
                                        .singletonList(new com.commercetools.api.models.search.SearchSortingImpl())) },
                new Object[] { "limit", ProductSearchRequest.builder().limit(7) },
                new Object[] { "offset", ProductSearchRequest.builder().offset(3) },
                new Object[] { "markMatchingVariants", ProductSearchRequest.builder().markMatchingVariants(true) },
                new Object[] { "productProjectionParameters", ProductSearchRequest.builder()
                        .productProjectionParameters(
                            new com.commercetools.api.models.product_search.ProductSearchProjectionParamsImpl()) },
                new Object[] { "facets", ProductSearchRequest.builder()
                        .facets(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchFacetExpressionImpl())) },
                new Object[] { "postFilter", ProductSearchRequest.builder()
                        .postFilter(new com.commercetools.api.models.search.SearchQueryImpl()) } };
    }

    @Test
    public void query() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setQuery(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getQuery()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void sort() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setSort(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
        Assertions.assertThat(value.getSort())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.search.SearchSortingImpl()));
    }

    @Test
    public void limit() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void offset() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setOffset(3);
        Assertions.assertThat(value.getOffset()).isEqualTo(3);
    }

    @Test
    public void markMatchingVariants() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setMarkMatchingVariants(true);
        Assertions.assertThat(value.getMarkMatchingVariants()).isEqualTo(true);
    }

    @Test
    public void productProjectionParameters() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setProductProjectionParameters(
            new com.commercetools.api.models.product_search.ProductSearchProjectionParamsImpl());
        Assertions.assertThat(value.getProductProjectionParameters())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchProjectionParamsImpl());
    }

    @Test
    public void facets() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setFacets(Collections
                .singletonList(new com.commercetools.api.models.product_search.ProductSearchFacetExpressionImpl()));
        Assertions.assertThat(value.getFacets())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetExpressionImpl()));
    }

    @Test
    public void postFilter() {
        ProductSearchRequest value = ProductSearchRequest.of();
        value.setPostFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getPostFilter())
                .isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }
}
