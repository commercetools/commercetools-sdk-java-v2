
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemTaxAmountActionBuilder builder) {
        CartSetCustomLineItemTaxAmountAction cartSetCustomLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemTaxAmountAction)
                .isInstanceOf(CartSetCustomLineItemTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemTaxAmountAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemTaxAmountAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "externalTaxAmount", CartSetCustomLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { "shippingKey",
                        CartSetCustomLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetCustomLineItemTaxAmountAction value = CartSetCustomLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
