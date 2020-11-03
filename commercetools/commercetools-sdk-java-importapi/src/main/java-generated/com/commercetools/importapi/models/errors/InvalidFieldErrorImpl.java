package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
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


/**
*  <p>A field has an invalid value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorImpl implements InvalidFieldError {

    private String code;
    
    private String message;
    
    private String field;
    
    private com.fasterxml.jackson.databind.JsonNode invalidValue;
    
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues;

    @JsonCreator
    InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field, @JsonProperty("invalidValue") final com.fasterxml.jackson.databind.JsonNode invalidValue, @JsonProperty("allowedValues") final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues) {
        this.message = message;
        this.field = field;
        this.invalidValue = invalidValue;
        this.allowedValues = allowedValues;
        this.code = "InvalidField";
    }
    public InvalidFieldErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    /**
    *  <p>The error's description.</p>
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
    *  <p>The invalid value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getInvalidValue(){
        return this.invalidValue;
    }
    
    /**
    *  <p>A fixed set of allowed values for the field, if any.</p>
    */
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getAllowedValues(){
        return this.allowedValues;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setField(final String field){
        this.field = field;
    }
    
    public void setInvalidValue(final com.fasterxml.jackson.databind.JsonNode invalidValue){
        this.invalidValue = invalidValue;
    }
    
    public void setAllowedValues(final com.fasterxml.jackson.databind.JsonNode ...allowedValues){
       this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
    }
    
    public void setAllowedValues(final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues){
       this.allowedValues = allowedValues;
    }

}
