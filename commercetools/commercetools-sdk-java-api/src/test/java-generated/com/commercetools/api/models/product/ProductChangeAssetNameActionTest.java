
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
public class ProductChangeAssetNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductChangeAssetNameActionBuilder builder) {
        ProductChangeAssetNameAction productChangeAssetNameAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeAssetNameAction).isInstanceOf(ProductChangeAssetNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductChangeAssetNameAction.builder().variantId(5L) },
                new Object[] { ProductChangeAssetNameAction.builder().sku("sku") },
                new Object[] { ProductChangeAssetNameAction.builder().staged(true) },
                new Object[] { ProductChangeAssetNameAction.builder().assetId("assetId") },
                new Object[] { ProductChangeAssetNameAction.builder().assetKey("assetKey") },
                new Object[] { ProductChangeAssetNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void variantId() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetId() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setAssetId("assetId");
        Assertions.assertThat(value.getAssetId()).isEqualTo("assetId");
    }

    @Test
    public void assetKey() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setAssetKey("assetKey");
        Assertions.assertThat(value.getAssetKey()).isEqualTo("assetKey");
    }

    @Test
    public void name() {
        ProductChangeAssetNameAction value = ProductChangeAssetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
