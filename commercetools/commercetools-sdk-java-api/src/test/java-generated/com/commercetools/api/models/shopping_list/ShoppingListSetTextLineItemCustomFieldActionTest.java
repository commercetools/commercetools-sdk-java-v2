
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
public class ShoppingListSetTextLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShoppingListSetTextLineItemCustomFieldActionBuilder builder) {
        ShoppingListSetTextLineItemCustomFieldAction shoppingListSetTextLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemCustomFieldAction)
                .isInstanceOf(ShoppingListSetTextLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemId("textLineItemId") },
                new Object[] {
                        ShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { ShoppingListSetTextLineItemCustomFieldAction.builder().name("name") },
                new Object[] { ShoppingListSetTextLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
