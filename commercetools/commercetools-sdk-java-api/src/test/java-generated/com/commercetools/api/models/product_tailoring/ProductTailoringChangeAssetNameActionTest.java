
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
public class ProductTailoringChangeAssetNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringChangeAssetNameActionBuilder builder) {
        ProductTailoringChangeAssetNameAction productTailoringChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringChangeAssetNameAction)
                .isInstanceOf(ProductTailoringChangeAssetNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringChangeAssetNameAction.builder().variantId(5L) },
                new Object[] { ProductTailoringChangeAssetNameAction.builder().sku("sku") },
                new Object[] { ProductTailoringChangeAssetNameAction.builder().staged(true) },
                new Object[] { ProductTailoringChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { ProductTailoringChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductTailoringChangeAssetNameAction value = ProductTailoringChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
