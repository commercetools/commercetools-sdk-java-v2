
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStatusDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStatusDraftBuilder builder) {
        PaymentStatusDraft paymentStatusDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentStatusDraft).isInstanceOf(PaymentStatusDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "interfaceCode", PaymentStatusDraft.builder().interfaceCode("interfaceCode") },
                new Object[] { "interfaceText", PaymentStatusDraft.builder().interfaceText("interfaceText") },
                new Object[] { "state", PaymentStatusDraft.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) } };
    }

    @Test
    public void interfaceCode() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setInterfaceCode("interfaceCode");
        Assertions.assertThat(value.getInterfaceCode()).isEqualTo("interfaceCode");
    }

    @Test
    public void interfaceText() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setInterfaceText("interfaceText");
        Assertions.assertThat(value.getInterfaceText()).isEqualTo("interfaceText");
    }

    @Test
    public void state() {
        PaymentStatusDraft value = PaymentStatusDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }
}
