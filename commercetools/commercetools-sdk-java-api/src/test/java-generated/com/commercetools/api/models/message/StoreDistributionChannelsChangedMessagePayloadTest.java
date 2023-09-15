
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class StoreDistributionChannelsChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreDistributionChannelsChangedMessagePayloadBuilder builder) {
        StoreDistributionChannelsChangedMessagePayload storeDistributionChannelsChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(storeDistributionChannelsChangedMessagePayload)
                .isInstanceOf(StoreDistributionChannelsChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreDistributionChannelsChangedMessagePayload.builder()
                        .addedDistributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreDistributionChannelsChangedMessagePayload.builder()
                        .removedDistributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
    }

    @Test
    public void addedDistributionChannels() {
        StoreDistributionChannelsChangedMessagePayload value = StoreDistributionChannelsChangedMessagePayload.of();
        value.setAddedDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getAddedDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void removedDistributionChannels() {
        StoreDistributionChannelsChangedMessagePayload value = StoreDistributionChannelsChangedMessagePayload.of();
        value.setRemovedDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getRemovedDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }
}
