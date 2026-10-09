
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetRecurringPaymentStrategyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetRecurringPaymentStrategyActionBuilder builder) {
        CartSetRecurringPaymentStrategyAction cartSetRecurringPaymentStrategyAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetRecurringPaymentStrategyAction)
                .isInstanceOf(CartSetRecurringPaymentStrategyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentStrategy", CartSetRecurringPaymentStrategyAction.builder()
                .paymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout")) } };
    }

    @Test
    public void paymentStrategy() {
        CartSetRecurringPaymentStrategyAction value = CartSetRecurringPaymentStrategyAction.of();
        value.setPaymentStrategy(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
        Assertions.assertThat(value.getPaymentStrategy())
                .isEqualTo(com.commercetools.api.models.cart.PaymentStrategy.findEnum("Checkout"));
    }
}
