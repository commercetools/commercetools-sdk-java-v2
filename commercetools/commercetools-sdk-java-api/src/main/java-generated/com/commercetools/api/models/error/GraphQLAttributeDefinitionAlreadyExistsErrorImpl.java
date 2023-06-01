package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
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
 *  <p>Returned when the <code>name</code> of the AttributeDefinition conflicts with an existing Attribute.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request or Change AttributeDefinition Name update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLAttributeDefinitionAlreadyExistsErrorImpl implements GraphQLAttributeDefinitionAlreadyExistsError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private String conflictingProductTypeId;
    
    
    private String conflictingProductTypeName;
    
    
    private String conflictingAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLAttributeDefinitionAlreadyExistsErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("conflictingProductTypeId") final String conflictingProductTypeId, @JsonProperty("conflictingProductTypeName") final String conflictingProductTypeName, @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.values = values;
        this.conflictingProductTypeId = conflictingProductTypeId;
        this.conflictingProductTypeName = conflictingProductTypeName;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code =  ATTRIBUTE_DEFINITION_ALREADY_EXISTS;
    }
    /**
     * create empty instance
     */
    public GraphQLAttributeDefinitionAlreadyExistsErrorImpl() {
        this.code =  ATTRIBUTE_DEFINITION_ALREADY_EXISTS;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     */
    
    public String getConflictingProductTypeId(){
        return this.conflictingProductTypeId;
    }
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     */
    
    public String getConflictingProductTypeName(){
        return this.conflictingProductTypeName;
    }
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     */
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setConflictingProductTypeId(final String conflictingProductTypeId){
        this.conflictingProductTypeId = conflictingProductTypeId;
    }
    
    
    public void setConflictingProductTypeName(final String conflictingProductTypeName){
        this.conflictingProductTypeName = conflictingProductTypeName;
    }
    
    
    public void setConflictingAttributeName(final String conflictingAttributeName){
        this.conflictingAttributeName = conflictingAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLAttributeDefinitionAlreadyExistsErrorImpl that = (GraphQLAttributeDefinitionAlreadyExistsErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(conflictingProductTypeId, that.conflictingProductTypeId)
                .append(conflictingProductTypeName, that.conflictingProductTypeName)
                .append(conflictingAttributeName, that.conflictingAttributeName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(conflictingProductTypeId)
            .append(conflictingProductTypeName)
            .append(conflictingAttributeName)
            .toHashCode();
    }

}
