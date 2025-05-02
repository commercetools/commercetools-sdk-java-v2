
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveShoppingListLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveShoppingListLineItemChangeBuilder builder) {
        RemoveShoppingListLineItemChange removeShoppingListLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(removeShoppingListLineItemChange).isInstanceOf(RemoveShoppingListLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveShoppingListLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveShoppingListLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { "nextValue", RemoveShoppingListLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
