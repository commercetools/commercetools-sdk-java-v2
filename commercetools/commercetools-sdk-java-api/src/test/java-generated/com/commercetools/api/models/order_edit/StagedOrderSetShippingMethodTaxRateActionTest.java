
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingMethodTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingMethodTaxRateActionBuilder builder) {
        StagedOrderSetShippingMethodTaxRateAction stagedOrderSetShippingMethodTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingMethodTaxRateAction)
                .isInstanceOf(StagedOrderSetShippingMethodTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey",
                        StagedOrderSetShippingMethodTaxRateAction.builder().shippingKey("shippingKey") },
                new Object[] { "externalTaxRate", StagedOrderSetShippingMethodTaxRateAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingKey() {
        StagedOrderSetShippingMethodTaxRateAction value = StagedOrderSetShippingMethodTaxRateAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetShippingMethodTaxRateAction value = StagedOrderSetShippingMethodTaxRateAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
