
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetCustomTypeActionImpl.class)
public interface InventoryEntrySetCustomTypeAction extends InventoryEntryUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
    *  Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static InventoryEntrySetCustomTypeAction of() {
        return new InventoryEntrySetCustomTypeActionImpl();
    }

    public static InventoryEntrySetCustomTypeAction of(final InventoryEntrySetCustomTypeAction template) {
        InventoryEntrySetCustomTypeActionImpl instance = new InventoryEntrySetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static InventoryEntrySetCustomTypeActionBuilder builder() {
        return InventoryEntrySetCustomTypeActionBuilder.of();
    }

    public static InventoryEntrySetCustomTypeActionBuilder builder(final InventoryEntrySetCustomTypeAction template) {
        return InventoryEntrySetCustomTypeActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetCustomTypeAction(Function<InventoryEntrySetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
