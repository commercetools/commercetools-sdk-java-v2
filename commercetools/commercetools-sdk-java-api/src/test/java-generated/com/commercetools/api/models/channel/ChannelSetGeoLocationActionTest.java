
package com.commercetools.api.models.channel;

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
public class ChannelSetGeoLocationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelSetGeoLocationActionBuilder builder) {
        ChannelSetGeoLocationAction channelSetGeoLocationAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetGeoLocationAction).isInstanceOf(ChannelSetGeoLocationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelSetGeoLocationAction.builder()
                .geoLocation(new com.commercetools.api.models.common.GeoJsonImpl()) } };
    }

    @Test
    public void geoLocation() {
        ChannelSetGeoLocationAction value = ChannelSetGeoLocationAction.of();
        value.setGeoLocation(new com.commercetools.api.models.common.GeoJsonImpl());
        Assertions.assertThat(value.getGeoLocation()).isEqualTo(new com.commercetools.api.models.common.GeoJsonImpl());
    }
}
