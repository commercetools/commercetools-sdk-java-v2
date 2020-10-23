package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntryUpdateImpl;

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
@JsonDeserialize(as = InventoryEntryUpdateImpl.class)
public interface InventoryEntryUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<InventoryEntryUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<InventoryEntryUpdateAction> actions);

    public static InventoryEntryUpdateImpl of(){
        return new InventoryEntryUpdateImpl();
    }
    

    public static InventoryEntryUpdateImpl of(final InventoryEntryUpdate template) {
        InventoryEntryUpdateImpl instance = new InventoryEntryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withInventoryEntryUpdate(Function<InventoryEntryUpdate, T> helper) {
        return helper.apply(this);
    }
}
