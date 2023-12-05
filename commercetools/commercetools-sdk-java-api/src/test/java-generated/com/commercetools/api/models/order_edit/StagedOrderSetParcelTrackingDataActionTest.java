
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
public class StagedOrderSetParcelTrackingDataActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetParcelTrackingDataActionBuilder builder) {
        StagedOrderSetParcelTrackingDataAction stagedOrderSetParcelTrackingDataAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelTrackingDataAction)
                .isInstanceOf(StagedOrderSetParcelTrackingDataAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderSetParcelTrackingDataAction.builder().parcelId("parcelId") },
                new Object[] { StagedOrderSetParcelTrackingDataAction.builder().parcelKey("parcelKey") },
                new Object[] { StagedOrderSetParcelTrackingDataAction.builder()
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
