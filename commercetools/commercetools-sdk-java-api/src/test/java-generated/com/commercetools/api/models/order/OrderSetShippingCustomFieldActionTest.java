
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetShippingCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetShippingCustomFieldActionBuilder builder) {
        OrderSetShippingCustomFieldAction orderSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetShippingCustomFieldAction).isInstanceOf(OrderSetShippingCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", OrderSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { "name", OrderSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
