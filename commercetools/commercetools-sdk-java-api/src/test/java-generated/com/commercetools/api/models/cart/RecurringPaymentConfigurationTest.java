
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentConfigurationBuilder builder) {
        RecurringPaymentConfiguration recurringPaymentConfiguration = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentConfiguration).isInstanceOf(RecurringPaymentConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentStrategy", RecurringPaymentConfiguration.builder()
                        .paymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout")) },
                new Object[] { "paymentAllocations",
                        RecurringPaymentConfiguration.builder()
                                .paymentAllocations(Collections.singletonList(
                                    new com.commercetools.api.models.cart.RecurringPaymentAllocationImpl())) } };
    }

    @Test
    public void paymentStrategy() {
        RecurringPaymentConfiguration value = RecurringPaymentConfiguration.of();
        value.setPaymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
        Assertions.assertThat(value.getPaymentStrategy())
                .isEqualTo(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
    }

    @Test
    public void paymentAllocations() {
        RecurringPaymentConfiguration value = RecurringPaymentConfiguration.of();
        value.setPaymentAllocations(
            Collections.singletonList(new com.commercetools.api.models.cart.RecurringPaymentAllocationImpl()));
        Assertions.assertThat(value.getPaymentAllocations())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart.RecurringPaymentAllocationImpl()));
    }
}
