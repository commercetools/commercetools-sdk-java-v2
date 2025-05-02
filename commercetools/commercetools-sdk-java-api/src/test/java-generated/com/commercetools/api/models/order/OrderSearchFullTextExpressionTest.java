
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchFullTextExpressionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchFullTextExpressionBuilder builder) {
        OrderSearchFullTextExpression orderSearchFullTextExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFullTextExpression).isInstanceOf(OrderSearchFullTextExpression.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fullText", OrderSearchFullTextExpression.builder()
                .fullText(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl()) } };
    }

    @Test
    public void fullText() {
        OrderSearchFullTextExpression value = OrderSearchFullTextExpression.of();
        value.setFullText(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl());
        Assertions.assertThat(value.getFullText())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl());
    }
}
