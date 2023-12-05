
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
public class ProductAddAssetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddAssetActionBuilder builder) {
        ProductAddAssetAction productAddAssetAction = builder.buildUnchecked();
        Assertions.assertThat(productAddAssetAction).isInstanceOf(ProductAddAssetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductAddAssetAction.builder().variantId(5L) },
                new Object[] { ProductAddAssetAction.builder().sku("sku") },
                new Object[] { ProductAddAssetAction.builder().staged(true) },
                new Object[] { ProductAddAssetAction.builder()
                        .asset(new com.commercetools.api.models.common.AssetDraftImpl()) },
                new Object[] { ProductAddAssetAction.builder().position(4) } };
    }

    @Test
    public void variantId() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void asset() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setAsset(new com.commercetools.api.models.common.AssetDraftImpl());
        Assertions.assertThat(value.getAsset()).isEqualTo(new com.commercetools.api.models.common.AssetDraftImpl());
    }

    @Test
    public void position() {
        ProductAddAssetAction value = ProductAddAssetAction.of();
        value.setPosition(4);
        Assertions.assertThat(value.getPosition()).isEqualTo(4);
    }
}
