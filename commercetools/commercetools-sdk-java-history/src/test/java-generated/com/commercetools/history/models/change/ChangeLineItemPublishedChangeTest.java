
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLineItemPublishedChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLineItemPublishedChangeBuilder builder) {
        ChangeLineItemPublishedChange changeLineItemPublishedChange = builder.buildUnchecked();
        Assertions.assertThat(changeLineItemPublishedChange).isInstanceOf(ChangeLineItemPublishedChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeLineItemPublishedChange.builder().change("change") },
                new Object[] { "lineItem", ChangeLineItemPublishedChange.builder()
                        .lineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) },
                new Object[] { "previousValue", ChangeLineItemPublishedChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeLineItemPublishedChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeLineItemPublishedChange value = ChangeLineItemPublishedChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void lineItem() {
        ChangeLineItemPublishedChange value = ChangeLineItemPublishedChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }

    @Test
    public void previousValue() {
        ChangeLineItemPublishedChange value = ChangeLineItemPublishedChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeLineItemPublishedChange value = ChangeLineItemPublishedChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
