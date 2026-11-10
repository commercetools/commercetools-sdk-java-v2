
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetTextLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetTextLineItemCustomTypeActionBuilder builder) {
        MyShoppingListSetTextLineItemCustomTypeAction myShoppingListSetTextLineItemCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemCustomTypeAction)
                .isInstanceOf(MyShoppingListSetTextLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "type",
                        MyShoppingListSetTextLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", MyShoppingListSetTextLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void type() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        MyShoppingListSetTextLineItemCustomTypeAction value = MyShoppingListSetTextLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
