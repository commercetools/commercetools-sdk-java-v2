package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionImpl;

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
@JsonDeserialize(as = InventoryEntrySetRestockableInDaysActionImpl.class)
public interface InventoryEntrySetRestockableInDaysAction extends InventoryEntryUpdateAction {

    
    
    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    public void setRestockableInDays(final Long restockableInDays);

    public static InventoryEntrySetRestockableInDaysAction of(){
        return new InventoryEntrySetRestockableInDaysActionImpl();
    }
    

    public static InventoryEntrySetRestockableInDaysAction of(final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionImpl instance = new InventoryEntrySetRestockableInDaysActionImpl();
        instance.setRestockableInDays(template.getRestockableInDays());
        return instance;
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder builder(){
        return InventoryEntrySetRestockableInDaysActionBuilder.of();
    }
    
    public static InventoryEntrySetRestockableInDaysActionBuilder builder(final InventoryEntrySetRestockableInDaysAction template){
        return InventoryEntrySetRestockableInDaysActionBuilder.of(template);
    }
    

    default <T> T withInventoryEntrySetRestockableInDaysAction(Function<InventoryEntrySetRestockableInDaysAction, T> helper) {
        return helper.apply(this);
    }
}
