
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingRateInputTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingRateInputBuilder builder) {
        ShippingRateInput shippingRateInput = builder.buildUnchecked();
        Assertions.assertThat(shippingRateInput).isInstanceOf(ShippingRateInput.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", ShippingRateInput.builder().type("type") } };
    }

    @Test
    public void type() {
        ShippingRateInput value = ShippingRateInput.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
