
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodLabelBuilder builder) {
        ShippingMethodLabel shippingMethodLabel = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodLabel).isInstanceOf(ShippingMethodLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShippingMethodLabel.builder().key("key") },
                new Object[] { "name", ShippingMethodLabel.builder().name("name") } };
    }

    @Test
    public void key() {
        ShippingMethodLabel value = ShippingMethodLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ShippingMethodLabel value = ShippingMethodLabel.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
