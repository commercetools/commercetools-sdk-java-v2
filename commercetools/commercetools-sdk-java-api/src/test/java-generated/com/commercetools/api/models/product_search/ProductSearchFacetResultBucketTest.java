
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
public class ProductSearchFacetResultBucketTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetResultBucketBuilder builder) {
        ProductSearchFacetResultBucket productSearchFacetResultBucket = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultBucket).isInstanceOf(ProductSearchFacetResultBucket.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetResultBucket.builder()
                .buckets(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryImpl())) } };
    }

    @Test
    public void buckets() {
        ProductSearchFacetResultBucket value = ProductSearchFacetResultBucket.of();
        value.setBuckets(Collections.singletonList(
            new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryImpl()));
        Assertions.assertThat(value.getBuckets())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryImpl()));
    }
}
