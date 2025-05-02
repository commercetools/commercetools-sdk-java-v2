
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusBuilder builder) {
        PaymentStatus paymentStatus = builder.buildUnchecked();
        Assertions.assertThat(paymentStatus).isInstanceOf(PaymentStatus.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceCode", PaymentStatus.builder().interfaceCode("interfaceCode") },
                new Object[] { "interfaceText", PaymentStatus.builder().interfaceText("interfaceText") },
                new Object[] { "state",
                        PaymentStatus.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatus value = PaymentStatus.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }

    @Test
    public void interfaceText() {
        PaymentStatus value = PaymentStatus.of();
        value.setInterfaceText("interfaceText");
        Assertions.assertThat(value.getInterfaceText()).isEqualTo("interfaceText");
    }

    @Test
    public void state() {
        PaymentStatus value = PaymentStatus.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
