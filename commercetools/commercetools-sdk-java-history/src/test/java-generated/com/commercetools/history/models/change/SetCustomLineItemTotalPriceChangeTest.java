
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemTotalPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemTotalPriceChangeBuilder builder) {
        SetCustomLineItemTotalPriceChange setCustomLineItemTotalPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTotalPriceChange).isInstanceOf(SetCustomLineItemTotalPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomLineItemTotalPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemTotalPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemTotalPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "customLineItem",
                        SetCustomLineItemTotalPriceChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemTotalPriceChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemTotalPriceChange value = SetCustomLineItemTotalPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTotalPriceChange value = SetCustomLineItemTotalPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTotalPriceChange value = SetCustomLineItemTotalPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTotalPriceChange value = SetCustomLineItemTotalPriceChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTotalPriceChange value = SetCustomLineItemTotalPriceChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
