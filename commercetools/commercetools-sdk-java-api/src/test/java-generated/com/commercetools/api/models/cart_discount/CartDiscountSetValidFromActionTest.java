
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetValidFromActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetValidFromActionBuilder builder) {
        CartDiscountSetValidFromAction cartDiscountSetValidFromAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetValidFromAction).isInstanceOf(CartDiscountSetValidFromAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validFrom",
                CartDiscountSetValidFromAction.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        CartDiscountSetValidFromAction value = CartDiscountSetValidFromAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
