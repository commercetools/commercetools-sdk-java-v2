
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetParcelMeasurementsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetParcelMeasurementsActionBuilder builder) {
        OrderSetParcelMeasurementsAction orderSetParcelMeasurementsAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelMeasurementsAction).isInstanceOf(OrderSetParcelMeasurementsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", OrderSetParcelMeasurementsAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderSetParcelMeasurementsAction.builder().parcelKey("parcelKey") },
                new Object[] { "measurements", OrderSetParcelMeasurementsAction.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelMeasurementsAction value = OrderSetParcelMeasurementsAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelMeasurementsAction value = OrderSetParcelMeasurementsAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void measurements() {
        OrderSetParcelMeasurementsAction value = OrderSetParcelMeasurementsAction.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }
}
