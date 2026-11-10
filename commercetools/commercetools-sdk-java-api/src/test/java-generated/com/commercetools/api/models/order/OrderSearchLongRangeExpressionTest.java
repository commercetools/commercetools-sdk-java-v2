
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchLongRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchLongRangeExpressionBuilder builder) {
        OrderSearchLongRangeExpression orderSearchLongRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchLongRangeExpression).isInstanceOf(OrderSearchLongRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", OrderSearchLongRangeExpression.builder()
                .range(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl()) } };
    }

    @Test
    public void range() {
        OrderSearchLongRangeExpression value = OrderSearchLongRangeExpression.of();
        value.setRange(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl());
    }
}
