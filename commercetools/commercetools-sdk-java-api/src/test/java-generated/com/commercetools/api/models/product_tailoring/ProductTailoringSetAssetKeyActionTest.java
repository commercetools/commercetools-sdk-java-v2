
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetKeyActionBuilder builder) {
        ProductTailoringSetAssetKeyAction productTailoringSetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetKeyAction).isInstanceOf(ProductTailoringSetAssetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductTailoringSetAssetKeyAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetKeyAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetKeyAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetKeyAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetKeyAction value = ProductTailoringSetAssetKeyAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetKeyAction value = ProductTailoringSetAssetKeyAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetKeyAction value = ProductTailoringSetAssetKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetKeyAction value = ProductTailoringSetAssetKeyAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetKeyAction value = ProductTailoringSetAssetKeyAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
