
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductChangeAssetOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductChangeAssetOrderActionBuilder builder) {
        ProductChangeAssetOrderAction productChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeAssetOrderAction).isInstanceOf(ProductChangeAssetOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductChangeAssetOrderAction.builder().variantId(5L) },
                new Object[] { "sku", ProductChangeAssetOrderAction.builder().sku("sku") },
                new Object[] { "staged", ProductChangeAssetOrderAction.builder().staged(true) },
                new Object[] { "assetOrder",
                        ProductChangeAssetOrderAction.builder().assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void variantId() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetOrder() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
