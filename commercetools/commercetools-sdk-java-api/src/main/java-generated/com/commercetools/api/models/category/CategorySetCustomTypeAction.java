package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.category.CategorySetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetCustomTypeActionImpl.class)
public interface CategorySetCustomTypeAction extends CategoryUpdateAction {

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

    public static CategorySetCustomTypeActionImpl of(){
        return new CategorySetCustomTypeActionImpl();
    }
    

    public static CategorySetCustomTypeActionImpl of(final CategorySetCustomTypeAction template) {
        CategorySetCustomTypeActionImpl instance = new CategorySetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<CategorySetCustomTypeAction>> T withCategorySetCustomTypeAction(Function<CategorySetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
