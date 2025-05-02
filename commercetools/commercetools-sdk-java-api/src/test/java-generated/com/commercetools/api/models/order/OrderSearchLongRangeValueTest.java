
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchLongRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchLongRangeValueBuilder builder) {
        OrderSearchLongRangeValue orderSearchLongRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchLongRangeValue).isInstanceOf(OrderSearchLongRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "gte", OrderSearchLongRangeValue.builder().gte(8L) },
                new Object[] { "lte", OrderSearchLongRangeValue.builder().lte(1L) } };
    }

    @Test
    public void gte() {
        OrderSearchLongRangeValue value = OrderSearchLongRangeValue.of();
        value.setGte(8L);
        Assertions.assertThat(value.getGte()).isEqualTo(8L);
    }

    @Test
    public void lte() {
        OrderSearchLongRangeValue value = OrderSearchLongRangeValue.of();
        value.setLte(1L);
        Assertions.assertThat(value.getLte()).isEqualTo(1L);
    }
}
