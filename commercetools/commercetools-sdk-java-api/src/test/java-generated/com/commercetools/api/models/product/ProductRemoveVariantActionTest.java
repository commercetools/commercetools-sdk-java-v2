
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemoveVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemoveVariantActionBuilder builder) {
        ProductRemoveVariantAction productRemoveVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveVariantAction).isInstanceOf(ProductRemoveVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductRemoveVariantAction.builder().id(2L) },
                new Object[] { "sku", ProductRemoveVariantAction.builder().sku("sku") },
                new Object[] { "staged", ProductRemoveVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
