
package com.commercetools.api.models.product_search;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductSearchFacetDistinctBucketSortExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetDistinctBucketSortExpressionBuilder builder) {
        ProductSearchFacetDistinctBucketSortExpression productSearchFacetDistinctBucketSortExpression = builder
                .buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctBucketSortExpression)
                .isInstanceOf(ProductSearchFacetDistinctBucketSortExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSearchFacetDistinctBucketSortExpression.builder()
                        .by(com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortBy
                                .findEnum("count")) },
                new Object[] { ProductSearchFacetDistinctBucketSortExpression.builder()
                        .order(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc")) } };
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
        value.setOrder(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc"));
    }
}
