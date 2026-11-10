
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreDistributionChannelsChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreDistributionChannelsChangedMessagePayloadBuilder builder) {
        StoreDistributionChannelsChangedMessagePayload storeDistributionChannelsChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(storeDistributionChannelsChangedMessagePayload)
                .isInstanceOf(StoreDistributionChannelsChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedDistributionChannels",
                        StoreDistributionChannelsChangedMessagePayload.builder()
                                .addedDistributionChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "removedDistributionChannels",
                        StoreDistributionChannelsChangedMessagePayload.builder()
                                .removedDistributionChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
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
