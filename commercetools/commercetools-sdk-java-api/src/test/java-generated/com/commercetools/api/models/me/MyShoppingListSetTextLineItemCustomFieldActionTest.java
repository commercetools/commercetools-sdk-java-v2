
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetTextLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetTextLineItemCustomFieldActionBuilder builder) {
        MyShoppingListSetTextLineItemCustomFieldAction myShoppingListSetTextLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemCustomFieldAction)
                .isInstanceOf(MyShoppingListSetTextLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "name", MyShoppingListSetTextLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyShoppingListSetTextLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyShoppingListSetTextLineItemCustomFieldAction value = MyShoppingListSetTextLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
