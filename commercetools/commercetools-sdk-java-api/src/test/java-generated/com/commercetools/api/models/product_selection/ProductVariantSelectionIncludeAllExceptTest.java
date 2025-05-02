
package com.commercetools.api.models.product_selection;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantSelectionIncludeAllExceptTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantSelectionIncludeAllExceptBuilder builder) {
        ProductVariantSelectionIncludeAllExcept productVariantSelectionIncludeAllExcept = builder.buildUnchecked();
        Assertions.assertThat(productVariantSelectionIncludeAllExcept)
                .isInstanceOf(ProductVariantSelectionIncludeAllExcept.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "skus",
                ProductVariantSelectionIncludeAllExcept.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void skus() {
        ProductVariantSelectionIncludeAllExcept value = ProductVariantSelectionIncludeAllExcept.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
