
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRemoveSupplyChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRemoveSupplyChannelActionBuilder builder) {
        StoreRemoveSupplyChannelAction storeRemoveSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveSupplyChannelAction).isInstanceOf(StoreRemoveSupplyChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "supplyChannel", StoreRemoveSupplyChannelAction.builder()
                .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void supplyChannel() {
        StoreRemoveSupplyChannelAction value = StoreRemoveSupplyChannelAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
