
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EstimatedDeliveryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EstimatedDeliveryBuilder builder) {
        EstimatedDelivery estimatedDelivery = builder.buildUnchecked();
        Assertions.assertThat(estimatedDelivery).isInstanceOf(EstimatedDelivery.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "from", EstimatedDelivery.builder().from(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "until", EstimatedDelivery.builder().until(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void from() {
        EstimatedDelivery value = EstimatedDelivery.of();
        value.setFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void until() {
        EstimatedDelivery value = EstimatedDelivery.of();
        value.setUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
