
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

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
public class ProductTailoringChangeAssetOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringChangeAssetOrderActionBuilder builder) {
        ProductTailoringChangeAssetOrderAction productTailoringChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringChangeAssetOrderAction)
                .isInstanceOf(ProductTailoringChangeAssetOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringChangeAssetOrderAction.builder().variantId(5L) },
                new Object[] { ProductTailoringChangeAssetOrderAction.builder().sku("sku") },
                new Object[] { ProductTailoringChangeAssetOrderAction.builder().staged(true) },
                new Object[] { ProductTailoringChangeAssetOrderAction.builder()
                        .assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void variantId() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetOrder() {
        ProductTailoringChangeAssetOrderAction value = ProductTailoringChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
