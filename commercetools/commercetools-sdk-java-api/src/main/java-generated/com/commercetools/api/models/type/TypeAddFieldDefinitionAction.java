
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeAddFieldDefinitionActionImpl.class)
public interface TypeAddFieldDefinitionAction extends TypeUpdateAction {

    String ADD_FIELD_DEFINITION = "addFieldDefinition";

    /**
    *  <p>Value to append to the array.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fieldDefinition")
    public FieldDefinition getFieldDefinition();

    public void setFieldDefinition(final FieldDefinition fieldDefinition);

    public static TypeAddFieldDefinitionAction of() {
        return new TypeAddFieldDefinitionActionImpl();
    }

    public static TypeAddFieldDefinitionAction of(final TypeAddFieldDefinitionAction template) {
        TypeAddFieldDefinitionActionImpl instance = new TypeAddFieldDefinitionActionImpl();
        instance.setFieldDefinition(template.getFieldDefinition());
        return instance;
    }

    public static TypeAddFieldDefinitionActionBuilder builder() {
        return TypeAddFieldDefinitionActionBuilder.of();
    }

    public static TypeAddFieldDefinitionActionBuilder builder(final TypeAddFieldDefinitionAction template) {
        return TypeAddFieldDefinitionActionBuilder.of(template);
    }

    default <T> T withTypeAddFieldDefinitionAction(Function<TypeAddFieldDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeAddFieldDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeAddFieldDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeAddFieldDefinitionAction>";
            }
        };
    }
}
