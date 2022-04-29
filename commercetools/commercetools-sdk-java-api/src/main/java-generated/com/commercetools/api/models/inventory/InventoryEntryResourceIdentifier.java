
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryResourceIdentifierImpl.class)
public interface InventoryEntryResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<InventoryEntry> {

    String INVENTORY_ENTRY = "inventory-entry";

    public static InventoryEntryResourceIdentifier of() {
        return new InventoryEntryResourceIdentifierImpl();
    }

    public static InventoryEntryResourceIdentifier of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierImpl instance = new InventoryEntryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static InventoryEntryResourceIdentifierBuilder builder() {
        return InventoryEntryResourceIdentifierBuilder.of();
    }

    public static InventoryEntryResourceIdentifierBuilder builder(final InventoryEntryResourceIdentifier template) {
        return InventoryEntryResourceIdentifierBuilder.of(template);
    }

    default <T> T withInventoryEntryResourceIdentifier(Function<InventoryEntryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryResourceIdentifier>";
            }
        };
    }
}
