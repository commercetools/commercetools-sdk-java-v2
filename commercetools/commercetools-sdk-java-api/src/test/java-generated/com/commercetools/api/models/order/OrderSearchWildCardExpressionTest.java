
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchWildCardExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchWildCardExpressionBuilder builder) {
        OrderSearchWildCardExpression orderSearchWildCardExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchWildCardExpression).isInstanceOf(OrderSearchWildCardExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "wildcard", OrderSearchWildCardExpression.builder()
                .wildcard(new com.commercetools.api.models.order.OrderSearchStringValueImpl()) } };
    }

    @Test
    public void wildcard() {
        OrderSearchWildCardExpression value = OrderSearchWildCardExpression.of();
        value.setWildcard(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
        Assertions.assertThat(value.getWildcard())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
    }
}
