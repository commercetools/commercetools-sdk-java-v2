
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetLineItemCustomFieldActionBuilder builder) {
        MyShoppingListSetLineItemCustomFieldAction myShoppingListSetLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetLineItemCustomFieldAction)
                .isInstanceOf(MyShoppingListSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        MyShoppingListSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyShoppingListSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", MyShoppingListSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyShoppingListSetLineItemCustomFieldAction.builder().value("value") } };
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
