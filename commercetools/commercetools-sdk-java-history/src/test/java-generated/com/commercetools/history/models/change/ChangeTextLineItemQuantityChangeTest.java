
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTextLineItemQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTextLineItemQuantityChangeBuilder builder) {
        ChangeTextLineItemQuantityChange changeTextLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeTextLineItemQuantityChange).isInstanceOf(ChangeTextLineItemQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTextLineItemQuantityChange.builder().change("change") },
                new Object[] { "previousValue", ChangeTextLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", ChangeTextLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { "textLineItem", ChangeTextLineItemQuantityChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void textLineItem() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
