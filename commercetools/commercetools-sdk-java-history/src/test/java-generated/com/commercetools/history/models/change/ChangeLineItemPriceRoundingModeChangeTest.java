
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeLineItemPriceRoundingModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeLineItemPriceRoundingModeChangeBuilder builder) {
        ChangeLineItemPriceRoundingModeChange changeLineItemPriceRoundingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeLineItemPriceRoundingModeChange)
                .isInstanceOf(ChangeLineItemPriceRoundingModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeLineItemPriceRoundingModeChange.builder().change("change") },
                new Object[] { "variant", ChangeLineItemPriceRoundingModeChange.builder().variant("variant") },
                new Object[] { "lineItem",
                        ChangeLineItemPriceRoundingModeChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", ChangeLineItemPriceRoundingModeChange.builder().lineItemId("lineItemId") },
                new Object[] { "previousValue", ChangeLineItemPriceRoundingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "nextValue", ChangeLineItemPriceRoundingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void change() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void variant() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void lineItem() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void previousValue() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void nextValue() {
        ChangeLineItemPriceRoundingModeChange value = ChangeLineItemPriceRoundingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }
}
