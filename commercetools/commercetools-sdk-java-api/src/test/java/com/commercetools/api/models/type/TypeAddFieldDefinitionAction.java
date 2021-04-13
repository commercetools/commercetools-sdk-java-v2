package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeAddFieldDefinitionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeAddFieldDefinitionActionImpl.class)
public interface TypeAddFieldDefinitionAction extends TypeUpdateAction {

    String ADD_FIELD_DEFINITION = "addFieldDefinition";

    
    @NotNull
    @Valid
    @JsonProperty("fieldDefinition")
    public FieldDefinition getFieldDefinition();

    
    public void setFieldDefinition(final FieldDefinition fieldDefinition);
    

    public static TypeAddFieldDefinitionAction of(){
        return new TypeAddFieldDefinitionActionImpl();
    }
    

    public static TypeAddFieldDefinitionAction of(final TypeAddFieldDefinitionAction template) {
        TypeAddFieldDefinitionActionImpl instance = new TypeAddFieldDefinitionActionImpl();
        instance.setFieldDefinition(template.getFieldDefinition());
        return instance;
    }

    public static TypeAddFieldDefinitionActionBuilder builder(){
        return TypeAddFieldDefinitionActionBuilder.of();
    }
    
    public static TypeAddFieldDefinitionActionBuilder builder(final TypeAddFieldDefinitionAction template){
        return TypeAddFieldDefinitionActionBuilder.of(template);
    }
    

    default <T> T withTypeAddFieldDefinitionAction(Function<TypeAddFieldDefinitionAction, T> helper) {
        return helper.apply(this);
    }
}
