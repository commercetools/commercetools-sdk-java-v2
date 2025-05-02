
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemMoneyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemMoneyChangeBuilder builder) {
        SetCustomLineItemMoneyChange setCustomLineItemMoneyChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemMoneyChange).isInstanceOf(SetCustomLineItemMoneyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomLineItemMoneyChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemMoneyChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemMoneyChange.builder()
                                .nextValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "customLineItem",
                        SetCustomLineItemMoneyChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemMoneyChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
