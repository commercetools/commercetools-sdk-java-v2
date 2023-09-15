
package com.commercetools.api.models.product_type;

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
public class ProductTypeAddPlainEnumValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeAddPlainEnumValueActionBuilder builder) {
        ProductTypeAddPlainEnumValueAction productTypeAddPlainEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddPlainEnumValueAction)
                .isInstanceOf(ProductTypeAddPlainEnumValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeAddPlainEnumValueAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeAddPlainEnumValueAction.builder()
                        .value(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeAddPlainEnumValueAction value = ProductTypeAddPlainEnumValueAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void value() {
        ProductTypeAddPlainEnumValueAction value = ProductTypeAddPlainEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
    }
}
