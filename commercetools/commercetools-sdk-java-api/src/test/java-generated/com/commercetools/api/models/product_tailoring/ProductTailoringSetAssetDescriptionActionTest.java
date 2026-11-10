
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetDescriptionActionBuilder builder) {
        ProductTailoringSetAssetDescriptionAction productTailoringSetAssetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetDescriptionAction)
                .isInstanceOf(ProductTailoringSetAssetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAssetDescriptionAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetDescriptionAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetDescriptionAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetDescriptionAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetDescriptionAction.builder().assetKey("assetKey") },
                new Object[] { "description", ProductTailoringSetAssetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void description() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
