
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeIsDefaultChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeIsDefaultChangeBuilder builder) {
        ShippingMethodChangeIsDefaultChange shippingMethodChangeIsDefaultChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeIsDefaultChange)
                .isInstanceOf(ShippingMethodChangeIsDefaultChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodChangeIsDefaultChange.builder().change("change") },
                new Object[] { "previousValue", ShippingMethodChangeIsDefaultChange.builder().previousValue(true) },
                new Object[] { "nextValue", ShippingMethodChangeIsDefaultChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ShippingMethodChangeIsDefaultChange value = ShippingMethodChangeIsDefaultChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodChangeIsDefaultChange value = ShippingMethodChangeIsDefaultChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ShippingMethodChangeIsDefaultChange value = ShippingMethodChangeIsDefaultChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
