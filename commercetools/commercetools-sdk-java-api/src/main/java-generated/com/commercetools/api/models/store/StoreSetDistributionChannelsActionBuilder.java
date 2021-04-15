package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreSetDistributionChannelsActionBuilder {

    
    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    
    public StoreSetDistributionChannelsActionBuilder distributionChannels(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier ...distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }
    
    
    public StoreSetDistributionChannelsActionBuilder distributionChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    
    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }

    public StoreSetDistributionChannelsAction build() {
        return new StoreSetDistributionChannelsActionImpl(distributionChannels);
    }

    public static StoreSetDistributionChannelsActionBuilder of() {
        return new StoreSetDistributionChannelsActionBuilder();
    }

    public static StoreSetDistributionChannelsActionBuilder of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionBuilder builder = new StoreSetDistributionChannelsActionBuilder();
        builder.distributionChannels = template.getDistributionChannels();
        return builder;
    }

}
