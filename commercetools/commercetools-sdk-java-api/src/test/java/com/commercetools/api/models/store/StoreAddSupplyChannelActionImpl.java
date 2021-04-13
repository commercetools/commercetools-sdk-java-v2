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
public final class StoreAddSupplyChannelActionImpl implements StoreAddSupplyChannelAction {

    
    private String action;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @JsonCreator
    StoreAddSupplyChannelActionImpl(@JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        this.action =  ADD_SUPPLY_CHANNEL;
    }
    public StoreAddSupplyChannelActionImpl() {
        this.action =  ADD_SUPPLY_CHANNEL;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }

    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreAddSupplyChannelActionImpl that = (StoreAddSupplyChannelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(supplyChannel)
            .toHashCode();
    }

}
