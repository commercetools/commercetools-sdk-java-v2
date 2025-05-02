
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomerIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomerIdActionBuilder builder) {
        OrderSetCustomerIdAction orderSetCustomerIdAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomerIdAction).isInstanceOf(OrderSetCustomerIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId", OrderSetCustomerIdAction.builder().customerId("customerId") } };
    }

    @Test
    public void customerId() {
        OrderSetCustomerIdAction value = OrderSetCustomerIdAction.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }
}
