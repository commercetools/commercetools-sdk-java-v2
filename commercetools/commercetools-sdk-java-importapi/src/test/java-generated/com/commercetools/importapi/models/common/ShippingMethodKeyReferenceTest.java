
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodKeyReferenceBuilder builder) {
        ShippingMethodKeyReference shippingMethodKeyReference = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodKeyReference).isInstanceOf(ShippingMethodKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShippingMethodKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        ShippingMethodKeyReference value = ShippingMethodKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
