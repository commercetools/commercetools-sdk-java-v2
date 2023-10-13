
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
public class ProductTypeRemoveEnumValuesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeRemoveEnumValuesActionBuilder builder) {
        ProductTypeRemoveEnumValuesAction productTypeRemoveEnumValuesAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeRemoveEnumValuesAction).isInstanceOf(ProductTypeRemoveEnumValuesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeRemoveEnumValuesAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeRemoveEnumValuesAction.builder().keys(Collections.singletonList("keys")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeRemoveEnumValuesAction value = ProductTypeRemoveEnumValuesAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void keys() {
        ProductTypeRemoveEnumValuesAction value = ProductTypeRemoveEnumValuesAction.of();
        value.setKeys(Collections.singletonList("keys"));
        Assertions.assertThat(value.getKeys()).isEqualTo(Collections.singletonList("keys"));
    }
}
