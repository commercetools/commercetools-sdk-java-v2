package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
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
 *  <p>The given value already exists for a field that is checked for unique values.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DuplicateFieldErrorImpl implements DuplicateFieldError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private String field;
    
    
    private java.lang.Object duplicateValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field, @JsonProperty("duplicateValue") final java.lang.Object duplicateValue) {
        this.message = message;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.code =  DUPLICATE_FIELD;
    }
    /**
     * create empty instance
     */
    public DuplicateFieldErrorImpl() {
        this.code =  DUPLICATE_FIELD;
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
     *  <p>The name of the field.</p>
     */
    
    public String getField(){
        return this.field;
    }
    
    /**
     *  <p>The offending duplicate value.</p>
     */
    
    public java.lang.Object getDuplicateValue(){
        return this.duplicateValue;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setField(final String field){
        this.field = field;
    }
    
    
    public void setDuplicateValue(final java.lang.Object duplicateValue){
        this.duplicateValue = duplicateValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DuplicateFieldErrorImpl that = (DuplicateFieldErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .append(duplicateValue, that.duplicateValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(field)
            .append(duplicateValue)
            .toHashCode();
    }

}
