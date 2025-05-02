
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddShoppingListLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddShoppingListLineItemChangeBuilder builder) {
        AddShoppingListLineItemChange addShoppingListLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addShoppingListLineItemChange).isInstanceOf(AddShoppingListLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddShoppingListLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddShoppingListLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { "nextValue", AddShoppingListLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        AddShoppingListLineItemChange value = AddShoppingListLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddShoppingListLineItemChange value = AddShoppingListLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        AddShoppingListLineItemChange value = AddShoppingListLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
