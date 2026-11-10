
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountCreatedMessageBuilder builder) {
        CartDiscountCreatedMessage cartDiscountCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCreatedMessage).isInstanceOf(CartDiscountCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartDiscount", CartDiscountCreatedMessage.builder()
                .cartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl()) } };
    }

    @Test
    public void cartDiscount() {
        CartDiscountCreatedMessage value = CartDiscountCreatedMessage.of();
        value.setCartDiscount(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
        Assertions.assertThat(value.getCartDiscount())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountImpl());
    }
}
