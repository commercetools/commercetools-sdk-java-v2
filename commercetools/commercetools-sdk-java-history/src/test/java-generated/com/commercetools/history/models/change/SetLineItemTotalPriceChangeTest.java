
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemTotalPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemTotalPriceChangeBuilder builder) {
        SetLineItemTotalPriceChange setLineItemTotalPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemTotalPriceChange).isInstanceOf(SetLineItemTotalPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemTotalPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemTotalPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue",
                        SetLineItemTotalPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "lineItem",
                        SetLineItemTotalPriceChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", SetLineItemTotalPriceChange.builder().lineItemId("lineItemId") },
                new Object[] { "variant", SetLineItemTotalPriceChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void variant() {
        SetLineItemTotalPriceChange value = SetLineItemTotalPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
