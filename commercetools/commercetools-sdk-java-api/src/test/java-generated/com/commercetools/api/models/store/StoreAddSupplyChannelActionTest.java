
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreAddSupplyChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreAddSupplyChannelActionBuilder builder) {
        StoreAddSupplyChannelAction storeAddSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(storeAddSupplyChannelAction).isInstanceOf(StoreAddSupplyChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "supplyChannel", StoreAddSupplyChannelAction.builder()
                .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void supplyChannel() {
        StoreAddSupplyChannelAction value = StoreAddSupplyChannelAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
