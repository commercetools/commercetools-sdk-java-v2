
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
public class ProductTailoringSetAssetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAssetKeyActionBuilder builder) {
        ProductTailoringSetAssetKeyAction productTailoringSetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetKeyAction).isInstanceOf(ProductTailoringSetAssetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAssetKeyAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAssetKeyAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAssetKeyAction.builder().staged(true) },
                new Object[] { ProductTailoringSetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringSetAssetKeyAction.builder().assetKey("assetKey") } };
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
