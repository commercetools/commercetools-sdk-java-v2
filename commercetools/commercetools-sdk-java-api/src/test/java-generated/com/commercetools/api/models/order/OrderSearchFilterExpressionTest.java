
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchFilterExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchFilterExpressionBuilder builder) {
        OrderSearchFilterExpression orderSearchFilterExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFilterExpression).isInstanceOf(OrderSearchFilterExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "filter",
                OrderSearchFilterExpression.builder()
                        .filter(Collections.singletonList(
                            new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl())) } };
    }

    @Test
    public void filter() {
        OrderSearchFilterExpression value = OrderSearchFilterExpression.of();
        value.setFilter(
            Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()));
        Assertions.assertThat(value.getFilter())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()));
    }
}
