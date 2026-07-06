
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentFailureErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentFailureErrorBuilder builder) {
        PaymentFailureError paymentFailureError = builder.buildUnchecked();
        Assertions.assertThat(paymentFailureError).isInstanceOf(PaymentFailureError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", PaymentFailureError.builder().message("message") } };
    }

    @Test
    public void message() {
        PaymentFailureError value = PaymentFailureError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
