
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetRecurringPaymentConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetRecurringPaymentConfigurationActionBuilder builder) {
        CartSetRecurringPaymentConfigurationAction cartSetRecurringPaymentConfigurationAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetRecurringPaymentConfigurationAction)
                .isInstanceOf(CartSetRecurringPaymentConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringPaymentConfiguration",
                CartSetRecurringPaymentConfigurationAction.builder()
                        .recurringPaymentConfiguration(
                            new com.commercetools.api.models.cart.RecurringPaymentConfigurationDraftImpl()) } };
    }

    @Test
    public void recurringPaymentConfiguration() {
        CartSetRecurringPaymentConfigurationAction value = CartSetRecurringPaymentConfigurationAction.of();
        value.setRecurringPaymentConfiguration(
            new com.commercetools.api.models.cart.RecurringPaymentConfigurationDraftImpl());
        Assertions.assertThat(value.getRecurringPaymentConfiguration())
                .isEqualTo(new com.commercetools.api.models.cart.RecurringPaymentConfigurationDraftImpl());
    }
}
