
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
public class ProductSetAttributeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAttributeActionBuilder builder) {
        ProductSetAttributeAction productSetAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAttributeAction).isInstanceOf(ProductSetAttributeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAttributeAction.builder().variantId(5L) },
                new Object[] { ProductSetAttributeAction.builder().sku("sku") },
                new Object[] { ProductSetAttributeAction.builder().name("name") },
                new Object[] { ProductSetAttributeAction.builder().value("value") },
                new Object[] { ProductSetAttributeAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void name() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductSetAttributeAction value = ProductSetAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
