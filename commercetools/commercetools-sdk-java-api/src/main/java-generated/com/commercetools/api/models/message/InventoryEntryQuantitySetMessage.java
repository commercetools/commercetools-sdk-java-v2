
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryQuantitySetMessageImpl.class)
public interface InventoryEntryQuantitySetMessage extends Message {

    String INVENTORY_ENTRY_QUANTITY_SET = "InventoryEntryQuantitySet";

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

    public static InventoryEntryQuantitySetMessage of() {
        return new InventoryEntryQuantitySetMessageImpl();
    }

    public static InventoryEntryQuantitySetMessage of(final InventoryEntryQuantitySetMessage template) {
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

    public static InventoryEntryQuantitySetMessageBuilder builder() {
        return InventoryEntryQuantitySetMessageBuilder.of();
    }

    public static InventoryEntryQuantitySetMessageBuilder builder(final InventoryEntryQuantitySetMessage template) {
        return InventoryEntryQuantitySetMessageBuilder.of(template);
    }

    default <T> T withInventoryEntryQuantitySetMessage(Function<InventoryEntryQuantitySetMessage, T> helper) {
        return helper.apply(this);
    }
}
