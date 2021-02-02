
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeRemoveFieldDefinitionActionImpl.class)
public interface TypeRemoveFieldDefinitionAction extends TypeUpdateAction {

    String REMOVE_FIELD_DEFINITION = "removeFieldDefinition";

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    public void setFieldName(final String fieldName);

    public static TypeRemoveFieldDefinitionAction of() {
        return new TypeRemoveFieldDefinitionActionImpl();
    }

    public static TypeRemoveFieldDefinitionAction of(final TypeRemoveFieldDefinitionAction template) {
        TypeRemoveFieldDefinitionActionImpl instance = new TypeRemoveFieldDefinitionActionImpl();
        instance.setFieldName(template.getFieldName());
        return instance;
    }

    public static TypeRemoveFieldDefinitionActionBuilder builder() {
        return TypeRemoveFieldDefinitionActionBuilder.of();
    }

    public static TypeRemoveFieldDefinitionActionBuilder builder(final TypeRemoveFieldDefinitionAction template) {
        return TypeRemoveFieldDefinitionActionBuilder.of(template);
    }

    default <T> T withTypeRemoveFieldDefinitionAction(Function<TypeRemoveFieldDefinitionAction, T> helper) {
        return helper.apply(this);
    }
}
