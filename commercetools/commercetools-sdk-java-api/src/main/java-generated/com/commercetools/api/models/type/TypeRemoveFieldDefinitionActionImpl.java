package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
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

/**
 * TypeRemoveFieldDefinitionAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeRemoveFieldDefinitionActionImpl implements TypeRemoveFieldDefinitionAction, ModelBase {

    
    private String action;
    
    
    private String fieldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeRemoveFieldDefinitionActionImpl(@JsonProperty("fieldName") final String fieldName) {
        this.fieldName = fieldName;
        this.action =  REMOVE_FIELD_DEFINITION;
    }
    /**
     * create empty instance
     */
    public TypeRemoveFieldDefinitionActionImpl() {
        this.action =  REMOVE_FIELD_DEFINITION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
     */
    
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
