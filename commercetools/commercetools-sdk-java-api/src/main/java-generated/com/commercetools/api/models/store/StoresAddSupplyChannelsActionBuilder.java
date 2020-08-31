package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresAddSupplyChannelsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresAddSupplyChannelsActionBuilder {

    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    public StoresAddSupplyChannelsActionBuilder supplyChannel( final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }

    public StoresAddSupplyChannelsAction build() {
        return new StoresAddSupplyChannelsActionImpl(supplyChannel);
    }

    public static StoresAddSupplyChannelsActionBuilder of() {
        return new StoresAddSupplyChannelsActionBuilder();
    }

    public static StoresAddSupplyChannelsActionBuilder of(final StoresAddSupplyChannelsAction template) {
        StoresAddSupplyChannelsActionBuilder builder = new StoresAddSupplyChannelsActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
