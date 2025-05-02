
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemAddedMessagePayloadBuilder builder) {
        OrderLineItemAddedMessagePayload orderLineItemAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemAddedMessagePayload).isInstanceOf(OrderLineItemAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItem",
                        OrderLineItemAddedMessagePayload.builder()
                                .lineItem(new com.commercetools.api.models.cart.LineItemImpl()) },
                new Object[] { "addedQuantity", OrderLineItemAddedMessagePayload.builder().addedQuantity(2L) } };
    }

    @Test
    public void lineItem() {
        OrderLineItemAddedMessagePayload value = OrderLineItemAddedMessagePayload.of();
        value.setLineItem(new com.commercetools.api.models.cart.LineItemImpl());
        Assertions.assertThat(value.getLineItem()).isEqualTo(new com.commercetools.api.models.cart.LineItemImpl());
    }

    @Test
    public void addedQuantity() {
        OrderLineItemAddedMessagePayload value = OrderLineItemAddedMessagePayload.of();
        value.setAddedQuantity(2L);
        Assertions.assertThat(value.getAddedQuantity()).isEqualTo(2L);
    }
}
