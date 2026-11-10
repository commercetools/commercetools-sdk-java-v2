
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeCustomLineItemQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeCustomLineItemQuantityChangeBuilder builder) {
        ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeCustomLineItemQuantityChange)
                .isInstanceOf(ChangeCustomLineItemQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeCustomLineItemQuantityChange.builder().change("change") },
                new Object[] { "previousValue", ChangeCustomLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", ChangeCustomLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { "customLineItem",
                        ChangeCustomLineItemQuantityChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        ChangeCustomLineItemQuantityChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void customLineItem() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
