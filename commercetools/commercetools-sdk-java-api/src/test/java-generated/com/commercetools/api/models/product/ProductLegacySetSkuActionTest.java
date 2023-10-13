
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
public class ProductLegacySetSkuActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductLegacySetSkuActionBuilder builder) {
        ProductLegacySetSkuAction productLegacySetSkuAction = builder.buildUnchecked();
        Assertions.assertThat(productLegacySetSkuAction).isInstanceOf(ProductLegacySetSkuAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductLegacySetSkuAction.builder().sku("sku") },
                new Object[] { ProductLegacySetSkuAction.builder().variantId(5) } };
    }

    @Test
    public void sku() {
        ProductLegacySetSkuAction value = ProductLegacySetSkuAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductLegacySetSkuAction value = ProductLegacySetSkuAction.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }
}
