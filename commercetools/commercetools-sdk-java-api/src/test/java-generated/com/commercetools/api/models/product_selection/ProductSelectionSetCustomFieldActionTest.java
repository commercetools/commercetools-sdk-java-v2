
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionSetCustomFieldActionBuilder builder) {
        ProductSelectionSetCustomFieldAction productSelectionSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetCustomFieldAction)
                .isInstanceOf(ProductSelectionSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionSetCustomFieldAction.builder().name("name") },
                new Object[] { ProductSelectionSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ProductSelectionSetCustomFieldAction value = ProductSelectionSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSelectionSetCustomFieldAction value = ProductSelectionSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
