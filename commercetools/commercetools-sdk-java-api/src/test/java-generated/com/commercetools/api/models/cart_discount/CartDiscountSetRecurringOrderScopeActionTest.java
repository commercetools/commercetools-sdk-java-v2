
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountSetRecurringOrderScopeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountSetRecurringOrderScopeActionBuilder builder) {
        CartDiscountSetRecurringOrderScopeAction cartDiscountSetRecurringOrderScopeAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetRecurringOrderScopeAction)
                .isInstanceOf(CartDiscountSetRecurringOrderScopeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringOrderScope",
                CartDiscountSetRecurringOrderScopeAction.builder()
                        .recurringOrderScope(
                            new com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftImpl()) } };
    }

    @Test
    public void recurringOrderScope() {
        CartDiscountSetRecurringOrderScopeAction value = CartDiscountSetRecurringOrderScopeAction.of();
        value.setRecurringOrderScope(new com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftImpl());
        Assertions.assertThat(value.getRecurringOrderScope())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftImpl());
    }
}
