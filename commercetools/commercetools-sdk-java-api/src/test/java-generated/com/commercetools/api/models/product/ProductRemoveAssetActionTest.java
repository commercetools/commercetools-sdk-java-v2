
package com.commercetools.api.models.product;

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
public class ProductRemoveAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemoveAssetActionBuilder builder) {
        ProductRemoveAssetAction productRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveAssetAction).isInstanceOf(ProductRemoveAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductRemoveAssetAction.builder().variantId(5L) },
                new Object[] { ProductRemoveAssetAction.builder().sku("sku") },
                new Object[] { ProductRemoveAssetAction.builder().staged(true) },
                new Object[] { ProductRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { ProductRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductRemoveAssetAction value = ProductRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
