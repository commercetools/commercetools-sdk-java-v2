
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemTaxAmountActionBuilder builder) {
        CartSetLineItemTaxAmountAction cartSetLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemTaxAmountAction).isInstanceOf(CartSetLineItemTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemTaxAmountAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemTaxAmountAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTaxAmount", CartSetLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { "shippingKey", CartSetLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        CartSetLineItemTaxAmountAction value = CartSetLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
