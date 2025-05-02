
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreDistributionChannelsChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreDistributionChannelsChangedMessageBuilder builder) {
        StoreDistributionChannelsChangedMessage storeDistributionChannelsChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeDistributionChannelsChangedMessage)
                .isInstanceOf(StoreDistributionChannelsChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedDistributionChannels",
                        StoreDistributionChannelsChangedMessage.builder()
                                .addedDistributionChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { "removedDistributionChannels",
                        StoreDistributionChannelsChangedMessage.builder()
                                .removedDistributionChannels(Collections.singletonList(
                                    new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
    }

    @Test
    public void addedDistributionChannels() {
        StoreDistributionChannelsChangedMessage value = StoreDistributionChannelsChangedMessage.of();
        value.setAddedDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getAddedDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void removedDistributionChannels() {
        StoreDistributionChannelsChangedMessage value = StoreDistributionChannelsChangedMessage.of();
        value.setRemovedDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getRemovedDistributionChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }
}
