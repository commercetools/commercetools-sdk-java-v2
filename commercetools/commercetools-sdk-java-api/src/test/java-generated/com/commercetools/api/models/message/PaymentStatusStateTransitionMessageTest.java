
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusStateTransitionMessageBuilder builder) {
        PaymentStatusStateTransitionMessage paymentStatusStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusStateTransitionMessage)
                .isInstanceOf(PaymentStatusStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        PaymentStatusStateTransitionMessage.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", PaymentStatusStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        PaymentStatusStateTransitionMessage value = PaymentStatusStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        PaymentStatusStateTransitionMessage value = PaymentStatusStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
