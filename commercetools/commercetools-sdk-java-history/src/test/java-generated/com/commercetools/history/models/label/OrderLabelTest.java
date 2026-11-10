
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLabelBuilder builder) {
        OrderLabel orderLabel = builder.buildUnchecked();
        Assertions.assertThat(orderLabel).isInstanceOf(OrderLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerEmail", OrderLabel.builder().customerEmail("customerEmail") },
                new Object[] { "orderNumber", OrderLabel.builder().orderNumber("orderNumber") } };
    }

    @Test
    public void customerEmail() {
        OrderLabel value = OrderLabel.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void orderNumber() {
        OrderLabel value = OrderLabel.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }
}
