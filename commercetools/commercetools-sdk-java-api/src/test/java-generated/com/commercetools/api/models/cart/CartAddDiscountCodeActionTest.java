
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddDiscountCodeActionBuilder builder) {
        CartAddDiscountCodeAction cartAddDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddDiscountCodeAction).isInstanceOf(CartAddDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", CartAddDiscountCodeAction.builder().code("code") } };
    }

    @Test
    public void code() {
        CartAddDiscountCodeAction value = CartAddDiscountCodeAction.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
