
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoTokenSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoTokenSetMessageBuilder builder) {
        PaymentMethodInfoTokenSetMessage paymentMethodInfoTokenSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoTokenSetMessage).isInstanceOf(PaymentMethodInfoTokenSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "token",
                        PaymentMethodInfoTokenSetMessage.builder()
                                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) },
                new Object[] { "oldToken", PaymentMethodInfoTokenSetMessage.builder()
                        .oldToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) } };
    }

    @Test
    public void token() {
        PaymentMethodInfoTokenSetMessage value = PaymentMethodInfoTokenSetMessage.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }

    @Test
    public void oldToken() {
        PaymentMethodInfoTokenSetMessage value = PaymentMethodInfoTokenSetMessage.of();
        value.setOldToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getOldToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }
}
