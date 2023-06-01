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
 *  <p>The <code>Unique</code> AttributeConstraintEnum was violated.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message, @JsonProperty("attribute") final com.commercetools.importapi.models.productvariants.Attribute attribute) {
        this.message = message;
        this.attribute = attribute;
        this.code =  DUPLICATE_ATTRIBUTE_VALUE;
    }
    /**
     * create empty instance
     */
    public DuplicateAttributeValueErrorImpl() {
        this.code =  DUPLICATE_ATTRIBUTE_VALUE;
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
     *  <p>The attribute in conflict.</p>
     */
    
    public com.commercetools.importapi.models.productvariants.Attribute getAttribute(){
        return this.attribute;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setAttribute(final com.commercetools.importapi.models.productvariants.Attribute attribute){
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DuplicateAttributeValueErrorImpl that = (DuplicateAttributeValueErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(attribute, that.attribute)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(attribute)
            .toHashCode();
    }

}
