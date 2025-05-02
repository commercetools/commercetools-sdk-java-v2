
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder) {
        StagedOrderSetCustomLineItemShippingDetailsAction stagedOrderSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(StagedOrderSetCustomLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                                .customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                                .customLineItemKey("customLineItemKey") },
                new Object[] { "shippingDetails", StagedOrderSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        StagedOrderSetCustomLineItemShippingDetailsAction value = StagedOrderSetCustomLineItemShippingDetailsAction
                .of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
