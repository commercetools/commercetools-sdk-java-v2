package com.commercetools.api.models.message;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
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

/**
 *  <p>Generated after a successful Create InventoryEntry request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryEntryCreatedMessagePayloadImpl implements InventoryEntryCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryCreatedMessagePayloadImpl(@JsonProperty("inventoryEntry") final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        this.type =  INVENTORY_ENTRY_CREATED;
    }
    /**
     * create empty instance
     */
    public InventoryEntryCreatedMessagePayloadImpl() {
        this.type =  INVENTORY_ENTRY_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>InventoryEntry that was created.</p>
     */
    
    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry(){
        return this.inventoryEntry;
    }

    
    public void setInventoryEntry(final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry){
        this.inventoryEntry = inventoryEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InventoryEntryCreatedMessagePayloadImpl that = (InventoryEntryCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(inventoryEntry, that.inventoryEntry)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(inventoryEntry)
            .toHashCode();
    }

}
