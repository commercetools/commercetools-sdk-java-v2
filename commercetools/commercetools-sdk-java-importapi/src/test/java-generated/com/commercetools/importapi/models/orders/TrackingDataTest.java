
package com.commercetools.importapi.models.orders;

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
public class TrackingDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TrackingDataBuilder builder) {
        TrackingData trackingData = builder.buildUnchecked();
        Assertions.assertThat(trackingData).isInstanceOf(TrackingData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TrackingData.builder().trackingId("trackingId") },
                new Object[] { TrackingData.builder().carrier("carrier") },
                new Object[] { TrackingData.builder().provider("provider") },
                new Object[] { TrackingData.builder().providerTransaction("providerTransaction") },
                new Object[] { TrackingData.builder().isReturn(true) } };
    }

    @Test
    public void trackingId() {
        TrackingData value = TrackingData.of();
        value.setTrackingId("trackingId");
        Assertions.assertThat(value.getTrackingId()).isEqualTo("trackingId");
    }

    @Test
    public void carrier() {
        TrackingData value = TrackingData.of();
        value.setCarrier("carrier");
        Assertions.assertThat(value.getCarrier()).isEqualTo("carrier");
    }

    @Test
    public void provider() {
        TrackingData value = TrackingData.of();
        value.setProvider("provider");
        Assertions.assertThat(value.getProvider()).isEqualTo("provider");
    }

    @Test
    public void providerTransaction() {
        TrackingData value = TrackingData.of();
        value.setProviderTransaction("providerTransaction");
        Assertions.assertThat(value.getProviderTransaction()).isEqualTo("providerTransaction");
    }

    @Test
    public void isReturn() {
        TrackingData value = TrackingData.of();
        value.setIsReturn(true);
        Assertions.assertThat(value.getIsReturn()).isEqualTo(true);
    }
}
