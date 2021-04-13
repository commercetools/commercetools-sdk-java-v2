package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction {

    
    private String action;
    
    
    private String fieldName;

    @JsonCreator
    TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final String fieldName) {
        this.fieldName = fieldName;
        this.action =  REMOVE_FIELD_DEFINITION;
    }
    public TypeRemoveFieldDefinitionActionImpl() {
        this.action =  REMOVE_FIELD_DEFINITION;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getFieldName(){
        return this.fieldName;
    }

    
    public void setFieldName(final String fieldName){
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TypeRemoveFieldDefinitionActionImpl that = (TypeRemoveFieldDefinitionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(fieldName, that.fieldName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(fieldName)
            .toHashCode();
    }

}
