
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
public class ProductTypeRemoveAttributeDefinitionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeRemoveAttributeDefinitionActionBuilder builder) {
        ProductTypeRemoveAttributeDefinitionAction productTypeRemoveAttributeDefinitionAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeRemoveAttributeDefinitionAction)
                .isInstanceOf(ProductTypeRemoveAttributeDefinitionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeRemoveAttributeDefinitionAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ProductTypeRemoveAttributeDefinitionAction value = ProductTypeRemoveAttributeDefinitionAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
