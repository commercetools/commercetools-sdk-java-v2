
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetSkuActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetSkuActionBuilder builder) {
        VariantSetSkuAction variantSetSkuAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetSkuAction).isInstanceOf(VariantSetSkuAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", VariantSetSkuAction.builder().sku("sku") },
                new Object[] { "staged", VariantSetSkuAction.builder().staged(true) } };
    }

    @Test
    public void sku() {
        VariantSetSkuAction value = VariantSetSkuAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        VariantSetSkuAction value = VariantSetSkuAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
