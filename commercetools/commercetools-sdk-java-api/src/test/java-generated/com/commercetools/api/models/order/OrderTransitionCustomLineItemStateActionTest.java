
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderTransitionCustomLineItemStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderTransitionCustomLineItemStateActionBuilder builder) {
        OrderTransitionCustomLineItemStateAction orderTransitionCustomLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderTransitionCustomLineItemStateAction)
                .isInstanceOf(OrderTransitionCustomLineItemStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderTransitionCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderTransitionCustomLineItemStateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "quantity", OrderTransitionCustomLineItemStateAction.builder().quantity(8L) },
                new Object[] { "fromState",
                        OrderTransitionCustomLineItemStateAction.builder()
                                .fromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "toState",
                        OrderTransitionCustomLineItemStateAction.builder()
                                .toState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "actualTransitionDate", OrderTransitionCustomLineItemStateAction.builder()
                        .actualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customLineItemId() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setFromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void toState() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setToState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void actualTransitionDate() {
        OrderTransitionCustomLineItemStateAction value = OrderTransitionCustomLineItemStateAction.of();
        value.setActualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getActualTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
