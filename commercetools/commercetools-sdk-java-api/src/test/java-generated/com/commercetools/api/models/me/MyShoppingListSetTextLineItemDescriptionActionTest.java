
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetTextLineItemDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetTextLineItemDescriptionActionBuilder builder) {
        MyShoppingListSetTextLineItemDescriptionAction myShoppingListSetTextLineItemDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListSetTextLineItemDescriptionAction)
                .isInstanceOf(MyShoppingListSetTextLineItemDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListSetTextLineItemDescriptionAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListSetTextLineItemDescriptionAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "description", MyShoppingListSetTextLineItemDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void description() {
        MyShoppingListSetTextLineItemDescriptionAction value = MyShoppingListSetTextLineItemDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
