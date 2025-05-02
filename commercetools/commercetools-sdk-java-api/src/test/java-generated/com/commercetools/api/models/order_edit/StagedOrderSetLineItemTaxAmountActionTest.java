
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemTaxAmountActionBuilder builder) {
        StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTaxAmountAction)
                .isInstanceOf(StagedOrderSetLineItemTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", StagedOrderSetLineItemTaxAmountAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemTaxAmountAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTaxAmount", StagedOrderSetLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { "shippingKey",
                        StagedOrderSetLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetLineItemTaxAmountAction value = StagedOrderSetLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
