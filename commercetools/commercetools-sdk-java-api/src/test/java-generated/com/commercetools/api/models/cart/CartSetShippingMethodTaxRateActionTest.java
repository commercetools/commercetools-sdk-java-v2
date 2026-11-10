
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingMethodTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingMethodTaxRateActionBuilder builder) {
        CartSetShippingMethodTaxRateAction cartSetShippingMethodTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingMethodTaxRateAction)
                .isInstanceOf(CartSetShippingMethodTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartSetShippingMethodTaxRateAction.builder().shippingKey("shippingKey") },
                new Object[] { "externalTaxRate", CartSetShippingMethodTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingMethodTaxRateAction value = CartSetShippingMethodTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetShippingMethodTaxRateAction value = CartSetShippingMethodTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
