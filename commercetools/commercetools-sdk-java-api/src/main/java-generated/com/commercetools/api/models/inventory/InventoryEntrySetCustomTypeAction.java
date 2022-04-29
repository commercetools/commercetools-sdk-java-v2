
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
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the InventoryEntry with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the InventoryEntry.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetCustomTypeAction>";
            }
        };
    }
}
