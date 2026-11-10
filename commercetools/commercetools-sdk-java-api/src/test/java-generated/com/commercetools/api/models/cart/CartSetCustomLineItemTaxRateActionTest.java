
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemTaxRateActionBuilder builder) {
        CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemTaxRateAction)
                .isInstanceOf(CartSetCustomLineItemTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemTaxRateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemTaxRateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "externalTaxRate",
                        CartSetCustomLineItemTaxRateAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "shippingKey",
                        CartSetCustomLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxRate() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetCustomLineItemTaxRateAction value = CartSetCustomLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
