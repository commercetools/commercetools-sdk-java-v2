
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingMethodTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingMethodTaxAmountActionBuilder builder) {
        CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingMethodTaxAmountAction)
                .isInstanceOf(CartSetShippingMethodTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey",
                        CartSetShippingMethodTaxAmountAction.builder().shippingKey("shippingKey") },
                new Object[] { "externalTaxAmount", CartSetShippingMethodTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingMethodTaxAmountAction value = CartSetShippingMethodTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetShippingMethodTaxAmountAction value = CartSetShippingMethodTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }
}
