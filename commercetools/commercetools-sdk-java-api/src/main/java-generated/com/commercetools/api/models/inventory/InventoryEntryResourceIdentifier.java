package com.commercetools.api.models.inventory;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryResourceIdentifierImpl;

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
@JsonDeserialize(as = InventoryEntryResourceIdentifierImpl.class)
public interface InventoryEntryResourceIdentifier extends ResourceIdentifier {

    String INVENTORY_ENTRY = "inventory-entry";



    public static InventoryEntryResourceIdentifier of(){
        return new InventoryEntryResourceIdentifierImpl();
    }
    

    public static InventoryEntryResourceIdentifier of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierImpl instance = new InventoryEntryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static InventoryEntryResourceIdentifierBuilder builder(){
        return InventoryEntryResourceIdentifierBuilder.of();
    }
    
    public static InventoryEntryResourceIdentifierBuilder builder(final InventoryEntryResourceIdentifier template){
        return InventoryEntryResourceIdentifierBuilder.of(template);
    }
    

    default <T> T withInventoryEntryResourceIdentifier(Function<InventoryEntryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
