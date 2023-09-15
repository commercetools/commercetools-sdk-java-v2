
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
public class ProductSetProductVariantKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetProductVariantKeyActionBuilder builder) {
        ProductSetProductVariantKeyAction productSetProductVariantKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductVariantKeyAction).isInstanceOf(ProductSetProductVariantKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetProductVariantKeyAction.builder().variantId(5L) },
                new Object[] { ProductSetProductVariantKeyAction.builder().sku("sku") },
                new Object[] { ProductSetProductVariantKeyAction.builder().key("key") },
                new Object[] { ProductSetProductVariantKeyAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void staged() {
        ProductSetProductVariantKeyAction value = ProductSetProductVariantKeyAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
