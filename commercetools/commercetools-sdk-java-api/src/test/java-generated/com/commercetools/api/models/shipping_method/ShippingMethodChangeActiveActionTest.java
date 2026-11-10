
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeActiveActionBuilder builder) {
        ShippingMethodChangeActiveAction shippingMethodChangeActiveAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeActiveAction).isInstanceOf(ShippingMethodChangeActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "active", ShippingMethodChangeActiveAction.builder().active(true) } };
    }

    @Test
    public void active() {
        ShippingMethodChangeActiveAction value = ShippingMethodChangeActiveAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
