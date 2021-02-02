
package com.commercetools.api.models.category;

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
@JsonDeserialize(as = CategorySetCustomTypeActionImpl.class)
public interface CategorySetCustomTypeAction extends CategoryUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type. Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CategorySetCustomTypeAction of() {
        return new CategorySetCustomTypeActionImpl();
    }

    public static CategorySetCustomTypeAction of(final CategorySetCustomTypeAction template) {
        CategorySetCustomTypeActionImpl instance = new CategorySetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CategorySetCustomTypeActionBuilder builder() {
        return CategorySetCustomTypeActionBuilder.of();
    }

    public static CategorySetCustomTypeActionBuilder builder(final CategorySetCustomTypeAction template) {
        return CategorySetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCategorySetCustomTypeAction(Function<CategorySetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
