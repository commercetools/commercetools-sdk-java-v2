
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
public class ProductTailoringAddAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringAddAssetActionBuilder builder) {
        ProductTailoringAddAssetAction productTailoringAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddAssetAction).isInstanceOf(ProductTailoringAddAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringAddAssetAction.builder().variantId(5L) },
                new Object[] { ProductTailoringAddAssetAction.builder().sku("sku") },
                new Object[] { ProductTailoringAddAssetAction.builder().staged(true) },
                new Object[] { ProductTailoringAddAssetAction.builder()
                        .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { ProductTailoringAddAssetAction.builder().position(4) } };
    }

    @Test
    public void variantId() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void asset() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        ProductTailoringAddAssetAction value = ProductTailoringAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
