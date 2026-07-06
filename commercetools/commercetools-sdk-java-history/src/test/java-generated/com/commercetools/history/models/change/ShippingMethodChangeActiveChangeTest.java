
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeActiveChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeActiveChangeBuilder builder) {
        ShippingMethodChangeActiveChange shippingMethodChangeActiveChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeActiveChange).isInstanceOf(ShippingMethodChangeActiveChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodChangeActiveChange.builder().change("change") },
                new Object[] { "previousValue", ShippingMethodChangeActiveChange.builder().previousValue(true) },
                new Object[] { "nextValue", ShippingMethodChangeActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ShippingMethodChangeActiveChange value = ShippingMethodChangeActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodChangeActiveChange value = ShippingMethodChangeActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ShippingMethodChangeActiveChange value = ShippingMethodChangeActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
