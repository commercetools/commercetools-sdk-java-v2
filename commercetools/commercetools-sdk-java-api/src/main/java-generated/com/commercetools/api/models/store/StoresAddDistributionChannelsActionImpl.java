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
public final class StoresAddDistributionChannelsActionImpl implements StoresAddDistributionChannelsAction {

    private String action;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    StoresAddDistributionChannelsActionImpl(@JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action = "addDistributionChannel";
    }
    public StoresAddDistributionChannelsActionImpl() {
        this.action = "addDistributionChannel";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }

}
