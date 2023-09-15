
package com.commercetools.api.models.message;

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
public class StoreDistributionChannelsChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreDistributionChannelsChangedMessageBuilder builder) {
        StoreDistributionChannelsChangedMessage storeDistributionChannelsChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeDistributionChannelsChangedMessage)
                .isInstanceOf(StoreDistributionChannelsChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreDistributionChannelsChangedMessage.builder()
                        .addedDistributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreDistributionChannelsChangedMessage.builder()
                        .removedDistributionChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
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
