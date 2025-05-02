
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeNameActionBuilder builder) {
        ShippingMethodChangeNameAction shippingMethodChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeNameAction).isInstanceOf(ShippingMethodChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ShippingMethodChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ShippingMethodChangeNameAction value = ShippingMethodChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
