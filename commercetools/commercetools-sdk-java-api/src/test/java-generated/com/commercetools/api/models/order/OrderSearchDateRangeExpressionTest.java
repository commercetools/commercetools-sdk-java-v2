
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchDateRangeExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchDateRangeExpressionBuilder builder) {
        OrderSearchDateRangeExpression orderSearchDateRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchDateRangeExpression).isInstanceOf(OrderSearchDateRangeExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "range", OrderSearchDateRangeExpression.builder()
                .range(new com.commercetools.api.models.order.OrderSearchDateRangeValueImpl()) } };
    }

    @Test
    public void range() {
        OrderSearchDateRangeExpression value = OrderSearchDateRangeExpression.of();
        value.setRange(new com.commercetools.api.models.order.OrderSearchDateRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchDateRangeValueImpl());
    }
}
