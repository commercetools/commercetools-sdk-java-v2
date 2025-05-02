
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderStateTransitionMessageBuilder builder) {
        OrderStateTransitionMessage orderStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(orderStateTransitionMessage).isInstanceOf(OrderStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        OrderStateTransitionMessage.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        OrderStateTransitionMessage.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", OrderStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        OrderStateTransitionMessage value = OrderStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        OrderStateTransitionMessage value = OrderStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        OrderStateTransitionMessage value = OrderStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
