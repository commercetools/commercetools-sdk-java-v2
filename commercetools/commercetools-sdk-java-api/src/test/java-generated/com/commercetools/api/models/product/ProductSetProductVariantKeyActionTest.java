
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetProductVariantKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetProductVariantKeyActionBuilder builder) {
        ProductSetProductVariantKeyAction productSetProductVariantKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductVariantKeyAction).isInstanceOf(ProductSetProductVariantKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetProductVariantKeyAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetProductVariantKeyAction.builder().sku("sku") },
                new Object[] { "key", ProductSetProductVariantKeyAction.builder().key("key") },
                new Object[] { "staged", ProductSetProductVariantKeyAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void staged() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
