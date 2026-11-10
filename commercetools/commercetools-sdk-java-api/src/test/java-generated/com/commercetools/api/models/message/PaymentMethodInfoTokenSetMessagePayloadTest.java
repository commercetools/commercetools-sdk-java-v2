
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoTokenSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoTokenSetMessagePayloadBuilder builder) {
        PaymentMethodInfoTokenSetMessagePayload paymentMethodInfoTokenSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoTokenSetMessagePayload)
                .isInstanceOf(PaymentMethodInfoTokenSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "token",
                        PaymentMethodInfoTokenSetMessagePayload.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "oldToken", PaymentMethodInfoTokenSetMessagePayload.builder()
                        .oldToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) } };
    }

    @Test
    public void token() {
        PaymentMethodInfoTokenSetMessagePayload value = PaymentMethodInfoTokenSetMessagePayload.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void oldToken() {
        PaymentMethodInfoTokenSetMessagePayload value = PaymentMethodInfoTokenSetMessagePayload.of();
        value.setOldToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getOldToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }
}
