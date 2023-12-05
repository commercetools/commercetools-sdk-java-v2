
package com.commercetools.api.models.order;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class OrderSetParcelMeasurementsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetParcelMeasurementsActionBuilder builder) {
        OrderSetParcelMeasurementsAction orderSetParcelMeasurementsAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelMeasurementsAction).isInstanceOf(OrderSetParcelMeasurementsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetParcelMeasurementsAction.builder().parcelId("parcelId") },
                new Object[] { OrderSetParcelMeasurementsAction.builder().parcelKey("parcelKey") },
                new Object[] { OrderSetParcelMeasurementsAction.builder()
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
