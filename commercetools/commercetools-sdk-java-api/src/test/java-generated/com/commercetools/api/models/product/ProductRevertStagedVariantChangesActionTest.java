
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRevertStagedVariantChangesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRevertStagedVariantChangesActionBuilder builder) {
        ProductRevertStagedVariantChangesAction productRevertStagedVariantChangesAction = builder.buildUnchecked();
        Assertions.assertThat(productRevertStagedVariantChangesAction)
                .isInstanceOf(ProductRevertStagedVariantChangesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductRevertStagedVariantChangesAction.builder().variantId(5L) } };
    }

    @Test
    public void variantId() {
        ProductRevertStagedVariantChangesAction value = ProductRevertStagedVariantChangesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }
}
