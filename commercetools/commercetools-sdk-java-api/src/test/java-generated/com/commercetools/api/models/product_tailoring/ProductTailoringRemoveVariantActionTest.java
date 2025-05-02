
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringRemoveVariantActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringRemoveVariantActionBuilder builder) {
        ProductTailoringRemoveVariantAction productTailoringRemoveVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveVariantAction)
                .isInstanceOf(ProductTailoringRemoveVariantAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTailoringRemoveVariantAction.builder().id(2L) },
                new Object[] { "sku", ProductTailoringRemoveVariantAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringRemoveVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
