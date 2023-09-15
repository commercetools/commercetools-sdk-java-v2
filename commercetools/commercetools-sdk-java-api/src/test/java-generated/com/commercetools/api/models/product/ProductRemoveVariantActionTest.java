
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
public class ProductRemoveVariantActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemoveVariantActionBuilder builder) {
        ProductRemoveVariantAction productRemoveVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveVariantAction).isInstanceOf(ProductRemoveVariantAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductRemoveVariantAction.builder().id(2L) },
                new Object[] { ProductRemoveVariantAction.builder().sku("sku") },
                new Object[] { ProductRemoveVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductRemoveVariantAction value = ProductRemoveVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
