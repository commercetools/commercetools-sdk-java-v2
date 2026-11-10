
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetOrderNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetOrderNumberActionBuilder builder) {
        OrderSetOrderNumberAction orderSetOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetOrderNumberAction).isInstanceOf(OrderSetOrderNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "orderNumber", OrderSetOrderNumberAction.builder().orderNumber("orderNumber") } };
    }

    @Test
    public void orderNumber() {
        OrderSetOrderNumberAction value = OrderSetOrderNumberAction.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }
}
