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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreSetSupplyChannelsActionImpl implements StoreSetSupplyChannelsAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @JsonCreator
    StoreSetSupplyChannelsActionImpl(@JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        this.action = "setSupplyChannels";
    }
    public StoreSetSupplyChannelsActionImpl() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreSetSupplyChannelsActionImpl that = (StoreSetSupplyChannelsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(supplyChannels, that.supplyChannels)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(supplyChannels)
            .toHashCode();
    }

}
