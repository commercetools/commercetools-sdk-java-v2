
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
public class ProductTypeChangeEnumKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeEnumKeyActionBuilder builder) {
        ProductTypeChangeEnumKeyAction productTypeChangeEnumKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeEnumKeyAction).isInstanceOf(ProductTypeChangeEnumKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangeEnumKeyAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeEnumKeyAction.builder().key("key") },
                new Object[] { ProductTypeChangeEnumKeyAction.builder().newKey("newKey") } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void key() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void newKey() {
        ProductTypeChangeEnumKeyAction value = ProductTypeChangeEnumKeyAction.of();
        value.setNewKey("newKey");
        Assertions.assertThat(value.getNewKey()).isEqualTo("newKey");
    }
}
