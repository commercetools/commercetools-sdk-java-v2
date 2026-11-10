
package com.commercetools.api.models.payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentUpdateBuilder builder) {
        PaymentUpdate paymentUpdate = builder.buildUnchecked();
        Assertions.assertThat(paymentUpdate).isInstanceOf(PaymentUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", PaymentUpdate.builder().version(2L) },
                new Object[] { "actions",
                        PaymentUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.payment.PaymentUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        PaymentUpdate value = PaymentUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        PaymentUpdate value = PaymentUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.payment.PaymentUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.payment.PaymentUpdateActionImpl()));
    }
}
