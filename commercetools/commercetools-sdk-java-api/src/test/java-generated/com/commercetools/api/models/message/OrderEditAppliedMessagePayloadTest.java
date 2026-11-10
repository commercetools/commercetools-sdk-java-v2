
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditAppliedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditAppliedMessagePayloadBuilder builder) {
        OrderEditAppliedMessagePayload orderEditAppliedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderEditAppliedMessagePayload).isInstanceOf(OrderEditAppliedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "edit",
                        OrderEditAppliedMessagePayload.builder()
                                .edit(new com.commercetools.api.models.order_edit.OrderEditImpl()) },
                new Object[] { "result", OrderEditAppliedMessagePayload.builder()
                        .result(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl()) } };
    }

    @Test
    public void edit() {
        OrderEditAppliedMessagePayload value = OrderEditAppliedMessagePayload.of();
        value.setEdit(new com.commercetools.api.models.order_edit.OrderEditImpl());
        Assertions.assertThat(value.getEdit()).isEqualTo(new com.commercetools.api.models.order_edit.OrderEditImpl());
    }

    @Test
    public void result() {
        OrderEditAppliedMessagePayload value = OrderEditAppliedMessagePayload.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
    }
}
