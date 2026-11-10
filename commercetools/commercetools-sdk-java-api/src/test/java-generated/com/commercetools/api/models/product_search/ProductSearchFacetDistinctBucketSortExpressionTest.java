
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetDistinctBucketSortExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetDistinctBucketSortExpressionBuilder builder) {
        ProductSearchFacetDistinctBucketSortExpression productSearchFacetDistinctBucketSortExpression = builder
                .buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctBucketSortExpression)
                .isInstanceOf(ProductSearchFacetDistinctBucketSortExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "by",
                        ProductSearchFacetDistinctBucketSortExpression.builder()
                                .by(com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy
                                        .findEnum("count")) },
                new Object[] { "order", ProductSearchFacetDistinctBucketSortExpression.builder()
                        .order(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc")) } };
    }

    @Test
    public void by() {
        ProductSearchFacetDistinctBucketSortExpression value = ProductSearchFacetDistinctBucketSortExpression.of();
        value.setBy(
            com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy.findEnum("count"));
        Assertions.assertThat(value.getBy())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy
                        .findEnum("count"));
    }

    @Test
    public void order() {
        ProductSearchFacetDistinctBucketSortExpression value = ProductSearchFacetDistinctBucketSortExpression.of();
        value.setOrder(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.search.SearchSortOrder.findEnum("asc"));
    }
}
