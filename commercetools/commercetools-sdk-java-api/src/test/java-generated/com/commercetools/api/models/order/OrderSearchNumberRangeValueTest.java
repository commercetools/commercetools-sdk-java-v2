
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchNumberRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchNumberRangeValueBuilder builder) {
        OrderSearchNumberRangeValue orderSearchNumberRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNumberRangeValue).isInstanceOf(OrderSearchNumberRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "gte", OrderSearchNumberRangeValue.builder().gte(0.8498576) },
                new Object[] { "lte", OrderSearchNumberRangeValue.builder().lte(0.26076245) } };
    }

    @Test
    public void gte() {
        OrderSearchNumberRangeValue value = OrderSearchNumberRangeValue.of();
        value.setGte(0.8498576);
        Assertions.assertThat(value.getGte()).isEqualTo(0.8498576);
    }

    @Test
    public void lte() {
        OrderSearchNumberRangeValue value = OrderSearchNumberRangeValue.of();
        value.setLte(0.26076245);
        Assertions.assertThat(value.getLte()).isEqualTo(0.26076245);
    }
}
