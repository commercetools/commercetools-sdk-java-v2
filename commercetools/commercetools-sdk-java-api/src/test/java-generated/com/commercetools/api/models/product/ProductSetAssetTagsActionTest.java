
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAssetTagsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAssetTagsActionBuilder builder) {
        ProductSetAssetTagsAction productSetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetTagsAction).isInstanceOf(ProductSetAssetTagsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductSetAssetTagsAction.builder().variantId(5L) },
                new Object[] { "sku", ProductSetAssetTagsAction.builder().sku("sku") },
                new Object[] { "staged", ProductSetAssetTagsAction.builder().staged(true) },
                new Object[] { "assetId", ProductSetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { "assetKey", ProductSetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { "tags", ProductSetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
    }

    @Test
    public void variantId() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void tags() {
        ProductSetAssetTagsAction value = ProductSetAssetTagsAction.of();
        value.setTags(Collections.singletonList("tags"));
        Assertions.assertThat(value.getTags()).isEqualTo(Collections.singletonList("tags"));
    }
}
