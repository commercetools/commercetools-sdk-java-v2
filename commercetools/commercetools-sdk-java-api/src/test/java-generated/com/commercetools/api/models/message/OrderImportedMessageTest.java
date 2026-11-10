
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderImportedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderImportedMessageBuilder builder) {
        OrderImportedMessage orderImportedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderImportedMessage).isInstanceOf(OrderImportedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "order",
                OrderImportedMessage.builder().order(new com.commercetools.api.models.order.OrderImpl()) } };
    }

    @Test
    public void order() {
        OrderImportedMessage value = OrderImportedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }
}
