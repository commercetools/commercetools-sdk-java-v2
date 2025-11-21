
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueBuilder builder) {
        CartDiscountValue cartDiscountValue = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValue).isInstanceOf(CartDiscountValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", CartDiscountValue.builder().type("type") } };
    }

    @Test
    public void type() {
        CartDiscountValue value = CartDiscountValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
