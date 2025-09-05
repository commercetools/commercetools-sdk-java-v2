
package com.commercetools.checkout.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartReferenceBuilder builder) {
        CartReference cartReference = builder.buildUnchecked();
        Assertions.assertThat(cartReference).isInstanceOf(CartReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CartReference value = CartReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
