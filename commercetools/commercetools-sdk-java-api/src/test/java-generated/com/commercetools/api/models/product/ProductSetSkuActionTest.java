
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetSkuActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetSkuActionBuilder builder) {
        ProductSetSkuAction productSetSkuAction = builder.buildUnchecked();
        Assertions.assertThat(productSetSkuAction).isInstanceOf(ProductSetSkuAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetSkuAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetSkuAction.builder().sku("sku") },
                new Object[] { "staged", ProductSetSkuAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetSkuAction value = ProductSetSkuAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetSkuAction value = ProductSetSkuAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetSkuAction value = ProductSetSkuAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
