
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantSelectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantSelectionBuilder builder) {
        ProductVariantSelection productVariantSelection = builder.buildUnchecked();
        Assertions.assertThat(productVariantSelection).isInstanceOf(ProductVariantSelection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        ProductVariantSelection.builder()
                                .type(com.commercetools.history.models.common.ProductVariantSelectionTypeEnum
                                        .findEnum("inclusion")) },
                new Object[] { "skus", ProductVariantSelection.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void type() {
        ProductVariantSelection value = ProductVariantSelection.of();
        value.setType(com.commercetools.history.models.common.ProductVariantSelectionTypeEnum.findEnum("inclusion"));
        Assertions.assertThat(value.getType())
                .isEqualTo(
                    com.commercetools.history.models.common.ProductVariantSelectionTypeEnum.findEnum("inclusion"));
    }

    @Test
    public void skus() {
        ProductVariantSelection value = ProductVariantSelection.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
