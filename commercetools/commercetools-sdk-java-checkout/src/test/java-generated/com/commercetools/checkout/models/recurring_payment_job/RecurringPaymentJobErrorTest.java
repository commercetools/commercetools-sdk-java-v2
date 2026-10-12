
package com.commercetools.checkout.models.recurring_payment_job;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentJobErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentJobErrorBuilder builder) {
        RecurringPaymentJobError recurringPaymentJobError = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentJobError).isInstanceOf(RecurringPaymentJobError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", RecurringPaymentJobError.builder().code("code") },
                new Object[] { "message", RecurringPaymentJobError.builder().message("message") } };
    }

    @Test
    public void code() {
        RecurringPaymentJobError value = RecurringPaymentJobError.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        RecurringPaymentJobError value = RecurringPaymentJobError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
