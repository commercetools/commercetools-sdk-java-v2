
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchDateRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchDateRangeValueBuilder builder) {
        OrderSearchDateRangeValue orderSearchDateRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchDateRangeValue).isInstanceOf(OrderSearchDateRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "gte",
                        OrderSearchDateRangeValue.builder().gte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lte",
                        OrderSearchDateRangeValue.builder().lte(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void gte() {
        OrderSearchDateRangeValue value = OrderSearchDateRangeValue.of();
        value.setGte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lte() {
        OrderSearchDateRangeValue value = OrderSearchDateRangeValue.of();
        value.setLte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
