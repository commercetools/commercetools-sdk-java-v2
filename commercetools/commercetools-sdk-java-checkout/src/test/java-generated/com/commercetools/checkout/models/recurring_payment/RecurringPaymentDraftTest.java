
package com.commercetools.checkout.models.recurring_payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentDraftBuilder builder) {
        RecurringPaymentDraft recurringPaymentDraft = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentDraft).isInstanceOf(RecurringPaymentDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringPaymentDraft.builder().key("key") },
                new Object[] { "recurringOrder", RecurringPaymentDraft.builder()
                        .recurringOrder(
                            new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl()) },
                new Object[] { "paymentMethodConfigurations", RecurringPaymentDraft.builder()
                        .paymentMethodConfigurations(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl())) } };
    }

    @Test
    public void key() {
        RecurringPaymentDraft value = RecurringPaymentDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void recurringOrder() {
        RecurringPaymentDraft value = RecurringPaymentDraft.of();
        value.setRecurringOrder(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
        Assertions.assertThat(value.getRecurringOrder())
                .isEqualTo(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
    }

    @Test
    public void paymentMethodConfigurations() {
        RecurringPaymentDraft value = RecurringPaymentDraft.of();
        value.setPaymentMethodConfigurations(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
        Assertions.assertThat(value.getPaymentMethodConfigurations())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
    }
}
