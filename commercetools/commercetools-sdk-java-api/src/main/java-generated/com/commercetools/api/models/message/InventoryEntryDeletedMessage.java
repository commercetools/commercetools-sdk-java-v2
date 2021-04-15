
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryDeletedMessageImpl.class)
public interface InventoryEntryDeletedMessage extends Message {

    String INVENTORY_ENTRY_DELETED = "InventoryEntryDeleted";

    @NotNull
    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    public void setSku(final String sku);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public static InventoryEntryDeletedMessage of() {
        return new InventoryEntryDeletedMessageImpl();
    }

    public static InventoryEntryDeletedMessage of(final InventoryEntryDeletedMessage template) {
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

    public static InventoryEntryDeletedMessageBuilder builder() {
        return InventoryEntryDeletedMessageBuilder.of();
    }

    public static InventoryEntryDeletedMessageBuilder builder(final InventoryEntryDeletedMessage template) {
        return InventoryEntryDeletedMessageBuilder.of(template);
    }

    default <T> T withInventoryEntryDeletedMessage(Function<InventoryEntryDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
