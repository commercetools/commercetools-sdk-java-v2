
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringAddAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringAddAssetActionBuilder builder) {
        ProductTailoringAddAssetAction productTailoringAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddAssetAction).isInstanceOf(ProductTailoringAddAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductTailoringAddAssetAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringAddAssetAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringAddAssetAction.builder().staged(true) },
                new Object[] { "asset",
                        ProductTailoringAddAssetAction.builder()
                                .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { "position", ProductTailoringAddAssetAction.builder().position(4) } };
    }

    @Test
    public void variantId() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void asset() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
