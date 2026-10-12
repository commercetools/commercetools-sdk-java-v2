
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddRecurringPaymentAllocationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddRecurringPaymentAllocationActionBuilder builder) {
        CartAddRecurringPaymentAllocationAction cartAddRecurringPaymentAllocationAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddRecurringPaymentAllocationAction)
                .isInstanceOf(CartAddRecurringPaymentAllocationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartAddRecurringPaymentAllocationAction.builder().id("id") },
                new Object[] { "paymentMethod", CartAddRecurringPaymentAllocationAction.builder()
                        .paymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl()) },
                new Object[] { "allocation", CartAddRecurringPaymentAllocationAction.builder()
                        .allocation(new com.commercetools.api.models.cart.AllocationDraftImpl()) } };
    }

    @Test
    public void id() {
        CartAddRecurringPaymentAllocationAction value = CartAddRecurringPaymentAllocationAction.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void paymentMethod() {
        CartAddRecurringPaymentAllocationAction value = CartAddRecurringPaymentAllocationAction.of();
        value.setPaymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodReferenceImpl());
    }

    @Test
    public void allocation() {
        CartAddRecurringPaymentAllocationAction value = CartAddRecurringPaymentAllocationAction.of();
        value.setAllocation(new com.commercetools.api.models.cart.AllocationDraftImpl());
        Assertions.assertThat(value.getAllocation())
                .isEqualTo(new com.commercetools.api.models.cart.AllocationDraftImpl());
    }
}
