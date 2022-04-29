
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryChangeQuantityActionImpl.class)
public interface InventoryEntryChangeQuantityAction extends InventoryEntryUpdateAction {

    String CHANGE_QUANTITY = "changeQuantity";

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryChangeQuantityAction of() {
        return new InventoryEntryChangeQuantityActionImpl();
    }

    public static InventoryEntryChangeQuantityAction of(final InventoryEntryChangeQuantityAction template) {
        InventoryEntryChangeQuantityActionImpl instance = new InventoryEntryChangeQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryChangeQuantityActionBuilder builder() {
        return InventoryEntryChangeQuantityActionBuilder.of();
    }

    public static InventoryEntryChangeQuantityActionBuilder builder(final InventoryEntryChangeQuantityAction template) {
        return InventoryEntryChangeQuantityActionBuilder.of(template);
    }

    default <T> T withInventoryEntryChangeQuantityAction(Function<InventoryEntryChangeQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryChangeQuantityAction>";
            }
        };
    }
}
