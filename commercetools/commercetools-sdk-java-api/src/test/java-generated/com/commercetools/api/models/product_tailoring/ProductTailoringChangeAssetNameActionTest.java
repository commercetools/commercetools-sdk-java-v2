
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringChangeAssetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringChangeAssetNameActionBuilder builder) {
        ProductTailoringChangeAssetNameAction productTailoringChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringChangeAssetNameAction)
                .isInstanceOf(ProductTailoringChangeAssetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringChangeAssetNameAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringChangeAssetNameAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringChangeAssetNameAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { "name", ProductTailoringChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
