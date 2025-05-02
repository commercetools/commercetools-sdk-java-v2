
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodResourceIdentifierBuilder builder) {
        ShippingMethodResourceIdentifier shippingMethodResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodResourceIdentifier).isInstanceOf(ShippingMethodResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShippingMethodResourceIdentifier.builder().id("id") },
                new Object[] { "key", ShippingMethodResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ShippingMethodResourceIdentifier value = ShippingMethodResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ShippingMethodResourceIdentifier value = ShippingMethodResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
