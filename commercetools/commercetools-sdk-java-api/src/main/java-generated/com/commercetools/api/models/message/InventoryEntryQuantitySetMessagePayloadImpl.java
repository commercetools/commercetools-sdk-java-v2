package com.commercetools.api.models.message;

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
public final class InventoryEntryQuantitySetMessagePayloadImpl implements InventoryEntryQuantitySetMessagePayload {

    private String type;
    
    private Long oldQuantityOnStock;
    
    private Long newQuantityOnStock;
    
    private Long oldAvailableQuantity;
    
    private Long newAvailableQuantity;

    @JsonCreator
    InventoryEntryQuantitySetMessagePayloadImpl(@JsonProperty("oldQuantityOnStock") final Long oldQuantityOnStock, @JsonProperty("newQuantityOnStock") final Long newQuantityOnStock, @JsonProperty("oldAvailableQuantity") final Long oldAvailableQuantity, @JsonProperty("newAvailableQuantity") final Long newAvailableQuantity) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        this.newQuantityOnStock = newQuantityOnStock;
        this.oldAvailableQuantity = oldAvailableQuantity;
        this.newAvailableQuantity = newAvailableQuantity;
        this.type = "InventoryEntryQuantitySet";
    }
    public InventoryEntryQuantitySetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Long getOldQuantityOnStock(){
        return this.oldQuantityOnStock;
    }
    
    
    public Long getNewQuantityOnStock(){
        return this.newQuantityOnStock;
    }
    
    
    public Long getOldAvailableQuantity(){
        return this.oldAvailableQuantity;
    }
    
    
    public Long getNewAvailableQuantity(){
        return this.newAvailableQuantity;
    }

    public void setOldQuantityOnStock(final Long oldQuantityOnStock){
        this.oldQuantityOnStock = oldQuantityOnStock;
    }
    
    public void setNewQuantityOnStock(final Long newQuantityOnStock){
        this.newQuantityOnStock = newQuantityOnStock;
    }
    
    public void setOldAvailableQuantity(final Long oldAvailableQuantity){
        this.oldAvailableQuantity = oldAvailableQuantity;
    }
    
    public void setNewAvailableQuantity(final Long newAvailableQuantity){
        this.newAvailableQuantity = newAvailableQuantity;
    }

}
