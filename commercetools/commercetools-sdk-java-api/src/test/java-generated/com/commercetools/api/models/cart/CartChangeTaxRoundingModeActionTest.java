
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeTaxRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeTaxRoundingModeActionBuilder builder) {
        CartChangeTaxRoundingModeAction cartChangeTaxRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeTaxRoundingModeAction).isInstanceOf(CartChangeTaxRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxRoundingMode", CartChangeTaxRoundingModeAction.builder()
                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void taxRoundingMode() {
        CartChangeTaxRoundingModeAction value = CartChangeTaxRoundingModeAction.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
