
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSupplyChannelsChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSupplyChannelsChangedMessagePayloadBuilder builder) {
        StoreSupplyChannelsChangedMessagePayload storeSupplyChannelsChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeSupplyChannelsChangedMessagePayload)
                .isInstanceOf(StoreSupplyChannelsChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedSupplyChannels",
                        StoreSupplyChannelsChangedMessagePayload.builder()
                                .addedSupplyChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "removedSupplyChannels",
                        StoreSupplyChannelsChangedMessagePayload.builder()
                                .removedSupplyChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
    }

    @Test
    public void addedSupplyChannels() {
        StoreSupplyChannelsChangedMessagePayload value = StoreSupplyChannelsChangedMessagePayload.of();
        value.setAddedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getAddedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void removedSupplyChannels() {
        StoreSupplyChannelsChangedMessagePayload value = StoreSupplyChannelsChangedMessagePayload.of();
        value.setRemovedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getRemovedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }
}
