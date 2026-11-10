
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountCreatedMessagePayloadBuilder builder) {
        CartDiscountCreatedMessagePayload cartDiscountCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCreatedMessagePayload).isInstanceOf(CartDiscountCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartDiscount", CartDiscountCreatedMessagePayload.builder()
                .cartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl()) } };
    }

    @Test
    public void cartDiscount() {
        CartDiscountCreatedMessagePayload value = CartDiscountCreatedMessagePayload.of();
        value.setCartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
        Assertions.assertThat(value.getCartDiscount())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
    }
}
