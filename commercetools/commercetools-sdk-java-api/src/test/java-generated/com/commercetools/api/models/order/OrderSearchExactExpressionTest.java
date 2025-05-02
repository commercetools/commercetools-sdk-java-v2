
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchExactExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchExactExpressionBuilder builder) {
        OrderSearchExactExpression orderSearchExactExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchExactExpression).isInstanceOf(OrderSearchExactExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "exact", OrderSearchExactExpression.builder()
                .exact(new com.commercetools.api.models.order.OrderSearchAnyValueImpl()) } };
    }

    @Test
    public void exact() {
        OrderSearchExactExpression value = OrderSearchExactExpression.of();
        value.setExact(new com.commercetools.api.models.order.OrderSearchAnyValueImpl());
        Assertions.assertThat(value.getExact())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchAnyValueImpl());
    }
}
