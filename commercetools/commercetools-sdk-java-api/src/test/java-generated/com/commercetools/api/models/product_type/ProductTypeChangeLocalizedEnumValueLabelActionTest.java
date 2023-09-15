
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
public class ProductTypeChangeLocalizedEnumValueLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder) {
        ProductTypeChangeLocalizedEnumValueLabelAction productTypeChangeLocalizedEnumValueLabelAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeLocalizedEnumValueLabelAction)
                .isInstanceOf(ProductTypeChangeLocalizedEnumValueLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ProductTypeChangeLocalizedEnumValueLabelAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeLocalizedEnumValueLabelAction.builder()
                        .newValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLocalizedEnumValueLabelAction value = ProductTypeChangeLocalizedEnumValueLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeLocalizedEnumValueLabelAction value = ProductTypeChangeLocalizedEnumValueLabelAction.of();
        value.setNewValue(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl());
    }
}
