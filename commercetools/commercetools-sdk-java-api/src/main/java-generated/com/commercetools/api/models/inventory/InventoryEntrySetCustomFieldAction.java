
package com.commercetools.api.models.inventory;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionImpl;
import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetCustomFieldActionImpl.class)
public interface InventoryEntrySetCustomFieldAction extends InventoryEntryUpdateAction {

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);

    public void setValue(final JsonNode value);

    public static InventoryEntrySetCustomFieldAction of() {
        return new InventoryEntrySetCustomFieldActionImpl();
    }

    public static InventoryEntrySetCustomFieldAction of(final InventoryEntrySetCustomFieldAction template) {
        InventoryEntrySetCustomFieldActionImpl instance = new InventoryEntrySetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static InventoryEntrySetCustomFieldActionBuilder builder() {
        return InventoryEntrySetCustomFieldActionBuilder.of();
    }

    public static InventoryEntrySetCustomFieldActionBuilder builder(final InventoryEntrySetCustomFieldAction template) {
        return InventoryEntrySetCustomFieldActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetCustomFieldAction(Function<InventoryEntrySetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
