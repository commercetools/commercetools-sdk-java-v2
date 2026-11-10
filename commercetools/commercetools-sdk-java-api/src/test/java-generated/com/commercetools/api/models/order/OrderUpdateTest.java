
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderUpdateBuilder builder) {
        OrderUpdate orderUpdate = builder.buildUnchecked();
        Assertions.assertThat(orderUpdate).isInstanceOf(OrderUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", OrderUpdate.builder().version(2L) }, new Object[] { "actions",
                OrderUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        OrderUpdate value = OrderUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        OrderUpdate value = OrderUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl()));
    }
}
