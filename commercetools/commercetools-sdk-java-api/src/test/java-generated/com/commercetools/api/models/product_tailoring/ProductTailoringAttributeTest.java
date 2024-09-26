
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
public class ProductTailoringAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringAttributeBuilder builder) {
        ProductTailoringAttribute productTailoringAttribute = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAttribute).isInstanceOf(ProductTailoringAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringAttribute.builder().name("name") },
                new Object[] { ProductTailoringAttribute.builder().value("value") } };
    }

    @Test
    public void name() {
        ProductTailoringAttribute value = ProductTailoringAttribute.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringAttribute value = ProductTailoringAttribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
