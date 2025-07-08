
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCreatedFromRecurringOrderMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCreatedFromRecurringOrderMessagePayloadBuilder builder) {
        OrderCreatedFromRecurringOrderMessagePayload orderCreatedFromRecurringOrderMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderCreatedFromRecurringOrderMessagePayload)
                .isInstanceOf(OrderCreatedFromRecurringOrderMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "order",
                        OrderCreatedFromRecurringOrderMessagePayload.builder()
                                .order(new com.commercetools.api.models.order.OrderImpl()) },
                new Object[] { "recurringOrderRef",
                        OrderCreatedFromRecurringOrderMessagePayload.builder()
                                .recurringOrderRef(
                                    new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl()) } };
    }

    @Test
    public void order() {
        OrderCreatedFromRecurringOrderMessagePayload value = OrderCreatedFromRecurringOrderMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }

    @Test
    public void recurringOrderRef() {
        OrderCreatedFromRecurringOrderMessagePayload value = OrderCreatedFromRecurringOrderMessagePayload.of();
        value.setRecurringOrderRef(new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl());
        Assertions.assertThat(value.getRecurringOrderRef())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderReferenceImpl());
    }
}
