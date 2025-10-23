
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLineItemNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLineItemNameChangeBuilder builder) {
        ChangeLineItemNameChange changeLineItemNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeLineItemNameChange).isInstanceOf(ChangeLineItemNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeLineItemNameChange.builder().change("change") },
                new Object[] { "lineItem", ChangeLineItemNameChange.builder()
                        .lineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) },
                new Object[] { "previousValue",
                        ChangeLineItemNameChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue", ChangeLineItemNameChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        ChangeLineItemNameChange value = ChangeLineItemNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void lineItem() {
        ChangeLineItemNameChange value = ChangeLineItemNameChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }

    @Test
    public void previousValue() {
        ChangeLineItemNameChange value = ChangeLineItemNameChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeLineItemNameChange value = ChangeLineItemNameChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
