
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
public class ProductTailoringSetAttributeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAttributeActionBuilder builder) {
        ProductTailoringSetAttributeAction productTailoringSetAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetAttributeAction)
                .isInstanceOf(ProductTailoringSetAttributeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAttributeAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetAttributeAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetAttributeAction.builder().name("name") },
                new Object[] { ProductTailoringSetAttributeAction.builder().value("value") },
                new Object[] { ProductTailoringSetAttributeAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void name() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductTailoringSetAttributeAction value = ProductTailoringSetAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
