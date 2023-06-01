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
 * TypeChangeFieldDefinitionOrderAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeFieldDefinitionOrderActionImpl implements TypeChangeFieldDefinitionOrderAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<String> fieldNames;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeChangeFieldDefinitionOrderActionImpl(@JsonProperty("fieldNames") final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        this.action =  CHANGE_FIELD_DEFINITION_ORDER;
    }
    /**
     * create empty instance
     */
    public TypeChangeFieldDefinitionOrderActionImpl() {
        this.action =  CHANGE_FIELD_DEFINITION_ORDER;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Must match the set of <code>name</code>s of FieldDefinitions (up to order).</p>
     */
    
    public java.util.List<String> getFieldNames(){
        return this.fieldNames;
    }

    
    public void setFieldNames(final String ...fieldNames){
       this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
    }
    
    
    public void setFieldNames(final java.util.List<String> fieldNames){
       this.fieldNames = fieldNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TypeChangeFieldDefinitionOrderActionImpl that = (TypeChangeFieldDefinitionOrderActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(fieldNames, that.fieldNames)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(fieldNames)
            .toHashCode();
    }

}
