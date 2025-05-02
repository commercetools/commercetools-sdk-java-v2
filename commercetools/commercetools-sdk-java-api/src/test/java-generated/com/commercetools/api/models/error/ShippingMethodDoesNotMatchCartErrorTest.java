
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodDoesNotMatchCartErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodDoesNotMatchCartErrorBuilder builder) {
        ShippingMethodDoesNotMatchCartError shippingMethodDoesNotMatchCartError = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodDoesNotMatchCartError)
                .isInstanceOf(ShippingMethodDoesNotMatchCartError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ShippingMethodDoesNotMatchCartError.builder().message("message") } };
    }

    @Test
    public void message() {
        ShippingMethodDoesNotMatchCartError value = ShippingMethodDoesNotMatchCartError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
