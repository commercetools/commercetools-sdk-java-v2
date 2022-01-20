
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntryCreatedMessagePayloadImpl implements InventoryEntryCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    @JsonCreator
    InventoryEntryCreatedMessagePayloadImpl(
            @JsonProperty("inventoryEntry") final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        this.type = INVENTORY_ENTRY_CREATED;
    }

    public InventoryEntryCreatedMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_CREATED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry() {
        return this.inventoryEntry;
    }

    public void setInventoryEntry(final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryCreatedMessagePayloadImpl that = (InventoryEntryCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(inventoryEntry, that.inventoryEntry).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(inventoryEntry).toHashCode();
    }

}
