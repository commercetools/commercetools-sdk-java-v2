
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetValidFromAndUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetValidFromAndUntilActionBuilder builder) {
        CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetValidFromAndUntilAction)
                .isInstanceOf(CartDiscountSetValidFromAndUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "validFrom",
                        CartDiscountSetValidFromAndUntilAction.builder()
                                .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil", CartDiscountSetValidFromAndUntilAction.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        CartDiscountSetValidFromAndUntilAction value = CartDiscountSetValidFromAndUntilAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        CartDiscountSetValidFromAndUntilAction value = CartDiscountSetValidFromAndUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
