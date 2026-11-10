
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomFieldActionBuilder builder) {
        OrderSetCustomFieldAction orderSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomFieldAction).isInstanceOf(OrderSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderSetCustomFieldAction value = OrderSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetCustomFieldAction value = OrderSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
