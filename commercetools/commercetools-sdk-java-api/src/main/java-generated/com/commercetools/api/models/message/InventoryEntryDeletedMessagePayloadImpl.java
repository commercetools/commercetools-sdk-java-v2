package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class InventoryEntryDeletedMessagePayloadImpl implements InventoryEntryDeletedMessagePayload {

    private String type;
    
    private String sku;
    
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @JsonCreator
    InventoryEntryDeletedMessagePayloadImpl(@JsonProperty("sku") final String sku, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.sku = sku;
        this.supplyChannel = supplyChannel;
        this.type = "InventoryEntryDeleted";
    }
    public InventoryEntryDeletedMessagePayloadImpl() {
        this.type = "InventoryEntryDeleted";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel(){
        return this.supplyChannel;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel){
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InventoryEntryDeletedMessagePayloadImpl that = (InventoryEntryDeletedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(sku)
            .append(supplyChannel)
            .toHashCode();
    }

}
