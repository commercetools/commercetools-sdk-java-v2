package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresSetDistributionChannelsActionImpl implements StoresSetDistributionChannelsAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    @JsonCreator
    StoresSetDistributionChannelsActionImpl(@JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        this.action = "setDistributionChannels";
    }
    public StoresSetDistributionChannelsActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }

    public void setDistributionChannels(final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels){
        this.distributionChannels = distributionChannels;
    }

}
