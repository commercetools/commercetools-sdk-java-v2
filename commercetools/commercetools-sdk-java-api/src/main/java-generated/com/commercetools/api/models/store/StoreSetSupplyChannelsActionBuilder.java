
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetSupplyChannelsActionBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    public StoreSetSupplyChannelsActionBuilder supplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    public StoreSetSupplyChannelsActionBuilder supplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    public StoreSetSupplyChannelsAction build() {
        return new StoreSetSupplyChannelsActionImpl(supplyChannels);
    }

    public static StoreSetSupplyChannelsActionBuilder of() {
        return new StoreSetSupplyChannelsActionBuilder();
    }

    public static StoreSetSupplyChannelsActionBuilder of(final StoreSetSupplyChannelsAction template) {
        StoreSetSupplyChannelsActionBuilder builder = new StoreSetSupplyChannelsActionBuilder();
        builder.supplyChannels = template.getSupplyChannels();
        return builder;
    }

}
