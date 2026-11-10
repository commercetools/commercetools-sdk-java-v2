
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetDefaultVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetDefaultVariantActionBuilder builder) {
        ProductSetDefaultVariantAction productSetDefaultVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productSetDefaultVariantAction).isInstanceOf(ProductSetDefaultVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variant",
                        ProductSetDefaultVariantAction.builder()
                                .variant(new com.commercetools.api.models.variant.VariantResourceIdentifierImpl()) },
                new Object[] { "staged", ProductSetDefaultVariantAction.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductSetDefaultVariantAction value = ProductSetDefaultVariantAction.of();
        value.setVariant(new com.commercetools.api.models.variant.VariantResourceIdentifierImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.variant.VariantResourceIdentifierImpl());
    }

    @Test
    public void staged() {
        ProductSetDefaultVariantAction value = ProductSetDefaultVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
