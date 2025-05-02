
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSupplyChannelsChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSupplyChannelsChangedMessageBuilder builder) {
        StoreSupplyChannelsChangedMessage storeSupplyChannelsChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeSupplyChannelsChangedMessage).isInstanceOf(StoreSupplyChannelsChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedSupplyChannels",
                        StoreSupplyChannelsChangedMessage.builder()
                                .addedSupplyChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "removedSupplyChannels",
                        StoreSupplyChannelsChangedMessage.builder()
                                .removedSupplyChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
    }

    @Test
    public void addedSupplyChannels() {
        StoreSupplyChannelsChangedMessage value = StoreSupplyChannelsChangedMessage.of();
        value.setAddedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getAddedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void removedSupplyChannels() {
        StoreSupplyChannelsChangedMessage value = StoreSupplyChannelsChangedMessage.of();
        value.setRemovedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getRemovedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }
}
