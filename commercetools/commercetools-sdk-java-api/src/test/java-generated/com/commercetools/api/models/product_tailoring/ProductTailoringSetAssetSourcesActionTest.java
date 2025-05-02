
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetSourcesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetSourcesActionBuilder builder) {
        ProductTailoringSetAssetSourcesAction productTailoringSetAssetSourcesAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetSourcesAction)
                .isInstanceOf(ProductTailoringSetAssetSourcesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAssetSourcesAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetSourcesAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetSourcesAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetSourcesAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetSourcesAction.builder().assetKey("assetKey") },
                new Object[] { "sources", ProductTailoringSetAssetSourcesAction.builder()
                        .sources(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl())) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void sources() {
        ProductTailoringSetAssetSourcesAction value = ProductTailoringSetAssetSourcesAction.of();
        value.setSources(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
        Assertions.assertThat(value.getSources())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetSourceImpl()));
    }
}
