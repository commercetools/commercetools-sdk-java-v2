
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingRateInputActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingRateInputActionBuilder builder) {
        CartSetShippingRateInputAction cartSetShippingRateInputAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingRateInputAction).isInstanceOf(CartSetShippingRateInputAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingRateInput", CartSetShippingRateInputAction.builder()
                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        CartSetShippingRateInputAction value = CartSetShippingRateInputAction.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }
}
