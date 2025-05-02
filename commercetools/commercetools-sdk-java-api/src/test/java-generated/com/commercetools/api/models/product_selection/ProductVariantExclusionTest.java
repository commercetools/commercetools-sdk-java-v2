
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantExclusionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantExclusionBuilder builder) {
        ProductVariantExclusion productVariantExclusion = builder.buildUnchecked();
        Assertions.assertThat(productVariantExclusion).isInstanceOf(ProductVariantExclusion.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "skus", ProductVariantExclusion.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void skus() {
        ProductVariantExclusion value = ProductVariantExclusion.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
