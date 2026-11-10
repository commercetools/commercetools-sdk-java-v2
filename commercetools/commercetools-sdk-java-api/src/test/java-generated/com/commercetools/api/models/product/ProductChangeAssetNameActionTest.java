
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductChangeAssetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductChangeAssetNameActionBuilder builder) {
        ProductChangeAssetNameAction productChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeAssetNameAction).isInstanceOf(ProductChangeAssetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductChangeAssetNameAction.builder().variantId(5L) },
                new Object[] { "sku", ProductChangeAssetNameAction.builder().sku("sku") },
                new Object[] { "staged", ProductChangeAssetNameAction.builder().staged(true) },
                new Object[] { "assetId", ProductChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { "name", ProductChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
