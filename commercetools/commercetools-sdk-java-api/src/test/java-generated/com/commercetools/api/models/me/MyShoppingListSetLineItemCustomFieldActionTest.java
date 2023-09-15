
package com.commercetools.api.models.me;

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
public class MyShoppingListSetLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyShoppingListSetLineItemCustomFieldActionBuilder builder) {
        MyShoppingListSetLineItemCustomFieldAction myShoppingListSetLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetLineItemCustomFieldAction)
                .isInstanceOf(MyShoppingListSetLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyShoppingListSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { MyShoppingListSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyShoppingListSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { MyShoppingListSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        MyShoppingListSetLineItemCustomFieldAction value = MyShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyShoppingListSetLineItemCustomFieldAction value = MyShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        MyShoppingListSetLineItemCustomFieldAction value = MyShoppingListSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyShoppingListSetLineItemCustomFieldAction value = MyShoppingListSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
