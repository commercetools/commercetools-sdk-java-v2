
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLineItemQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLineItemQuantityChangeBuilder builder) {
        ChangeLineItemQuantityChange changeLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeLineItemQuantityChange).isInstanceOf(ChangeLineItemQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeLineItemQuantityChange.builder().change("change") },
                new Object[] { "previousValue", ChangeLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", ChangeLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { "lineItem",
                        ChangeLineItemQuantityChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", ChangeLineItemQuantityChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void lineItem() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
