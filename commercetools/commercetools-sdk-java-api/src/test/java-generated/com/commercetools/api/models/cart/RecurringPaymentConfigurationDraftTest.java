
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentConfigurationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentConfigurationDraftBuilder builder) {
        RecurringPaymentConfigurationDraft recurringPaymentConfigurationDraft = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentConfigurationDraft)
                .isInstanceOf(RecurringPaymentConfigurationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentStrategy", RecurringPaymentConfigurationDraft.builder()
                        .paymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout")) },
                new Object[] { "paymentAllocations",
                        RecurringPaymentConfigurationDraft.builder()
                                .paymentAllocations(Collections.singletonList(
                                    new com.commercetools.api.models.cart.PaymentAllocationDraftImpl())) } };
    }

    @Test
    public void paymentStrategy() {
        RecurringPaymentConfigurationDraft value = RecurringPaymentConfigurationDraft.of();
        value.setPaymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
        Assertions.assertThat(value.getPaymentStrategy())
                .isEqualTo(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
    }

    @Test
    public void paymentAllocations() {
        RecurringPaymentConfigurationDraft value = RecurringPaymentConfigurationDraft.of();
        value.setPaymentAllocations(
            Collections.singletonList(new com.commercetools.api.models.cart.PaymentAllocationDraftImpl()));
        Assertions.assertThat(value.getPaymentAllocations())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.PaymentAllocationDraftImpl()));
    }
}
