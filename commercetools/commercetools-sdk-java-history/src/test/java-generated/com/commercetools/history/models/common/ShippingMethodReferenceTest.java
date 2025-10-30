
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodReferenceBuilder builder) {
        ShippingMethodReference shippingMethodReference = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodReference).isInstanceOf(ShippingMethodReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShippingMethodReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ShippingMethodReference value = ShippingMethodReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
