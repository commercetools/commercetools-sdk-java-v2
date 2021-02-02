
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryRemoveQuantityActionImpl.class)
public interface InventoryEntryRemoveQuantityAction extends InventoryEntryUpdateAction {

    String REMOVE_QUANTITY = "removeQuantity";

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryRemoveQuantityAction of() {
        return new InventoryEntryRemoveQuantityActionImpl();
    }

    public static InventoryEntryRemoveQuantityAction of(final InventoryEntryRemoveQuantityAction template) {
        InventoryEntryRemoveQuantityActionImpl instance = new InventoryEntryRemoveQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryRemoveQuantityActionBuilder builder() {
        return InventoryEntryRemoveQuantityActionBuilder.of();
    }

    public static InventoryEntryRemoveQuantityActionBuilder builder(final InventoryEntryRemoveQuantityAction template) {
        return InventoryEntryRemoveQuantityActionBuilder.of(template);
    }

    default <T> T withInventoryEntryRemoveQuantityAction(Function<InventoryEntryRemoveQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
