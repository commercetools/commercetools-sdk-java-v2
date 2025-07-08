
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCreatedFromRecurringOrderMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCreatedFromRecurringOrderMessageBuilder builder) {
        OrderCreatedFromRecurringOrderMessage orderCreatedFromRecurringOrderMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCreatedFromRecurringOrderMessage)
                .isInstanceOf(OrderCreatedFromRecurringOrderMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "order",
                        OrderCreatedFromRecurringOrderMessage.builder()
                                .order(new com.commercetools.api.models.order.OrderImpl()) },
                new Object[] { "recurringOrderRef",
                        OrderCreatedFromRecurringOrderMessage.builder()
                                .recurringOrderRef(
                                    new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl()) } };
    }

    @Test
    public void order() {
        OrderCreatedFromRecurringOrderMessage value = OrderCreatedFromRecurringOrderMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }

    @Test
    public void recurringOrderRef() {
        OrderCreatedFromRecurringOrderMessage value = OrderCreatedFromRecurringOrderMessage.of();
        value.setRecurringOrderRef(new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl());
        Assertions.assertThat(value.getRecurringOrderRef())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl());
    }
}
