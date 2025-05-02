
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomerEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomerEmailActionBuilder builder) {
        OrderSetCustomerEmailAction orderSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomerEmailAction).isInstanceOf(OrderSetCustomerEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", OrderSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        OrderSetCustomerEmailAction value = OrderSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
