
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetParcelTrackingDataActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetParcelTrackingDataActionBuilder builder) {
        StagedOrderSetParcelTrackingDataAction stagedOrderSetParcelTrackingDataAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelTrackingDataAction)
                .isInstanceOf(StagedOrderSetParcelTrackingDataAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderSetParcelTrackingDataAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", StagedOrderSetParcelTrackingDataAction.builder().parcelKey("parcelKey") },
                new Object[] { "trackingData", StagedOrderSetParcelTrackingDataAction.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelTrackingDataAction value = StagedOrderSetParcelTrackingDataAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelTrackingDataAction value = StagedOrderSetParcelTrackingDataAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void trackingData() {
        StagedOrderSetParcelTrackingDataAction value = StagedOrderSetParcelTrackingDataAction.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }
}
