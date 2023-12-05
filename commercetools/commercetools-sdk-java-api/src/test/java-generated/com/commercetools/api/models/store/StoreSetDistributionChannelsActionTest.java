
package com.commercetools.api.models.store;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StoreSetDistributionChannelsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreSetDistributionChannelsActionBuilder builder) {
        StoreSetDistributionChannelsAction storeSetDistributionChannelsAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetDistributionChannelsAction)
                .isInstanceOf(StoreSetDistributionChannelsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StoreSetDistributionChannelsAction.builder()
                .distributionChannels(Collections
                        .singletonList(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl())) } };
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
