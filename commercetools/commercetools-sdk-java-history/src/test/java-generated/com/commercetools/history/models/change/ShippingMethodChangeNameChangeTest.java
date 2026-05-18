
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeNameChangeBuilder builder) {
        ShippingMethodChangeNameChange shippingMethodChangeNameChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeNameChange).isInstanceOf(ShippingMethodChangeNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodChangeNameChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodChangeNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ShippingMethodChangeNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ShippingMethodChangeNameChange value = ShippingMethodChangeNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodChangeNameChange value = ShippingMethodChangeNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ShippingMethodChangeNameChange value = ShippingMethodChangeNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
