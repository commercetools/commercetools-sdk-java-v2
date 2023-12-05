
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
public class ProductSelectionSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionSetKeyActionBuilder builder) {
        ProductSelectionSetKeyAction productSelectionSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetKeyAction).isInstanceOf(ProductSelectionSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductSelectionSetKeyAction value = ProductSelectionSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
