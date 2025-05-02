
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductAddAssetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductAddAssetActionBuilder builder) {
        ProductAddAssetAction productAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productAddAssetAction).isInstanceOf(ProductAddAssetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductAddAssetAction.builder().variantId(5L) },
                new Object[] { "sku", ProductAddAssetAction.builder().sku("sku") },
                new Object[] { "staged", ProductAddAssetAction.builder().staged(true) },
                new Object[] { "asset",
                        ProductAddAssetAction.builder()
                                .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { "position", ProductAddAssetAction.builder().position(4) } };
    }

    @Test
    public void variantId() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void asset() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
