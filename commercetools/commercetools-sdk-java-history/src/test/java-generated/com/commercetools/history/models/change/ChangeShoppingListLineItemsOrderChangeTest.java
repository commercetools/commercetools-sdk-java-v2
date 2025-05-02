
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeShoppingListLineItemsOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeShoppingListLineItemsOrderChangeBuilder builder) {
        ChangeShoppingListLineItemsOrderChange changeShoppingListLineItemsOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeShoppingListLineItemsOrderChange)
                .isInstanceOf(ChangeShoppingListLineItemsOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeShoppingListLineItemsOrderChange.builder().change("change") },
                new Object[] { "previousValue", ChangeShoppingListLineItemsOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl())) },
                new Object[] { "nextValue", ChangeShoppingListLineItemsOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setPreviousValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setNextValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
    }
}
