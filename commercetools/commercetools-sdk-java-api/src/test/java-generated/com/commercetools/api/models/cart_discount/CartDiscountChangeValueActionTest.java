
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeValueActionBuilder builder) {
        CartDiscountChangeValueAction cartDiscountChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeValueAction).isInstanceOf(CartDiscountChangeValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", CartDiscountChangeValueAction.builder()
                .value(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl()) } };
    }

    @Test
    public void value() {
        CartDiscountChangeValueAction value = CartDiscountChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
    }
}
