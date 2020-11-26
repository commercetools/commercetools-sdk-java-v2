package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresSetSupplyChannelsActionImpl implements StoresSetSupplyChannelsAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @JsonCreator
    StoresSetSupplyChannelsActionImpl(@JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        this.action = "setSupplyChannels";
    }
    public StoresSetSupplyChannelsActionImpl() {
        this.action = "setSupplyChannels";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels(){
        return this.supplyChannels;
    }

    public void setSupplyChannels(final com.commercetools.api.models.channel.ChannelResourceIdentifier ...supplyChannels){
       this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
    }
    
    public void setSupplyChannels(final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels){
       this.supplyChannels = supplyChannels;
    }

}
