
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeShoppingListLineItemQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeShoppingListLineItemQuantityChangeBuilder builder) {
        ChangeShoppingListLineItemQuantityChange changeShoppingListLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeShoppingListLineItemQuantityChange)
                .isInstanceOf(ChangeShoppingListLineItemQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeShoppingListLineItemQuantityChange.builder().change("change") },
                new Object[] { "previousValue", ChangeShoppingListLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", ChangeShoppingListLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { "lineItem", ChangeShoppingListLineItemQuantityChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void lineItem() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
