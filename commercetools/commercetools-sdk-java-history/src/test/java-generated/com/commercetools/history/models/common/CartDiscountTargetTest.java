
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountTargetBuilder builder) {
        CartDiscountTarget cartDiscountTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountTarget).isInstanceOf(CartDiscountTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", CartDiscountTarget.builder().type("type") } };
    }

    @Test
    public void type() {
        CartDiscountTarget value = CartDiscountTarget.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
