
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
public class ShoppingListSetLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetLineItemCustomFieldActionBuilder builder) {
        ShoppingListSetLineItemCustomFieldAction shoppingListSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetLineItemCustomFieldAction)
                .isInstanceOf(ShoppingListSetLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShoppingListSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { ShoppingListSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { ShoppingListSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { ShoppingListSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
