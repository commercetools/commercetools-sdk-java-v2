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
 *  <p>Returned when an AttributeDefinition does not exist for an Attribute <code>name</code>.</p>
 *  <p>The error is returned as a failed response to the Change AttributeDefinition Name update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLAttributeNameDoesNotExistErrorImpl implements GraphQLAttributeNameDoesNotExistError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private String invalidAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLAttributeNameDoesNotExistErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("invalidAttributeName") final String invalidAttributeName) {
        this.values = values;
        this.invalidAttributeName = invalidAttributeName;
        this.code =  ATTRIBUTE_NAME_DOES_NOT_EXIST;
    }
    /**
     * create empty instance
     */
    public GraphQLAttributeNameDoesNotExistErrorImpl() {
        this.code =  ATTRIBUTE_NAME_DOES_NOT_EXIST;
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
     *  <p>Non-existent Attribute name.</p>
     */
    
    public String getInvalidAttributeName(){
        return this.invalidAttributeName;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setInvalidAttributeName(final String invalidAttributeName){
        this.invalidAttributeName = invalidAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLAttributeNameDoesNotExistErrorImpl that = (GraphQLAttributeNameDoesNotExistErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(invalidAttributeName, that.invalidAttributeName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(invalidAttributeName)
            .toHashCode();
    }

}
