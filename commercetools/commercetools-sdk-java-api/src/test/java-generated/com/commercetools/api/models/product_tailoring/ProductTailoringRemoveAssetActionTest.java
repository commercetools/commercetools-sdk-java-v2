
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringRemoveAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringRemoveAssetActionBuilder builder) {
        ProductTailoringRemoveAssetAction productTailoringRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveAssetAction).isInstanceOf(ProductTailoringRemoveAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductTailoringRemoveAssetAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringRemoveAssetAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringRemoveAssetAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
