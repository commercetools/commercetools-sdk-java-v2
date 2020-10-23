package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresAddSupplyChannelsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoresAddSupplyChannelsActionImpl.class)
public interface StoresAddSupplyChannelsAction extends StoreUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static StoresAddSupplyChannelsActionImpl of(){
        return new StoresAddSupplyChannelsActionImpl();
    }
    

    public static StoresAddSupplyChannelsActionImpl of(final StoresAddSupplyChannelsAction template) {
        StoresAddSupplyChannelsActionImpl instance = new StoresAddSupplyChannelsActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    default <T> T withStoresAddSupplyChannelsAction(Function<StoresAddSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
