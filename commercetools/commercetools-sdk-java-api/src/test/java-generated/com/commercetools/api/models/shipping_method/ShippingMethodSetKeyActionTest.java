
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetKeyActionBuilder builder) {
        ShippingMethodSetKeyAction shippingMethodSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetKeyAction).isInstanceOf(ShippingMethodSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShippingMethodSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ShippingMethodSetKeyAction value = ShippingMethodSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
