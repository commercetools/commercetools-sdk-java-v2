
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeTaxModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeTaxModeActionBuilder builder) {
        CartChangeTaxModeAction cartChangeTaxModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeTaxModeAction).isInstanceOf(CartChangeTaxModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxMode", CartChangeTaxModeAction.builder()
                .taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void taxMode() {
        CartChangeTaxModeAction value = CartChangeTaxModeAction.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }
}
