
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchNumberRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchNumberRangeExpressionBuilder builder) {
        OrderSearchNumberRangeExpression orderSearchNumberRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNumberRangeExpression).isInstanceOf(OrderSearchNumberRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", OrderSearchNumberRangeExpression.builder()
                .range(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl()) } };
    }

    @Test
    public void range() {
        OrderSearchNumberRangeExpression value = OrderSearchNumberRangeExpression.of();
        value.setRange(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl());
    }
}
