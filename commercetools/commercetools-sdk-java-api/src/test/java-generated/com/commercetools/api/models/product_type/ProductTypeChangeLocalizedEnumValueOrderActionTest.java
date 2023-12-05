
package com.commercetools.api.models.product_type;

import java.util.Collections;

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
public class ProductTypeChangeLocalizedEnumValueOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder) {
        ProductTypeChangeLocalizedEnumValueOrderAction productTypeChangeLocalizedEnumValueOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeLocalizedEnumValueOrderAction)
                .isInstanceOf(ProductTypeChangeLocalizedEnumValueOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ProductTypeChangeLocalizedEnumValueOrderAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeLocalizedEnumValueOrderAction.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl())) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLocalizedEnumValueOrderAction value = ProductTypeChangeLocalizedEnumValueOrderAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void values() {
        ProductTypeChangeLocalizedEnumValueOrderAction value = ProductTypeChangeLocalizedEnumValueOrderAction.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_type.AttributeLocalizedEnumValueImpl()));
    }
}
