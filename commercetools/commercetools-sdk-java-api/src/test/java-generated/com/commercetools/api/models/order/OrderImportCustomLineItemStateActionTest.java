
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderImportCustomLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderImportCustomLineItemStateActionBuilder builder) {
        OrderImportCustomLineItemStateAction orderImportCustomLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderImportCustomLineItemStateAction)
                .isInstanceOf(OrderImportCustomLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderImportCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderImportCustomLineItemStateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "state", OrderImportCustomLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void customLineItemId() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void state() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
