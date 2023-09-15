
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetCustomFieldActionBuilder builder) {
        ShoppingListSetCustomFieldAction shoppingListSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetCustomFieldAction).isInstanceOf(ShoppingListSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShoppingListSetCustomFieldAction.builder().name("name") },
                new Object[] { ShoppingListSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ShoppingListSetCustomFieldAction value = ShoppingListSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetCustomFieldAction value = ShoppingListSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
