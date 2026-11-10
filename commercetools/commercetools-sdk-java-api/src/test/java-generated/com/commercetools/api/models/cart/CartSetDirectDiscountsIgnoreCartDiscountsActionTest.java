
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetDirectDiscountsIgnoreCartDiscountsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder) {
        CartSetDirectDiscountsIgnoreCartDiscountsAction cartSetDirectDiscountsIgnoreCartDiscountsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetDirectDiscountsIgnoreCartDiscountsAction)
                .isInstanceOf(CartSetDirectDiscountsIgnoreCartDiscountsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "directDiscountsIgnoreCartDiscounts",
                CartSetDirectDiscountsIgnoreCartDiscountsAction.builder().directDiscountsIgnoreCartDiscounts(true) } };
    }

    @Test
    public void directDiscountsIgnoreCartDiscounts() {
        CartSetDirectDiscountsIgnoreCartDiscountsAction value = CartSetDirectDiscountsIgnoreCartDiscountsAction.of();
        value.setDirectDiscountsIgnoreCartDiscounts(true);
        Assertions.assertThat(value.getDirectDiscountsIgnoreCartDiscounts()).isEqualTo(true);
    }
}
