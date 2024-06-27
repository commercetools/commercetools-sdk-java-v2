
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
public class ProductTailoringRemoveVariantActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringRemoveVariantActionBuilder builder) {
        ProductTailoringRemoveVariantAction productTailoringRemoveVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveVariantAction)
                .isInstanceOf(ProductTailoringRemoveVariantAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringRemoveVariantAction.builder().id(2L) },
                new Object[] { ProductTailoringRemoveVariantAction.builder().sku("sku") },
                new Object[] { ProductTailoringRemoveVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveVariantAction value = ProductTailoringRemoveVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
