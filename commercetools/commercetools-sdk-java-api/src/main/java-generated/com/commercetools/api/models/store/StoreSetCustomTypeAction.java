
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreSetCustomTypeActionImpl.class)
public interface StoreSetCustomTypeAction extends StoreUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If set, the custom type is reset to this value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type
    *  Sets the custom field to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static StoreSetCustomTypeAction of() {
        return new StoreSetCustomTypeActionImpl();
    }

    public static StoreSetCustomTypeAction of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionImpl instance = new StoreSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StoreSetCustomTypeActionBuilder builder() {
        return StoreSetCustomTypeActionBuilder.of();
    }

    public static StoreSetCustomTypeActionBuilder builder(final StoreSetCustomTypeAction template) {
        return StoreSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStoreSetCustomTypeAction(Function<StoreSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
