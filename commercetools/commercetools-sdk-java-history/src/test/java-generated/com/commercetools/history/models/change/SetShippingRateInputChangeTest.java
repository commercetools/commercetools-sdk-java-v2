
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingRateInputChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingRateInputChangeBuilder builder) {
        SetShippingRateInputChange setShippingRateInputChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingRateInputChange).isInstanceOf(SetShippingRateInputChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingRateInputChange.builder().change("change") },
                new Object[] { "previousValue", SetShippingRateInputChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetShippingRateInputChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetShippingRateInputChange value = SetShippingRateInputChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
