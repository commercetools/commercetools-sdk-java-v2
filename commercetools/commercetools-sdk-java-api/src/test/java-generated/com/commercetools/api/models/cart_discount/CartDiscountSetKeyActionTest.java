
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetKeyActionBuilder builder) {
        CartDiscountSetKeyAction cartDiscountSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetKeyAction).isInstanceOf(CartDiscountSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CartDiscountSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        CartDiscountSetKeyAction value = CartDiscountSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
