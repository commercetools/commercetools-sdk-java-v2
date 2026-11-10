
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingRateInputActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingRateInputActionBuilder builder) {
        StagedOrderSetShippingRateInputAction stagedOrderSetShippingRateInputAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingRateInputAction)
                .isInstanceOf(StagedOrderSetShippingRateInputAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingRateInput", StagedOrderSetShippingRateInputAction.builder()
                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        StagedOrderSetShippingRateInputAction value = StagedOrderSetShippingRateInputAction.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }
}
