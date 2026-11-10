
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetValidUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetValidUntilActionBuilder builder) {
        CartDiscountSetValidUntilAction cartDiscountSetValidUntilAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetValidUntilAction).isInstanceOf(CartDiscountSetValidUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validUntil",
                CartDiscountSetValidUntilAction.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        CartDiscountSetValidUntilAction value = CartDiscountSetValidUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
