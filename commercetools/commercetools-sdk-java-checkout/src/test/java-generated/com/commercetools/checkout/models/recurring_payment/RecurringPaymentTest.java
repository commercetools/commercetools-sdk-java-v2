
package com.commercetools.checkout.models.recurring_payment;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentBuilder builder) {
        RecurringPayment recurringPayment = builder.buildUnchecked();
        Assertions.assertThat(recurringPayment).isInstanceOf(RecurringPayment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringPayment.builder().id("id") },
                new Object[] { "version", RecurringPayment.builder().version(2) },
                new Object[] { "key", RecurringPayment.builder().key("key") },
                new Object[] { "recurringOrder", RecurringPayment.builder()
                        .recurringOrder(
                            new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl()) },
                new Object[] { "paymentMethodConfigurations", RecurringPayment.builder()
                        .paymentMethodConfigurations(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl())) },
                new Object[] { "createdAt",
                        RecurringPayment.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        RecurringPayment.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        RecurringPayment value = RecurringPayment.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        RecurringPayment value = RecurringPayment.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void key() {
        RecurringPayment value = RecurringPayment.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void recurringOrder() {
        RecurringPayment value = RecurringPayment.of();
        value.setRecurringOrder(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
        Assertions.assertThat(value.getRecurringOrder())
                .isEqualTo(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
    }

    @Test
    public void paymentMethodConfigurations() {
        RecurringPayment value = RecurringPayment.of();
        value.setPaymentMethodConfigurations(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
        Assertions.assertThat(value.getPaymentMethodConfigurations())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
    }

    @Test
    public void createdAt() {
        RecurringPayment value = RecurringPayment.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        RecurringPayment value = RecurringPayment.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
