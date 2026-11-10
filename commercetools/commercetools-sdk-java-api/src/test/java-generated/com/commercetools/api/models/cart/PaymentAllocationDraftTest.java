
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentAllocationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentAllocationDraftBuilder builder) {
        PaymentAllocationDraft paymentAllocationDraft = builder.buildUnchecked();
        Assertions.assertThat(paymentAllocationDraft).isInstanceOf(PaymentAllocationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", PaymentAllocationDraft.builder().id("id") },
                new Object[] { "paymentMethod", PaymentAllocationDraft.builder()
                        .paymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl()) },
                new Object[] { "allocation", PaymentAllocationDraft.builder()
                        .allocation(new com.commercetools.api.models.cart.AllocationDraftImpl()) } };
    }

    @Test
    public void id() {
        PaymentAllocationDraft value = PaymentAllocationDraft.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void paymentMethod() {
        PaymentAllocationDraft value = PaymentAllocationDraft.of();
        value.setPaymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
    }

    @Test
    public void allocation() {
        PaymentAllocationDraft value = PaymentAllocationDraft.of();
        value.setAllocation(new com.commercetools.api.models.cart.AllocationDraftImpl());
        Assertions.assertThat(value.getAllocation())
                .isEqualTo(new com.commercetools.api.models.cart.AllocationDraftImpl());
    }
}
