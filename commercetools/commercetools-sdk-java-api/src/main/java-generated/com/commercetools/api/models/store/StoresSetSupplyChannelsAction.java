package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresSetSupplyChannelsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoresSetSupplyChannelsActionImpl.class)
public interface StoresSetSupplyChannelsAction extends StoreUpdateAction {

    
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier ...supplyChannels);
    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    public static StoresSetSupplyChannelsAction of(){
        return new StoresSetSupplyChannelsActionImpl();
    }
    

    public static StoresSetSupplyChannelsAction of(final StoresSetSupplyChannelsAction template) {
        StoresSetSupplyChannelsActionImpl instance = new StoresSetSupplyChannelsActionImpl();
        instance.setSupplyChannels(template.getSupplyChannels());
        return instance;
    }

    public static StoresSetSupplyChannelsActionBuilder builder(){
        return StoresSetSupplyChannelsActionBuilder.of();
    }
    
    public static StoresSetSupplyChannelsActionBuilder builder(final StoresSetSupplyChannelsAction template){
        return StoresSetSupplyChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoresSetSupplyChannelsAction(Function<StoresSetSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
