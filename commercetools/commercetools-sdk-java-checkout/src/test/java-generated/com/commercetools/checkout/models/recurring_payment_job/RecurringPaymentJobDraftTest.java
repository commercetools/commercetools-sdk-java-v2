
package com.commercetools.checkout.models.recurring_payment_job;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentJobDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentJobDraftBuilder builder) {
        RecurringPaymentJobDraft recurringPaymentJobDraft = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentJobDraft).isInstanceOf(RecurringPaymentJobDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringPaymentJobDraft.builder().key("key") },
                new Object[] { "originPayment",
                        RecurringPaymentJobDraft.builder()
                                .originPayment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) },
                new Object[] { "paymentMethod", RecurringPaymentJobDraft.builder()
                        .paymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl()) } };
    }

    @Test
    public void key() {
        RecurringPaymentJobDraft value = RecurringPaymentJobDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void originPayment() {
        RecurringPaymentJobDraft value = RecurringPaymentJobDraft.of();
        value.setOriginPayment(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getOriginPayment())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void paymentMethod() {
        RecurringPaymentJobDraft value = RecurringPaymentJobDraft.of();
        value.setPaymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
    }
}
