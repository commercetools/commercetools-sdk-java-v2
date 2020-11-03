package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntryQuantitySetMessageImpl.class)
public interface InventoryEntryQuantitySetMessage extends Message {

    
    @NotNull
    @JsonProperty("oldQuantityOnStock")
    public Long getOldQuantityOnStock();
    
    @NotNull
    @JsonProperty("newQuantityOnStock")
    public Long getNewQuantityOnStock();
    
    @NotNull
    @JsonProperty("oldAvailableQuantity")
    public Long getOldAvailableQuantity();
    
    @NotNull
    @JsonProperty("newAvailableQuantity")
    public Long getNewAvailableQuantity();

    public void setOldQuantityOnStock(final Long oldQuantityOnStock);
    
    public void setNewQuantityOnStock(final Long newQuantityOnStock);
    
    public void setOldAvailableQuantity(final Long oldAvailableQuantity);
    
    public void setNewAvailableQuantity(final Long newAvailableQuantity);

    public static InventoryEntryQuantitySetMessageImpl of(){
        return new InventoryEntryQuantitySetMessageImpl();
    }
    

    public static InventoryEntryQuantitySetMessageImpl of(final InventoryEntryQuantitySetMessage template) {
        InventoryEntryQuantitySetMessageImpl instance = new InventoryEntryQuantitySetMessageImpl();
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
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        return instance;
    }

    default <T> T withInventoryEntryQuantitySetMessage(Function<InventoryEntryQuantitySetMessage, T> helper) {
        return helper.apply(this);
    }
}
