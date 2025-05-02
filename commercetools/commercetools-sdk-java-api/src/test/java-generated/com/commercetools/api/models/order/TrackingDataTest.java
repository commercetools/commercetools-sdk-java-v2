
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TrackingDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TrackingDataBuilder builder) {
        TrackingData trackingData = builder.buildUnchecked();
        Assertions.assertThat(trackingData).isInstanceOf(TrackingData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "trackingId", TrackingData.builder().trackingId("trackingId") },
                new Object[] { "carrier", TrackingData.builder().carrier("carrier") },
                new Object[] { "provider", TrackingData.builder().provider("provider") },
                new Object[] { "providerTransaction",
                        TrackingData.builder().providerTransaction("providerTransaction") },
                new Object[] { "isReturn", TrackingData.builder().isReturn(true) } };
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
