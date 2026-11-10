
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomLineItemShippingDetailsActionBuilder builder) {
        OrderSetCustomLineItemShippingDetailsAction orderSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(OrderSetCustomLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderSetCustomLineItemShippingDetailsAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderSetCustomLineItemShippingDetailsAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "shippingDetails", OrderSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        OrderSetCustomLineItemShippingDetailsAction value = OrderSetCustomLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
