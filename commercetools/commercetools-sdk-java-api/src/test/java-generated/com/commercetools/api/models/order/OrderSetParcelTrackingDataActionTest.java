
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetParcelTrackingDataActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetParcelTrackingDataActionBuilder builder) {
        OrderSetParcelTrackingDataAction orderSetParcelTrackingDataAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelTrackingDataAction).isInstanceOf(OrderSetParcelTrackingDataAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", OrderSetParcelTrackingDataAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderSetParcelTrackingDataAction.builder().parcelKey("parcelKey") },
                new Object[] { "trackingData", OrderSetParcelTrackingDataAction.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelTrackingDataAction value = OrderSetParcelTrackingDataAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelTrackingDataAction value = OrderSetParcelTrackingDataAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void trackingData() {
        OrderSetParcelTrackingDataAction value = OrderSetParcelTrackingDataAction.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }
}
