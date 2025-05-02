
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRemoveDistributionChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRemoveDistributionChannelActionBuilder builder) {
        StoreRemoveDistributionChannelAction storeRemoveDistributionChannelAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveDistributionChannelAction)
                .isInstanceOf(StoreRemoveDistributionChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "distributionChannel", StoreRemoveDistributionChannelAction.builder()
                .distributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void distributionChannel() {
        StoreRemoveDistributionChannelAction value = StoreRemoveDistributionChannelAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
