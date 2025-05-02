
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemTaxRateActionBuilder builder) {
        StagedOrderSetLineItemTaxRateAction stagedOrderSetLineItemTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTaxRateAction)
                .isInstanceOf(StagedOrderSetLineItemTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", StagedOrderSetLineItemTaxRateAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemTaxRateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTaxRate",
                        StagedOrderSetLineItemTaxRateAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "shippingKey",
                        StagedOrderSetLineItemTaxRateAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingKey() {
        StagedOrderSetLineItemTaxRateAction value = StagedOrderSetLineItemTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
