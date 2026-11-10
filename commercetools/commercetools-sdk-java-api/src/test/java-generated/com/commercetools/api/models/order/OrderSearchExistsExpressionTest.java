
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchExistsExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchExistsExpressionBuilder builder) {
        OrderSearchExistsExpression orderSearchExistsExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchExistsExpression).isInstanceOf(OrderSearchExistsExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "exists", OrderSearchExistsExpression.builder()
                .exists(new com.commercetools.api.models.order.OrderSearchQueryExpressionValueImpl()) } };
    }

    @Test
    public void exists() {
        OrderSearchExistsExpression value = OrderSearchExistsExpression.of();
        value.setExists(new com.commercetools.api.models.order.OrderSearchQueryExpressionValueImpl());
        Assertions.assertThat(value.getExists())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchQueryExpressionValueImpl());
    }
}
