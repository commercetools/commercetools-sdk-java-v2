package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
        this.action =  SET_LINE_ITEM_DISTRIBUTION_CHANNEL;
    }
    public CartSetLineItemDistributionChannelActionImpl() {
        this.action =  SET_LINE_ITEM_DISTRIBUTION_CHANNEL;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetLineItemDistributionChannelActionImpl that = (CartSetLineItemDistributionChannelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(distributionChannel)
            .toHashCode();
    }

}
