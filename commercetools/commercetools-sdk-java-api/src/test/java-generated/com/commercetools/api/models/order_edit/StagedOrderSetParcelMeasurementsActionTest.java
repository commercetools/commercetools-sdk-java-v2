
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetParcelMeasurementsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetParcelMeasurementsActionBuilder builder) {
        StagedOrderSetParcelMeasurementsAction stagedOrderSetParcelMeasurementsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelMeasurementsAction)
                .isInstanceOf(StagedOrderSetParcelMeasurementsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderSetParcelMeasurementsAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", StagedOrderSetParcelMeasurementsAction.builder().parcelKey("parcelKey") },
                new Object[] { "measurements", StagedOrderSetParcelMeasurementsAction.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelMeasurementsAction value = StagedOrderSetParcelMeasurementsAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelMeasurementsAction value = StagedOrderSetParcelMeasurementsAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void measurements() {
        StagedOrderSetParcelMeasurementsAction value = StagedOrderSetParcelMeasurementsAction.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }
}
