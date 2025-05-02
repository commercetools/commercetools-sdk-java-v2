
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchPrefixExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchPrefixExpressionBuilder builder) {
        OrderSearchPrefixExpression orderSearchPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchPrefixExpression).isInstanceOf(OrderSearchPrefixExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "prefix", OrderSearchPrefixExpression.builder()
                .prefix(new com.commercetools.api.models.order.OrderSearchStringValueImpl()) } };
    }

    @Test
    public void prefix() {
        OrderSearchPrefixExpression value = OrderSearchPrefixExpression.of();
        value.setPrefix(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
        Assertions.assertThat(value.getPrefix())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
    }
}
