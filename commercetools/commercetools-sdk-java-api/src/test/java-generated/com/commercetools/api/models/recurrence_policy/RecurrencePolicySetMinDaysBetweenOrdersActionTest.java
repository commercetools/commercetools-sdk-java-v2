
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicySetMinDaysBetweenOrdersActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicySetMinDaysBetweenOrdersActionBuilder builder) {
        RecurrencePolicySetMinDaysBetweenOrdersAction recurrencePolicySetMinDaysBetweenOrdersAction = builder
                .buildUnchecked();
        Assertions.assertThat(recurrencePolicySetMinDaysBetweenOrdersAction)
                .isInstanceOf(RecurrencePolicySetMinDaysBetweenOrdersAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "minDaysBetweenOrders",
                RecurrencePolicySetMinDaysBetweenOrdersAction.builder().minDaysBetweenOrders(6) } };
    }

    @Test
    public void minDaysBetweenOrders() {
        RecurrencePolicySetMinDaysBetweenOrdersAction value = RecurrencePolicySetMinDaysBetweenOrdersAction.of();
        value.setMinDaysBetweenOrders(6);
        Assertions.assertThat(value.getMinDaysBetweenOrders()).isEqualTo(6);
    }
}
