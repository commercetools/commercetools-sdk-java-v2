
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetResultBucketEntryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetResultBucketEntryBuilder builder) {
        ProductSearchFacetResultBucketEntry productSearchFacetResultBucketEntry = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultBucketEntry)
                .isInstanceOf(ProductSearchFacetResultBucketEntry.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductSearchFacetResultBucketEntry.builder().key("key") },
                new Object[] { "count", ProductSearchFacetResultBucketEntry.builder().count(2) } };
    }

    @Test
    public void key() {
        ProductSearchFacetResultBucketEntry value = ProductSearchFacetResultBucketEntry.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void count() {
        ProductSearchFacetResultBucketEntry value = ProductSearchFacetResultBucketEntry.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }
}
