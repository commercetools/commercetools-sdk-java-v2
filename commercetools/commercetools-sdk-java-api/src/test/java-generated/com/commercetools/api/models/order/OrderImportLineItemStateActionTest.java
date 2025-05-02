
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderImportLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderImportLineItemStateActionBuilder builder) {
        OrderImportLineItemStateAction orderImportLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderImportLineItemStateAction).isInstanceOf(OrderImportLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderImportLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderImportLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "state", OrderImportLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void state() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
