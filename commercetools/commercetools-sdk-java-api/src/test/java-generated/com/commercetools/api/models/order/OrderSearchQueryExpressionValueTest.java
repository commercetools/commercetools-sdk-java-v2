
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchQueryExpressionValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchQueryExpressionValueBuilder builder) {
        OrderSearchQueryExpressionValue orderSearchQueryExpressionValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchQueryExpressionValue).isInstanceOf(OrderSearchQueryExpressionValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", OrderSearchQueryExpressionValue.builder().field("field") },
                new Object[] { "boost", OrderSearchQueryExpressionValue.builder().boost(7) },
                new Object[] { "customType", OrderSearchQueryExpressionValue.builder()
                        .customType(
                            com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType")) } };
    }

    @Test
    public void field() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void boost() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setBoost(7);
        Assertions.assertThat(value.getBoost()).isEqualTo(7);
    }

    @Test
    public void customType() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setCustomType(com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType"));
        Assertions.assertThat(value.getCustomType())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType"));
    }
}
