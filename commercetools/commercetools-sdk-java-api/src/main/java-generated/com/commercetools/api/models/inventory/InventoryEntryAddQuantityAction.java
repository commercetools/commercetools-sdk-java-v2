package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionImpl;

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
@JsonDeserialize(as = InventoryEntryAddQuantityActionImpl.class)
public interface InventoryEntryAddQuantityAction extends InventoryEntryUpdateAction {

    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryAddQuantityAction of(){
        return new InventoryEntryAddQuantityActionImpl();
    }
    

    public static InventoryEntryAddQuantityAction of(final InventoryEntryAddQuantityAction template) {
        InventoryEntryAddQuantityActionImpl instance = new InventoryEntryAddQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryAddQuantityActionBuilder builder(){
        return InventoryEntryAddQuantityActionBuilder.of();
    }
    
    public static InventoryEntryAddQuantityActionBuilder builder(final InventoryEntryAddQuantityAction template){
        return InventoryEntryAddQuantityActionBuilder.of(template);
    }
    

    default <T> T withInventoryEntryAddQuantityAction(Function<InventoryEntryAddQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
