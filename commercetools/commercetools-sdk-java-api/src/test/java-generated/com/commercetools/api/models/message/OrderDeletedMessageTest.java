
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDeletedMessageBuilder builder) {
        OrderDeletedMessage orderDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderDeletedMessage).isInstanceOf(OrderDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "order",
                OrderDeletedMessage.builder().order(new com.commercetools.api.models.order.OrderImpl()) } };
    }

    @Test
    public void order() {
        OrderDeletedMessage value = OrderDeletedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }
}
