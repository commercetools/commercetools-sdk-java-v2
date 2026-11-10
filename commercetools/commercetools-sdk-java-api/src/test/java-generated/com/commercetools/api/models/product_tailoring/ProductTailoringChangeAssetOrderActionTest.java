
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringChangeAssetOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringChangeAssetOrderActionBuilder builder) {
        ProductTailoringChangeAssetOrderAction productTailoringChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringChangeAssetOrderAction)
                .isInstanceOf(ProductTailoringChangeAssetOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringChangeAssetOrderAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringChangeAssetOrderAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringChangeAssetOrderAction.builder().staged(true) },
                new Object[] { "assetOrder", ProductTailoringChangeAssetOrderAction.builder()
                        .assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void variantId() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetOrder() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
