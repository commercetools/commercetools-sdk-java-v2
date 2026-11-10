
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingMethodTaxAmountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingMethodTaxAmountActionBuilder builder) {
        StagedOrderSetShippingMethodTaxAmountAction stagedOrderSetShippingMethodTaxAmountAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingMethodTaxAmountAction)
                .isInstanceOf(StagedOrderSetShippingMethodTaxAmountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey",
                        StagedOrderSetShippingMethodTaxAmountAction.builder().shippingKey("shippingKey") },
                new Object[] { "externalTaxAmount", StagedOrderSetShippingMethodTaxAmountAction.builder()
                        .externalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingMethodTaxAmountAction value = StagedOrderSetShippingMethodTaxAmountAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxAmount() {
        StagedOrderSetShippingMethodTaxAmountAction value = StagedOrderSetShippingMethodTaxAmountAction.of();
        value.setExternalTaxAmount(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
        Assertions.assertThat(value.getExternalTaxAmount())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxAmountDraftImpl());
    }
}
