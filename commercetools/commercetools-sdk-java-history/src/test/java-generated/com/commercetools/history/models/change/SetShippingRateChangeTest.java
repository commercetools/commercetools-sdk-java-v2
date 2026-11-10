
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingRateChangeBuilder builder) {
        SetShippingRateChange setShippingRateChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingRateChange).isInstanceOf(SetShippingRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingRateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShippingRateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ShippingRateImpl()) },
                new Object[] { "nextValue", SetShippingRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ShippingRateImpl()) } };
    }

    @Test
    public void change() {
        SetShippingRateChange value = SetShippingRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingRateChange value = SetShippingRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ShippingRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingRateImpl());
    }

    @Test
    public void nextValue() {
        SetShippingRateChange value = SetShippingRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ShippingRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ShippingRateImpl());
    }
}
