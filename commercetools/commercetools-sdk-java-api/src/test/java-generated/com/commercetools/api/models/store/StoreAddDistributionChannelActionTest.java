
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreAddDistributionChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreAddDistributionChannelActionBuilder builder) {
        StoreAddDistributionChannelAction storeAddDistributionChannelAction = builder.buildUnchecked();
        Assertions.assertThat(storeAddDistributionChannelAction).isInstanceOf(StoreAddDistributionChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "distributionChannel", StoreAddDistributionChannelAction.builder()
                .distributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void distributionChannel() {
        StoreAddDistributionChannelAction value = StoreAddDistributionChannelAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
