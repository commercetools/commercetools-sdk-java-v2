
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentAllocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentAllocationBuilder builder) {
        RecurringPaymentAllocation recurringPaymentAllocation = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentAllocation).isInstanceOf(RecurringPaymentAllocation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringPaymentAllocation.builder().id("id") },
                new Object[] { "paymentMethod", RecurringPaymentAllocation.builder()
                        .paymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl()) },
                new Object[] { "allocation", RecurringPaymentAllocation.builder()
                        .allocation(new com.commercetools.api.models.cart.AllocationImpl()) } };
    }

    @Test
    public void id() {
        RecurringPaymentAllocation value = RecurringPaymentAllocation.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void paymentMethod() {
        RecurringPaymentAllocation value = RecurringPaymentAllocation.of();
        value.setPaymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
    }

    @Test
    public void allocation() {
        RecurringPaymentAllocation value = RecurringPaymentAllocation.of();
        value.setAllocation(new com.commercetools.api.models.cart.AllocationImpl());
        Assertions.assertThat(value.getAllocation()).isEqualTo(new com.commercetools.api.models.cart.AllocationImpl());
    }
}
