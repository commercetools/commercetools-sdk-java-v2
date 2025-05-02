
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAssetTagsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAssetTagsActionBuilder builder) {
        ProductTailoringSetAssetTagsAction productTailoringSetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetTagsAction)
                .isInstanceOf(ProductTailoringSetAssetTagsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variantId", ProductTailoringSetAssetTagsAction.builder().variantId(5L) },
                new Object[] { "sku", ProductTailoringSetAssetTagsAction.builder().sku("sku") },
                new Object[] { "staged", ProductTailoringSetAssetTagsAction.builder().staged(true) },
                new Object[] { "assetId", ProductTailoringSetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductTailoringSetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { "tags",
                        ProductTailoringSetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void tags() {
        ProductTailoringSetAssetTagsAction value = ProductTailoringSetAssetTagsAction.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }
}
