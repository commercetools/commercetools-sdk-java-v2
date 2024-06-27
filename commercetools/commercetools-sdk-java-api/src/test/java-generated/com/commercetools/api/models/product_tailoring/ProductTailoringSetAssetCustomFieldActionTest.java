
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
public class ProductTailoringSetAssetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAssetCustomFieldActionBuilder builder) {
        ProductTailoringSetAssetCustomFieldAction productTailoringSetAssetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetCustomFieldAction)
                .isInstanceOf(ProductTailoringSetAssetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().staged(true) },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().assetKey("assetKey") },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().name("name") },
                new Object[] { ProductTailoringSetAssetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAssetCustomFieldAction value = ProductTailoringSetAssetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
