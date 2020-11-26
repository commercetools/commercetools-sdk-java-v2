package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.TypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeAddFieldDefinitionActionImpl implements TypeAddFieldDefinitionAction {

    private String action;
    
    private com.commercetools.api.models.type.FieldDefinition fieldDefinition;

    @JsonCreator
    TypeAddFieldDefinitionActionImpl(@JsonProperty("fieldDefinition") final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
        this.action = "addFieldDefinition";
    }
    public TypeAddFieldDefinitionActionImpl() {
        this.action = "addFieldDefinition";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.type.FieldDefinition getFieldDefinition(){
        return this.fieldDefinition;
    }

    public void setFieldDefinition(final com.commercetools.api.models.type.FieldDefinition fieldDefinition){
        this.fieldDefinition = fieldDefinition;
    }

}
