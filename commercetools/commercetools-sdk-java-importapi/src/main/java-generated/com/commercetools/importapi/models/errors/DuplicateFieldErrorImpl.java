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
*  <p>A value for a field conflicts with an existing duplicate value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldErrorImpl implements DuplicateFieldError {

    private String code;
    
    private String message;
    
    private String field;
    
    private com.fasterxml.jackson.databind.JsonNode duplicateValue;

    @JsonCreator
    DuplicateFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field, @JsonProperty("duplicateValue") final com.fasterxml.jackson.databind.JsonNode duplicateValue) {
        this.message = message;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.code = "DuplicateField";
    }
    public DuplicateFieldErrorImpl() {
        this.code = "DuplicateField";
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
    *  <p>The offending duplicate value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getDuplicateValue(){
        return this.duplicateValue;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setField(final String field){
        this.field = field;
    }
    
    public void setDuplicateValue(final com.fasterxml.jackson.databind.JsonNode duplicateValue){
        this.duplicateValue = duplicateValue;
    }

}
