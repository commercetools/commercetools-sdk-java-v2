
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderTransitionLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderTransitionLineItemStateActionBuilder builder) {
        OrderTransitionLineItemStateAction orderTransitionLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderTransitionLineItemStateAction)
                .isInstanceOf(OrderTransitionLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderTransitionLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderTransitionLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", OrderTransitionLineItemStateAction.builder().quantity(8L) },
                new Object[] { "fromState",
                        OrderTransitionLineItemStateAction.builder()
                                .fromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "toState",
                        OrderTransitionLineItemStateAction.builder()
                                .toState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "actualTransitionDate", OrderTransitionLineItemStateAction.builder()
                        .actualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void lineItemId() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setFromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void toState() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setToState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void actualTransitionDate() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setActualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getActualTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
