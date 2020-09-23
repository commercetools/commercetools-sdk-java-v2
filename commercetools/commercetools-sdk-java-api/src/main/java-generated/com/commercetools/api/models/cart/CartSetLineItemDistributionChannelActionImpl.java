package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
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
public final class CartSetLineItemDistributionChannelActionImpl implements CartSetLineItemDistributionChannelAction {

    private String action;
    
    private String lineItemId;
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    CartSetLineItemDistributionChannelActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.lineItemId = lineItemId;
        this.distributionChannel = distributionChannel;
        this.action = "setLineItemDistributionChannel";
    }
    public CartSetLineItemDistributionChannelActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }

}
