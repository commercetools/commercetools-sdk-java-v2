
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetPredicateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetPredicateChangeBuilder builder) {
        ShippingMethodSetPredicateChange shippingMethodSetPredicateChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetPredicateChange).isInstanceOf(ShippingMethodSetPredicateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodSetPredicateChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodSetPredicateChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ShippingMethodSetPredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ShippingMethodSetPredicateChange value = ShippingMethodSetPredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetPredicateChange value = ShippingMethodSetPredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ShippingMethodSetPredicateChange value = ShippingMethodSetPredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
