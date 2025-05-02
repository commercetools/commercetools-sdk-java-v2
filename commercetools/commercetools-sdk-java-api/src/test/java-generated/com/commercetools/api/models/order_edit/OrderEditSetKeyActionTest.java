
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditSetKeyActionBuilder builder) {
        OrderEditSetKeyAction orderEditSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditSetKeyAction).isInstanceOf(OrderEditSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", OrderEditSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        OrderEditSetKeyAction value = OrderEditSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
