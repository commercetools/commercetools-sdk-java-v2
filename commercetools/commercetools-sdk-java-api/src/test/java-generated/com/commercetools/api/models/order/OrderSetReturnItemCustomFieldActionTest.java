
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetReturnItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetReturnItemCustomFieldActionBuilder builder) {
        OrderSetReturnItemCustomFieldAction orderSetReturnItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnItemCustomFieldAction)
                .isInstanceOf(OrderSetReturnItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderSetReturnItemCustomFieldAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        OrderSetReturnItemCustomFieldAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "name", OrderSetReturnItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetReturnItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void name() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
