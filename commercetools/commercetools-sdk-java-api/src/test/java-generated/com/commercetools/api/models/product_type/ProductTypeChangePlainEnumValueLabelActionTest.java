
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
public class ProductTypeChangePlainEnumValueLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangePlainEnumValueLabelActionBuilder builder) {
        ProductTypeChangePlainEnumValueLabelAction productTypeChangePlainEnumValueLabelAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangePlainEnumValueLabelAction)
                .isInstanceOf(ProductTypeChangePlainEnumValueLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangePlainEnumValueLabelAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangePlainEnumValueLabelAction.builder()
                        .newValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangePlainEnumValueLabelAction value = ProductTypeChangePlainEnumValueLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangePlainEnumValueLabelAction value = ProductTypeChangePlainEnumValueLabelAction.of();
        value.setNewValue(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl());
    }
}
