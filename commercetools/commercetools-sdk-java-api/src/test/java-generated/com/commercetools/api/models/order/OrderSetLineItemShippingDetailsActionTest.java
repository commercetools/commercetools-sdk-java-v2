
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetLineItemShippingDetailsActionBuilder builder) {
        OrderSetLineItemShippingDetailsAction orderSetLineItemShippingDetailsAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetLineItemShippingDetailsAction)
                .isInstanceOf(OrderSetLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderSetLineItemShippingDetailsAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        OrderSetLineItemShippingDetailsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "shippingDetails", OrderSetLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderSetLineItemShippingDetailsAction value = OrderSetLineItemShippingDetailsAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderSetLineItemShippingDetailsAction value = OrderSetLineItemShippingDetailsAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void shippingDetails() {
        OrderSetLineItemShippingDetailsAction value = OrderSetLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
