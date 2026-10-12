
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveRecurringPaymentAllocationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveRecurringPaymentAllocationActionBuilder builder) {
        CartRemoveRecurringPaymentAllocationAction cartRemoveRecurringPaymentAllocationAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartRemoveRecurringPaymentAllocationAction)
                .isInstanceOf(CartRemoveRecurringPaymentAllocationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartRemoveRecurringPaymentAllocationAction.builder().id("id") } };
    }

    @Test
    public void id() {
        CartRemoveRecurringPaymentAllocationAction value = CartRemoveRecurringPaymentAllocationAction.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
