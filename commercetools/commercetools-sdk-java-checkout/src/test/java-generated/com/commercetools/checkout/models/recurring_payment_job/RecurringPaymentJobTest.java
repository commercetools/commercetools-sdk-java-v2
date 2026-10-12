
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentJobTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentJobBuilder builder) {
        RecurringPaymentJob recurringPaymentJob = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentJob).isInstanceOf(RecurringPaymentJob.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringPaymentJob.builder().id("id") },
                new Object[] { "version", RecurringPaymentJob.builder().version(2) },
                new Object[] { "key", RecurringPaymentJob.builder().key("key") },
                new Object[] { "originPayment",
                        RecurringPaymentJob.builder()
                                .originPayment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) },
                new Object[] { "paymentMethod", RecurringPaymentJob.builder()
                        .paymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl()) },
                new Object[] { "recurringPayments", RecurringPaymentJob.builder()
                        .recurringPayments(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.RecurringPaymentReferenceImpl())) },
                new Object[] { "status", RecurringPaymentJob.builder()
                        .status(
                            new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobStatusImpl()) },
                new Object[] { "createdAt",
                        RecurringPaymentJob.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        RecurringPaymentJob.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void key() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void originPayment() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setOriginPayment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getOriginPayment())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void paymentMethod() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setPaymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
    }

    @Test
    public void recurringPayments() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setRecurringPayments(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment.RecurringPaymentReferenceImpl()));
        Assertions.assertThat(value.getRecurringPayments())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment.RecurringPaymentReferenceImpl()));
    }

    @Test
    public void status() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setStatus(new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobStatusImpl());
        Assertions.assertThat(value.getStatus())
                .isEqualTo(new com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJobStatusImpl());
    }

    @Test
    public void createdAt() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        RecurringPaymentJob value = RecurringPaymentJob.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
