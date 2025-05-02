
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeValueBuilder builder) {
        ShippingMethodChangeValue shippingMethodChangeValue = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeValue).isInstanceOf(ShippingMethodChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShippingMethodChangeValue.builder().id("id") },
                new Object[] { "name", ShippingMethodChangeValue.builder().name("name") } };
    }

    @Test
    public void id() {
        ShippingMethodChangeValue value = ShippingMethodChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ShippingMethodChangeValue value = ShippingMethodChangeValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
