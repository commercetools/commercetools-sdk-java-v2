
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
public class ProductChangeMasterVariantActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductChangeMasterVariantActionBuilder builder) {
        ProductChangeMasterVariantAction productChangeMasterVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeMasterVariantAction).isInstanceOf(ProductChangeMasterVariantAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductChangeMasterVariantAction.builder().variantId(5L) },
                new Object[] { ProductChangeMasterVariantAction.builder().sku("sku") },
                new Object[] { ProductChangeMasterVariantAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductChangeMasterVariantAction value = ProductChangeMasterVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
