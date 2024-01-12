
package com.commercetools.api.models.product_search;

import java.util.Collections;

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
public class ProductSearchFacetBucketResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetBucketResultBuilder builder) {
        ProductSearchFacetBucketResult productSearchFacetBucketResult = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetBucketResult).isInstanceOf(ProductSearchFacetBucketResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetBucketResult.builder()
                .buckets(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketImpl())) } };
    }

    @Test
    public void buckets() {
        ProductSearchFacetBucketResult value = ProductSearchFacetBucketResult.of();
        value.setBuckets(Collections
                .singletonList(new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketImpl()));
        Assertions.assertThat(value.getBuckets())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketImpl()));
    }
}
