
package com.commercetools.api.models.channel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelSetGeoLocationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelSetGeoLocationActionBuilder builder) {
        ChannelSetGeoLocationAction channelSetGeoLocationAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetGeoLocationAction).isInstanceOf(ChannelSetGeoLocationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "geoLocation", ChannelSetGeoLocationAction.builder()
                .geoLocation(new com.commercetools.api.models.common.GeoJsonImpl()) } };
    }

    @Test
    public void geoLocation() {
        ChannelSetGeoLocationAction value = ChannelSetGeoLocationAction.of();
        value.setGeoLocation(new com.commercetools.api.models.common.GeoJsonImpl());
        Assertions.assertThat(value.getGeoLocation()).isEqualTo(new com.commercetools.api.models.common.GeoJsonImpl());
    }
}
