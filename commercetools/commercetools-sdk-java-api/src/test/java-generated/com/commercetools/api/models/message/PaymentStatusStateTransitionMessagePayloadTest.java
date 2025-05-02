
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusStateTransitionMessagePayloadBuilder builder) {
        PaymentStatusStateTransitionMessagePayload paymentStatusStateTransitionMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentStatusStateTransitionMessagePayload)
                .isInstanceOf(PaymentStatusStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        PaymentStatusStateTransitionMessagePayload.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", PaymentStatusStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        PaymentStatusStateTransitionMessagePayload value = PaymentStatusStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        PaymentStatusStateTransitionMessagePayload value = PaymentStatusStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
