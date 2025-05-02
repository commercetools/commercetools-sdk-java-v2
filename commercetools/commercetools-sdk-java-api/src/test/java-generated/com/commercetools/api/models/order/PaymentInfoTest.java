
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentInfoBuilder builder) {
        PaymentInfo paymentInfo = builder.buildUnchecked();
        Assertions.assertThat(paymentInfo).isInstanceOf(PaymentInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payments", PaymentInfo.builder()
                .payments(
                    Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl())) } };
    }

    @Test
    public void payments() {
        PaymentInfo value = PaymentInfo.of();
        value.setPayments(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
        Assertions.assertThat(value.getPayments())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.payment.PaymentReferenceImpl()));
    }
}
