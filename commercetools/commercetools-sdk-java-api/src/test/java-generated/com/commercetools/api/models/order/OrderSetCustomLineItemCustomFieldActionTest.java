
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetCustomLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetCustomLineItemCustomFieldActionBuilder builder) {
        OrderSetCustomLineItemCustomFieldAction orderSetCustomLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemCustomFieldAction)
                .isInstanceOf(OrderSetCustomLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderSetCustomLineItemCustomFieldAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "name", OrderSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
