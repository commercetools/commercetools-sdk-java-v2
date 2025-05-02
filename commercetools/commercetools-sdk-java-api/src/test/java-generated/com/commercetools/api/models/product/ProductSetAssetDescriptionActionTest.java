
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAssetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAssetDescriptionActionBuilder builder) {
        ProductSetAssetDescriptionAction productSetAssetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetDescriptionAction).isInstanceOf(ProductSetAssetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetAssetDescriptionAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetAssetDescriptionAction.builder().sku("sku") },
                new Object[] { "staged", ProductSetAssetDescriptionAction.builder().staged(true) },
                new Object[] { "assetId", ProductSetAssetDescriptionAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductSetAssetDescriptionAction.builder().assetKey("assetKey") },
                new Object[] { "description", ProductSetAssetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void description() {
        ProductSetAssetDescriptionAction value = ProductSetAssetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
