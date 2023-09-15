
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
public class OrderSetParcelTrackingDataActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetParcelTrackingDataActionBuilder builder) {
        OrderSetParcelTrackingDataAction orderSetParcelTrackingDataAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelTrackingDataAction).isInstanceOf(OrderSetParcelTrackingDataAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetParcelTrackingDataAction.builder().parcelId("parcelId") },
                new Object[] { OrderSetParcelTrackingDataAction.builder().parcelKey("parcelKey") },
                new Object[] { OrderSetParcelTrackingDataAction.builder()
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
