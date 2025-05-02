
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchOrExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchOrExpressionBuilder builder) {
        OrderSearchOrExpression orderSearchOrExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchOrExpression).isInstanceOf(OrderSearchOrExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "or", OrderSearchOrExpression.builder()
                .or(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl())) } };
    }

    @Test
    public void or() {
        OrderSearchOrExpression value = OrderSearchOrExpression.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
    }
}
