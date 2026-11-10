
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeTaxCalculationModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeTaxCalculationModeActionBuilder builder) {
        CartChangeTaxCalculationModeAction cartChangeTaxCalculationModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeTaxCalculationModeAction)
                .isInstanceOf(CartChangeTaxCalculationModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxCalculationMode", CartChangeTaxCalculationModeAction.builder()
                .taxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) } };
    }

    @Test
    public void taxCalculationMode() {
        CartChangeTaxCalculationModeAction value = CartChangeTaxCalculationModeAction.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }
}
