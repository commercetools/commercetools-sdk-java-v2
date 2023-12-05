
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
public class ProductSetAssetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAssetCustomFieldActionBuilder builder) {
        ProductSetAssetCustomFieldAction productSetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAssetCustomFieldAction).isInstanceOf(ProductSetAssetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAssetCustomFieldAction.builder().variantId(5L) },
                new Object[] { ProductSetAssetCustomFieldAction.builder().sku("sku") },
                new Object[] { ProductSetAssetCustomFieldAction.builder().staged(true) },
                new Object[] { ProductSetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { ProductSetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { ProductSetAssetCustomFieldAction.builder().name("name") },
                new Object[] { ProductSetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void variantId() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetAssetCustomFieldAction value = ProductSetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
