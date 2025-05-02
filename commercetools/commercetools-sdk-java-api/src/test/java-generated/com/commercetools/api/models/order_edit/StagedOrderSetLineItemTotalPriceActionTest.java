
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemTotalPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemTotalPriceActionBuilder builder) {
        StagedOrderSetLineItemTotalPriceAction stagedOrderSetLineItemTotalPriceAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemTotalPriceAction)
                .isInstanceOf(StagedOrderSetLineItemTotalPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        StagedOrderSetLineItemTotalPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemTotalPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTotalPrice", StagedOrderSetLineItemTotalPriceAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTotalPrice() {
        StagedOrderSetLineItemTotalPriceAction value = StagedOrderSetLineItemTotalPriceAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
