package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.productvariants.Attribute;
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
 *  <p>The <code>CombinationUnique</code> AttributeConstraintEnum was violated.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateAttributeValuesErrorImpl implements DuplicateAttributeValuesError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateAttributeValuesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.message = message;
        this.attributes = attributes;
        this.code =  DUPLICATE_ATTRIBUTE_VALUES;
    }
    /**
     * create empty instance
     */
    public DuplicateAttributeValuesErrorImpl() {
        this.code =  DUPLICATE_ATTRIBUTE_VALUES;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    
    public void setAttributes(final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes){
       this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DuplicateAttributeValuesErrorImpl that = (DuplicateAttributeValuesErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(attributes, that.attributes)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(attributes)
            .toHashCode();
    }

}
