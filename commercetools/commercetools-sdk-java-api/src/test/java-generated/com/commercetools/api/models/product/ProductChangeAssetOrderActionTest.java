
package com.commercetools.api.models.product;

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
public class ProductChangeAssetOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductChangeAssetOrderActionBuilder builder) {
        ProductChangeAssetOrderAction productChangeAssetOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeAssetOrderAction).isInstanceOf(ProductChangeAssetOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductChangeAssetOrderAction.builder().variantId(5L) },
                new Object[] { ProductChangeAssetOrderAction.builder().sku("sku") },
                new Object[] { ProductChangeAssetOrderAction.builder().staged(true) }, new Object[] {
                        ProductChangeAssetOrderAction.builder().assetOrder(Collections.singletonList("assetOrder")) } };
    }

    @Test
    public void variantId() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void assetOrder() {
        ProductChangeAssetOrderAction value = ProductChangeAssetOrderAction.of();
        value.setAssetOrder(Collections.singletonList("assetOrder"));
        Assertions.assertThat(value.getAssetOrder()).isEqualTo(Collections.singletonList("assetOrder"));
    }
}
