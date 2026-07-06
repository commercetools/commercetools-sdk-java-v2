
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetKeyChangeBuilder builder) {
        ShippingMethodSetKeyChange shippingMethodSetKeyChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetKeyChange).isInstanceOf(ShippingMethodSetKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodSetKeyChange.builder().change("change") },
                new Object[] { "previousValue", ShippingMethodSetKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ShippingMethodSetKeyChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ShippingMethodSetKeyChange value = ShippingMethodSetKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetKeyChange value = ShippingMethodSetKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ShippingMethodSetKeyChange value = ShippingMethodSetKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
