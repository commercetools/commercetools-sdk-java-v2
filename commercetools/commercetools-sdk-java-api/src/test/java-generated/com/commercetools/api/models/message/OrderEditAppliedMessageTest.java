
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditAppliedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditAppliedMessageBuilder builder) {
        OrderEditAppliedMessage orderEditAppliedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderEditAppliedMessage).isInstanceOf(OrderEditAppliedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "edit",
                        OrderEditAppliedMessage.builder()
                                .edit(new com.commercetools.api.models.order_edit.OrderEditImpl()) },
                new Object[] { "result", OrderEditAppliedMessage.builder()
                        .result(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl()) } };
    }

    @Test
    public void edit() {
        OrderEditAppliedMessage value = OrderEditAppliedMessage.of();
        value.setEdit(new com.commercetools.api.models.order_edit.OrderEditImpl());
        Assertions.assertThat(value.getEdit()).isEqualTo(new com.commercetools.api.models.order_edit.OrderEditImpl());
    }

    @Test
    public void result() {
        OrderEditAppliedMessage value = OrderEditAppliedMessage.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
    }
}
