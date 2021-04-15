
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetCustomFieldActionImpl.class)
public interface InventoryEntrySetCustomFieldAction extends InventoryEntryUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

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
