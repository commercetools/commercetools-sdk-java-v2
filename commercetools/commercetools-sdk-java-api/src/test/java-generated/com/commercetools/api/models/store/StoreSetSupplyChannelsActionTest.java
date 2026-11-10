
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetSupplyChannelsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetSupplyChannelsActionBuilder builder) {
        StoreSetSupplyChannelsAction storeSetSupplyChannelsAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetSupplyChannelsAction).isInstanceOf(StoreSetSupplyChannelsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "supplyChannels",
                StoreSetSupplyChannelsAction.builder()
                        .supplyChannels(Collections.singletonList(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl())) } };
    }

    @Test
    public void supplyChannels() {
        StoreSetSupplyChannelsAction value = StoreSetSupplyChannelsAction.of();
        value.setSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
        Assertions.assertThat(value.getSupplyChannels())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()));
    }
}
