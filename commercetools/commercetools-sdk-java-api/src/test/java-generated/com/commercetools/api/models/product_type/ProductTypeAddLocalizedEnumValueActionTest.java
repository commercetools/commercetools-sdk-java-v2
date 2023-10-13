
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
public class ProductTypeAddLocalizedEnumValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeAddLocalizedEnumValueActionBuilder builder) {
        ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddLocalizedEnumValueAction)
                .isInstanceOf(ProductTypeAddLocalizedEnumValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeAddLocalizedEnumValueAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeAddLocalizedEnumValueAction.builder()
                        .value(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeAddLocalizedEnumValueAction value = ProductTypeAddLocalizedEnumValueAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void value() {
        ProductTypeAddLocalizedEnumValueAction value = ProductTypeAddLocalizedEnumValueAction.of();
        value.setValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
    }
}
