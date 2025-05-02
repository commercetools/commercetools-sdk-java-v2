
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetLineItemCustomFieldActionBuilder builder) {
        OrderSetLineItemCustomFieldAction orderSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetLineItemCustomFieldAction).isInstanceOf(OrderSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", OrderSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        OrderSetLineItemCustomFieldAction value = OrderSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderSetLineItemCustomFieldAction value = OrderSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        OrderSetLineItemCustomFieldAction value = OrderSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetLineItemCustomFieldAction value = OrderSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
