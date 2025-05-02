
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemDeactivatedAtChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemDeactivatedAtChangeBuilder builder) {
        SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDeactivatedAtChange).isInstanceOf(SetLineItemDeactivatedAtChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemDeactivatedAtChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemDeactivatedAtChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetLineItemDeactivatedAtChange.builder().nextValue("nextValue") },
                new Object[] { "lineItem", SetLineItemDeactivatedAtChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void lineItem() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
