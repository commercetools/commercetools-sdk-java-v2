
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductChangeMasterVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductChangeMasterVariantActionBuilder builder) {
        ProductChangeMasterVariantAction productChangeMasterVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeMasterVariantAction).isInstanceOf(ProductChangeMasterVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductChangeMasterVariantAction.builder().variantId(5L) },
                new Object[] { "sku", ProductChangeMasterVariantAction.builder().sku("sku") },
                new Object[] { "staged", ProductChangeMasterVariantAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
