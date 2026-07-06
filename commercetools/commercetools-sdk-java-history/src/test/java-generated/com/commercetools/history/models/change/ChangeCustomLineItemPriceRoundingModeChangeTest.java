
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeCustomLineItemPriceRoundingModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeCustomLineItemPriceRoundingModeChangeBuilder builder) {
        ChangeCustomLineItemPriceRoundingModeChange changeCustomLineItemPriceRoundingModeChange = builder
                .buildUnchecked();
        Assertions.assertThat(changeCustomLineItemPriceRoundingModeChange)
                .isInstanceOf(ChangeCustomLineItemPriceRoundingModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeCustomLineItemPriceRoundingModeChange.builder().change("change") },
                new Object[] { "customLineItem",
                        ChangeCustomLineItemPriceRoundingModeChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        ChangeCustomLineItemPriceRoundingModeChange.builder().customLineItemId("customLineItemId") },
                new Object[] { "previousValue", ChangeCustomLineItemPriceRoundingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "nextValue", ChangeCustomLineItemPriceRoundingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void change() {
        ChangeCustomLineItemPriceRoundingModeChange value = ChangeCustomLineItemPriceRoundingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void customLineItem() {
        ChangeCustomLineItemPriceRoundingModeChange value = ChangeCustomLineItemPriceRoundingModeChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        ChangeCustomLineItemPriceRoundingModeChange value = ChangeCustomLineItemPriceRoundingModeChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void previousValue() {
        ChangeCustomLineItemPriceRoundingModeChange value = ChangeCustomLineItemPriceRoundingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void nextValue() {
        ChangeCustomLineItemPriceRoundingModeChange value = ChangeCustomLineItemPriceRoundingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }
}
