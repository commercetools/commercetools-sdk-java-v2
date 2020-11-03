package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresSetSupplyChannelsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresSetSupplyChannelsActionBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    public StoresSetSupplyChannelsActionBuilder supplyChannels(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier ...supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }
    
    public StoresSetSupplyChannelsActionBuilder supplyChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels(){
        return this.supplyChannels;
    }

    public StoresSetSupplyChannelsAction build() {
        return new StoresSetSupplyChannelsActionImpl(supplyChannels);
    }

    public static StoresSetSupplyChannelsActionBuilder of() {
        return new StoresSetSupplyChannelsActionBuilder();
    }

    public static StoresSetSupplyChannelsActionBuilder of(final StoresSetSupplyChannelsAction template) {
        StoresSetSupplyChannelsActionBuilder builder = new StoresSetSupplyChannelsActionBuilder();
        builder.supplyChannels = template.getSupplyChannels();
        return builder;
    }

}
