
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
public class ProductTypeChangeAttributeOrderByNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeAttributeOrderByNameActionBuilder builder) {
        ProductTypeChangeAttributeOrderByNameAction productTypeChangeAttributeOrderByNameAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeAttributeOrderByNameAction)
                .isInstanceOf(ProductTypeChangeAttributeOrderByNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeChangeAttributeOrderByNameAction.builder()
                .attributeNames(Collections.singletonList("attributeNames")) } };
    }

    @Test
    public void attributeNames() {
        ProductTypeChangeAttributeOrderByNameAction value = ProductTypeChangeAttributeOrderByNameAction.of();
        value.setAttributeNames(Collections.singletonList("attributeNames"));
        Assertions.assertThat(value.getAttributeNames()).isEqualTo(Collections.singletonList("attributeNames"));
    }
}
