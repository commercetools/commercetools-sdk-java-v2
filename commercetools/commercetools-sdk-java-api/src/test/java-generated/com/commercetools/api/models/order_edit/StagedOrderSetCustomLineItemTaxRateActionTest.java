
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomLineItemTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomLineItemTaxRateActionBuilder builder) {
        StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemTaxRateAction)
                .isInstanceOf(StagedOrderSetCustomLineItemTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderSetCustomLineItemTaxRateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderSetCustomLineItemTaxRateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "externalTaxRate",
                        StagedOrderSetCustomLineItemTaxRateAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "shippingKey",
                        StagedOrderSetCustomLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetCustomLineItemTaxRateAction value = StagedOrderSetCustomLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
