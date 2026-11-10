
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAssetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAssetKeyActionBuilder builder) {
        ProductSetAssetKeyAction productSetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetKeyAction).isInstanceOf(ProductSetAssetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetAssetKeyAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetAssetKeyAction.builder().sku("sku") },
                new Object[] { "staged", ProductSetAssetKeyAction.builder().staged(true) },
                new Object[] { "assetId", ProductSetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductSetAssetKeyAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductSetAssetKeyAction value = ProductSetAssetKeyAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetKeyAction value = ProductSetAssetKeyAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetKeyAction value = ProductSetAssetKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetKeyAction value = ProductSetAssetKeyAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetKeyAction value = ProductSetAssetKeyAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
