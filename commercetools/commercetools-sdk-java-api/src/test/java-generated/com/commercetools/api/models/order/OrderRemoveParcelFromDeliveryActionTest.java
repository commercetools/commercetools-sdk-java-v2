
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderRemoveParcelFromDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderRemoveParcelFromDeliveryActionBuilder builder) {
        OrderRemoveParcelFromDeliveryAction orderRemoveParcelFromDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveParcelFromDeliveryAction)
                .isInstanceOf(OrderRemoveParcelFromDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", OrderRemoveParcelFromDeliveryAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderRemoveParcelFromDeliveryAction.builder().parcelKey("parcelKey") } };
    }

    @Test
    public void parcelId() {
        OrderRemoveParcelFromDeliveryAction value = OrderRemoveParcelFromDeliveryAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderRemoveParcelFromDeliveryAction value = OrderRemoveParcelFromDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }
}
