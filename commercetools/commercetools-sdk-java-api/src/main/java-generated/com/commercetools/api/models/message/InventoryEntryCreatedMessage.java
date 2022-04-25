
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryCreatedMessageImpl.class)
public interface InventoryEntryCreatedMessage extends Message {

    String INVENTORY_ENTRY_CREATED = "InventoryEntryCreated";

    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntry getInventoryEntry();

    public void setInventoryEntry(final InventoryEntry inventoryEntry);

    public static InventoryEntryCreatedMessage of() {
        return new InventoryEntryCreatedMessageImpl();
    }

    public static InventoryEntryCreatedMessage of(final InventoryEntryCreatedMessage template) {
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

    public static InventoryEntryCreatedMessageBuilder builder() {
        return InventoryEntryCreatedMessageBuilder.of();
    }

    public static InventoryEntryCreatedMessageBuilder builder(final InventoryEntryCreatedMessage template) {
        return InventoryEntryCreatedMessageBuilder.of(template);
    }

    default <T> T withInventoryEntryCreatedMessage(Function<InventoryEntryCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryCreatedMessage>";
            }
        };
    }
}
