
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetKeyActionImpl.class)
public interface InventoryEntrySetKeyAction extends InventoryEntryUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static InventoryEntrySetKeyAction of() {
        return new InventoryEntrySetKeyActionImpl();
    }

    public static InventoryEntrySetKeyAction of(final InventoryEntrySetKeyAction template) {
        InventoryEntrySetKeyActionImpl instance = new InventoryEntrySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static InventoryEntrySetKeyActionBuilder builder() {
        return InventoryEntrySetKeyActionBuilder.of();
    }

    public static InventoryEntrySetKeyActionBuilder builder(final InventoryEntrySetKeyAction template) {
        return InventoryEntrySetKeyActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetKeyAction(Function<InventoryEntrySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetKeyAction>";
            }
        };
    }
}
