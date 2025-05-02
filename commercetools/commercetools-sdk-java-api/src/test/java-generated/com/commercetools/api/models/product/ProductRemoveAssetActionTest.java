
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRemoveAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRemoveAssetActionBuilder builder) {
        ProductRemoveAssetAction productRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveAssetAction).isInstanceOf(ProductRemoveAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductRemoveAssetAction.builder().variantId(5L) },
                new Object[] { "sku", ProductRemoveAssetAction.builder().sku("sku") },
                new Object[] { "staged", ProductRemoveAssetAction.builder().staged(true) },
                new Object[] { "assetId", ProductRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
