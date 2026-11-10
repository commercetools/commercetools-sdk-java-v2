
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetDirectDiscountsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetDirectDiscountsActionBuilder builder) {
        CartSetDirectDiscountsAction cartSetDirectDiscountsAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetDirectDiscountsAction).isInstanceOf(CartSetDirectDiscountsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discounts", CartSetDirectDiscountsAction.builder()
                .discounts(
                    Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl())) } };
    }

    @Test
    public void discounts() {
        CartSetDirectDiscountsAction value = CartSetDirectDiscountsAction.of();
        value.setDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
        Assertions.assertThat(value.getDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountDraftImpl()));
    }
}
