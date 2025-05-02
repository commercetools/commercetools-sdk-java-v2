
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchAndExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchAndExpressionBuilder builder) {
        OrderSearchAndExpression orderSearchAndExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchAndExpression).isInstanceOf(OrderSearchAndExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "and", OrderSearchAndExpression.builder()
                .and(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl())) } };
    }

    @Test
    public void and() {
        OrderSearchAndExpression value = OrderSearchAndExpression.of();
        value.setAnd(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
    }
}
