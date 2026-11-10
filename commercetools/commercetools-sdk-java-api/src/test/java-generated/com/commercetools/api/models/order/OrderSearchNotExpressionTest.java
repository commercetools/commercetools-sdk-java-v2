
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchNotExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchNotExpressionBuilder builder) {
        OrderSearchNotExpression orderSearchNotExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNotExpression).isInstanceOf(OrderSearchNotExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "not", OrderSearchNotExpression.builder()
                .not(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl())) } };
    }

    @Test
    public void not() {
        OrderSearchNotExpression value = OrderSearchNotExpression.of();
        value.setNot(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
        Assertions.assertThat(value.getNot())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
    }
}
