
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetParcelMeasurementsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetParcelMeasurementsActionBuilder builder) {
        StagedOrderSetParcelMeasurementsAction stagedOrderSetParcelMeasurementsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelMeasurementsAction)
                .isInstanceOf(StagedOrderSetParcelMeasurementsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetParcelMeasurementsAction.builder().parcelId("parcelId") },
                new Object[] { StagedOrderSetParcelMeasurementsAction.builder().parcelKey("parcelKey") },
                new Object[] { StagedOrderSetParcelMeasurementsAction.builder()
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
