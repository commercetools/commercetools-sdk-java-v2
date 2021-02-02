
package com.commercetools.api.models.store;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreAddSupplyChannelActionBuilder {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public StoreAddSupplyChannelAction build() {
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    public static StoreAddSupplyChannelActionBuilder of() {
        return new StoreAddSupplyChannelActionBuilder();
    }

    public static StoreAddSupplyChannelActionBuilder of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionBuilder builder = new StoreAddSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
