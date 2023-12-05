
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
public class ProductTypeChangePlainEnumValueOrderActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangePlainEnumValueOrderActionBuilder builder) {
        ProductTypeChangePlainEnumValueOrderAction productTypeChangePlainEnumValueOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangePlainEnumValueOrderAction)
                .isInstanceOf(ProductTypeChangePlainEnumValueOrderAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangePlainEnumValueOrderAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangePlainEnumValueOrderAction.builder()
                        .values(Collections.singletonList(
                            new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl())) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangePlainEnumValueOrderAction value = ProductTypeChangePlainEnumValueOrderAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void values() {
        ProductTypeChangePlainEnumValueOrderAction value = ProductTypeChangePlainEnumValueOrderAction.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
    }
}
