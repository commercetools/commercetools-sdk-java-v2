
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
public class ProductTailoringSetAssetDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAssetDescriptionActionBuilder builder) {
        ProductTailoringSetAssetDescriptionAction productTailoringSetAssetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAssetDescriptionAction)
                .isInstanceOf(ProductTailoringSetAssetDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAssetDescriptionAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAssetDescriptionAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAssetDescriptionAction.builder().staged(true) },
                new Object[] { ProductTailoringSetAssetDescriptionAction.builder().assetId("assetId") },
                new Object[] { ProductTailoringSetAssetDescriptionAction.builder().assetKey("assetKey") },
                new Object[] { ProductTailoringSetAssetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void description() {
        ProductTailoringSetAssetDescriptionAction value = ProductTailoringSetAssetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
