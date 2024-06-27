
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringSetAssetTagsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAssetTagsActionBuilder builder) {
        ProductTailoringSetAssetTagsAction productTailoringSetAssetTagsAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetTagsAction)
                .isInstanceOf(ProductTailoringSetAssetTagsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAssetTagsAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAssetTagsAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAssetTagsAction.builder().staged(true) },
                new Object[] { ProductTailoringSetAssetTagsAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringSetAssetTagsAction.builder().assetKey("assetKey") },
                new Object[] { ProductTailoringSetAssetTagsAction.builder().tags(Collections.singletonList("tags")) } };
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
