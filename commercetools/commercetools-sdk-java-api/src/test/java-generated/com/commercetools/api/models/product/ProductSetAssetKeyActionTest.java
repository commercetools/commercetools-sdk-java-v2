
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
public class ProductSetAssetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAssetKeyActionBuilder builder) {
        ProductSetAssetKeyAction productSetAssetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetKeyAction).isInstanceOf(ProductSetAssetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAssetKeyAction.builder().variantId(5L) },
                new Object[] { ProductSetAssetKeyAction.builder().sku("sku") },
                new Object[] { ProductSetAssetKeyAction.builder().staged(true) },
                new Object[] { ProductSetAssetKeyAction.builder().assetId("assetId") },
                new Object[] { ProductSetAssetKeyAction.builder().assetKey("assetKey") } };
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
