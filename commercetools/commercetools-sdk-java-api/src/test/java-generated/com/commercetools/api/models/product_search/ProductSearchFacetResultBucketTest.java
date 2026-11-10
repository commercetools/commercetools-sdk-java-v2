
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetResultBucketTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetResultBucketBuilder builder) {
        ProductSearchFacetResultBucket productSearchFacetResultBucket = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultBucket).isInstanceOf(ProductSearchFacetResultBucket.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buckets", ProductSearchFacetResultBucket.builder()
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
