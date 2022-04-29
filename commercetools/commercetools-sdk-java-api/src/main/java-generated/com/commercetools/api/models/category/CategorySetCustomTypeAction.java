
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
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Category with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Category.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Category.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetCustomTypeAction>";
            }
        };
    }
}
