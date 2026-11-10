
package com.commercetools.api.models.payment_method;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodUpdateBuilder builder) {
        PaymentMethodUpdate paymentMethodUpdate = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodUpdate).isInstanceOf(PaymentMethodUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", PaymentMethodUpdate.builder().version(2L) },
                new Object[] { "actions", PaymentMethodUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.payment_method.PaymentMethodUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        PaymentMethodUpdate value = PaymentMethodUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        PaymentMethodUpdate value = PaymentMethodUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.payment_method.PaymentMethodUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.payment_method.PaymentMethodUpdateActionImpl()));
    }
}
