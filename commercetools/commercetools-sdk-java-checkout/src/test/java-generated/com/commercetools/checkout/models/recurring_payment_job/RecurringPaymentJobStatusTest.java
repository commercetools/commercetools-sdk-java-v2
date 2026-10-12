
package com.commercetools.checkout.models.recurring_payment_job;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentJobStatusTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentJobStatusBuilder builder) {
        RecurringPaymentJobStatus recurringPaymentJobStatus = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentJobStatus).isInstanceOf(RecurringPaymentJobStatus.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        RecurringPaymentJobStatus.builder()
                                .state(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState
                                        .findEnum("Initial")) },
                new Object[] { "attempts", RecurringPaymentJobStatus.builder().attempts(3) },
                new Object[] { "errors", RecurringPaymentJobStatus.builder()
                        .errors(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorImpl())) } };
    }

    @Test
    public void state() {
        RecurringPaymentJobStatus value = RecurringPaymentJobStatus.of();
        value.setState(
            com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobState
                        .findEnum("Initial"));
    }

    @Test
    public void attempts() {
        RecurringPaymentJobStatus value = RecurringPaymentJobStatus.of();
        value.setAttempts(3);
        Assertions.assertThat(value.getAttempts()).isEqualTo(3);
    }

    @Test
    public void errors() {
        RecurringPaymentJobStatus value = RecurringPaymentJobStatus.of();
        value.setErrors(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobErrorImpl()));
    }
}
