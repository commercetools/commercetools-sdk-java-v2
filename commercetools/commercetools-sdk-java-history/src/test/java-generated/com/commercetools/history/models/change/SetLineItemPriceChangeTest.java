
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemPriceChangeBuilder builder) {
        SetLineItemPriceChange setLineItemPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemPriceChange).isInstanceOf(SetLineItemPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "nextValue",
                        SetLineItemPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "lineItem",
                        SetLineItemPriceChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", SetLineItemPriceChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
