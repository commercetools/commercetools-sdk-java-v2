
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
public class StoreSupplyChannelsChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreSupplyChannelsChangedMessagePayloadBuilder builder) {
        StoreSupplyChannelsChangedMessagePayload storeSupplyChannelsChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeSupplyChannelsChangedMessagePayload)
                .isInstanceOf(StoreSupplyChannelsChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreSupplyChannelsChangedMessagePayload.builder()
                        .addedSupplyChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) },
                new Object[] { StoreSupplyChannelsChangedMessagePayload.builder()
                        .removedSupplyChannels(Collections
                                .singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl())) } };
    }

    @Test
    public void addedSupplyChannels() {
        StoreSupplyChannelsChangedMessagePayload value = StoreSupplyChannelsChangedMessagePayload.of();
        value.setAddedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getAddedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }

    @Test
    public void removedSupplyChannels() {
        StoreSupplyChannelsChangedMessagePayload value = StoreSupplyChannelsChangedMessagePayload.of();
        value.setRemovedSupplyChannels(
            Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
        Assertions.assertThat(value.getRemovedSupplyChannels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.channel.ChannelReferenceImpl()));
    }
}
