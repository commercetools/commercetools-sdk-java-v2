
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomLineItemTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomLineItemTaxAmountActionBuilder builder) {
        StagedOrderSetCustomLineItemTaxAmountAction stagedOrderSetCustomLineItemTaxAmountAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemTaxAmountAction)
                .isInstanceOf(StagedOrderSetCustomLineItemTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderSetCustomLineItemTaxAmountAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderSetCustomLineItemTaxAmountAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "externalTaxAmount", StagedOrderSetCustomLineItemTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) },
                new Object[] { "shippingKey",
                        StagedOrderSetCustomLineItemTaxAmountAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetCustomLineItemTaxAmountAction value = StagedOrderSetCustomLineItemTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
