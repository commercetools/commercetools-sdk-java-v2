
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangePriceRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangePriceRoundingModeActionBuilder builder) {
        CartChangePriceRoundingModeAction cartChangePriceRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangePriceRoundingModeAction).isInstanceOf(CartChangePriceRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceRoundingMode", CartChangePriceRoundingModeAction.builder()
                .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void priceRoundingMode() {
        CartChangePriceRoundingModeAction value = CartChangePriceRoundingModeAction.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
