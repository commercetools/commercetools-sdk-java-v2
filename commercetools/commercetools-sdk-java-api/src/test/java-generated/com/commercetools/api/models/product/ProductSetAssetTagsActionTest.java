
package com.commercetools.api.models.product;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductSetAssetTagsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAssetTagsActionBuilder builder) {
        ProductSetAssetTagsAction productSetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetTagsAction).isInstanceOf(ProductSetAssetTagsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAssetTagsAction.builder().variantId(5L) },
                new Object[] { ProductSetAssetTagsAction.builder().sku("sku") },
                new Object[] { ProductSetAssetTagsAction.builder().staged(true) },
                new Object[] { ProductSetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { ProductSetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { ProductSetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
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
