
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditSetCustomFieldActionBuilder builder) {
        OrderEditSetCustomFieldAction orderEditSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderEditSetCustomFieldAction).isInstanceOf(OrderEditSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderEditSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderEditSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderEditSetCustomFieldAction value = OrderEditSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderEditSetCustomFieldAction value = OrderEditSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
