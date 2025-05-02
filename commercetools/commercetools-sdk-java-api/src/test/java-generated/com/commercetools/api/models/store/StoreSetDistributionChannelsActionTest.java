
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetDistributionChannelsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetDistributionChannelsActionBuilder builder) {
        StoreSetDistributionChannelsAction storeSetDistributionChannelsAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetDistributionChannelsAction)
                .isInstanceOf(StoreSetDistributionChannelsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "distributionChannels",
                StoreSetDistributionChannelsAction.builder()
                        .distributionChannels(Collections.singletonList(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl())) } };
    }

    @Test
    public void distributionChannels() {
        StoreSetDistributionChannelsAction value = StoreSetDistributionChannelsAction.of();
        value.setDistributionChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
        Assertions.assertThat(value.getDistributionChannels())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
    }
}
