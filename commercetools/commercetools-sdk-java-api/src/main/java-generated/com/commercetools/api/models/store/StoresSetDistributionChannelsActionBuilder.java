package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresSetDistributionChannelsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresSetDistributionChannelsActionBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    public StoresSetDistributionChannelsActionBuilder distributionChannels(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier ...distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }
    
    public StoresSetDistributionChannelsActionBuilder distributionChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }

    public StoresSetDistributionChannelsAction build() {
        return new StoresSetDistributionChannelsActionImpl(distributionChannels);
    }

    public static StoresSetDistributionChannelsActionBuilder of() {
        return new StoresSetDistributionChannelsActionBuilder();
    }

    public static StoresSetDistributionChannelsActionBuilder of(final StoresSetDistributionChannelsAction template) {
        StoresSetDistributionChannelsActionBuilder builder = new StoresSetDistributionChannelsActionBuilder();
        builder.distributionChannels = template.getDistributionChannels();
        return builder;
    }

}
