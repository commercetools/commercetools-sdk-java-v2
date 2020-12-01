package com.commercetools.api.models.message;

import com.commercetools.api.models.inventory.InventoryEntry;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryCreatedMessagePayloadImpl implements InventoryEntryCreatedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    @JsonCreator
    InventoryEntryCreatedMessagePayloadImpl(@JsonProperty("inventoryEntry") final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        this.type = "InventoryEntryCreated";
    }
    public InventoryEntryCreatedMessagePayloadImpl() {
        this.type = "InventoryEntryCreated";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry(){
        return this.inventoryEntry;
    }

    public void setInventoryEntry(final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry){
        this.inventoryEntry = inventoryEntry;
    }

}
