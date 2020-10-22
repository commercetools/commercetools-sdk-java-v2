package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.InventoryEntryDeletedMessageImpl;

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
@JsonDeserialize(as = InventoryEntryDeletedMessageImpl.class)
public interface InventoryEntryDeletedMessage extends Message {

    
    @NotNull
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    public void setSku(final String sku);
    
    public void setSupplyChannel(final ChannelReference supplyChannel);

    public static InventoryEntryDeletedMessageImpl of(){
        return new InventoryEntryDeletedMessageImpl();
    }
    

    public static InventoryEntryDeletedMessageImpl of(final InventoryEntryDeletedMessage template) {
        InventoryEntryDeletedMessageImpl instance = new InventoryEntryDeletedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    default <T extends Accessor<InventoryEntryDeletedMessage>> T withInventoryEntryDeletedMessage(Function<InventoryEntryDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
