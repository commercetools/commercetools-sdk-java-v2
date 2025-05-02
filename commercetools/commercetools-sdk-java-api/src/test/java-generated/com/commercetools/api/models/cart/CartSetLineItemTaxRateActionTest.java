
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemTaxRateActionBuilder builder) {
        CartSetLineItemTaxRateAction cartSetLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemTaxRateAction).isInstanceOf(CartSetLineItemTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemTaxRateAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemTaxRateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTaxRate",
                        CartSetLineItemTaxRateAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "shippingKey", CartSetLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetLineItemTaxRateAction value = CartSetLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
