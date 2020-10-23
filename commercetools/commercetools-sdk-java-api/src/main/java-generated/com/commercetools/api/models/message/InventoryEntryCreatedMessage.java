package com.commercetools.api.models.message;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.InventoryEntryCreatedMessageImpl;

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
@JsonDeserialize(as = InventoryEntryCreatedMessageImpl.class)
public interface InventoryEntryCreatedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntry getInventoryEntry();

    public void setInventoryEntry(final InventoryEntry inventoryEntry);

    public static InventoryEntryCreatedMessageImpl of(){
        return new InventoryEntryCreatedMessageImpl();
    }
    

    public static InventoryEntryCreatedMessageImpl of(final InventoryEntryCreatedMessage template) {
        InventoryEntryCreatedMessageImpl instance = new InventoryEntryCreatedMessageImpl();
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
        instance.setInventoryEntry(template.getInventoryEntry());
        return instance;
    }

    default <T> T withInventoryEntryCreatedMessage(Function<InventoryEntryCreatedMessage, T> helper) {
        return helper.apply(this);
    }
}
