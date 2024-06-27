
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringRemoveAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringRemoveAssetActionBuilder builder) {
        ProductTailoringRemoveAssetAction productTailoringRemoveAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveAssetAction).isInstanceOf(ProductTailoringRemoveAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringRemoveAssetAction.builder().variantId(5L) },
                new Object[] { ProductTailoringRemoveAssetAction.builder().sku("sku") },
                new Object[] { ProductTailoringRemoveAssetAction.builder().staged(true) },
                new Object[] { ProductTailoringRemoveAssetAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringRemoveAssetAction.builder().assetKey("assetKey") } };
    }

    @Test
    public void variantId() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringRemoveAssetAction value = ProductTailoringRemoveAssetAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }
}
