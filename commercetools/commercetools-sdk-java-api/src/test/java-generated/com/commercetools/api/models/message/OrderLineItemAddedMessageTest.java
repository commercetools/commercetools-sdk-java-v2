
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemAddedMessageBuilder builder) {
        OrderLineItemAddedMessage orderLineItemAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemAddedMessage).isInstanceOf(OrderLineItemAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItem",
                        OrderLineItemAddedMessage.builder()
                                .lineItem(new com.commercetools.api.models.cart.LineItemImpl()) },
                new Object[] { "addedQuantity", OrderLineItemAddedMessage.builder().addedQuantity(2L) } };
    }

    @Test
    public void lineItem() {
        OrderLineItemAddedMessage value = OrderLineItemAddedMessage.of();
        value.setLineItem(new com.commercetools.api.models.cart.LineItemImpl());
        Assertions.assertThat(value.getLineItem()).isEqualTo(new com.commercetools.api.models.cart.LineItemImpl());
    }

    @Test
    public void addedQuantity() {
        OrderLineItemAddedMessage value = OrderLineItemAddedMessage.of();
        value.setAddedQuantity(2L);
        Assertions.assertThat(value.getAddedQuantity()).isEqualTo(2L);
    }
}
