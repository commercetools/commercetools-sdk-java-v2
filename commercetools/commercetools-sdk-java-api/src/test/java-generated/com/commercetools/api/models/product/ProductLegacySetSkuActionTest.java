
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductLegacySetSkuActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductLegacySetSkuActionBuilder builder) {
        ProductLegacySetSkuAction productLegacySetSkuAction = builder.buildUnchecked();
        Assertions.assertThat(productLegacySetSkuAction).isInstanceOf(ProductLegacySetSkuAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductLegacySetSkuAction.builder().sku("sku") },
                new Object[] { "variantId", ProductLegacySetSkuAction.builder().variantId(5) } };
    }

    @Test
    public void sku() {
        ProductLegacySetSkuAction value = ProductLegacySetSkuAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductLegacySetSkuAction value = ProductLegacySetSkuAction.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
