
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemShippingDetailsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemShippingDetailsChangeBuilder builder) {
        SetCustomLineItemShippingDetailsChange setCustomLineItemShippingDetailsChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemShippingDetailsChange)
                .isInstanceOf(SetCustomLineItemShippingDetailsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetCustomLineItemShippingDetailsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemShippingDetailsChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemShippingDetailsChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemShippingDetailsChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
