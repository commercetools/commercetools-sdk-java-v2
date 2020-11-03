package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.error.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldWithConflictingResourceErrorImpl implements DuplicateFieldWithConflictingResourceError {

    private String code;
    
    private String message;
    
    private String field;
    
    private com.fasterxml.jackson.databind.JsonNode duplicateValue;
    
    private com.commercetools.api.models.common.Reference conflictingResource;

    @JsonCreator
    DuplicateFieldWithConflictingResourceErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field, @JsonProperty("duplicateValue") final com.fasterxml.jackson.databind.JsonNode duplicateValue, @JsonProperty("conflictingResource") final com.commercetools.api.models.common.Reference conflictingResource) {
        this.message = message;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.conflictingResource = conflictingResource;
        this.code = "DuplicateFieldWithConflictingResource";
    }
    public DuplicateFieldWithConflictingResourceErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public String getField(){
        return this.field;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getDuplicateValue(){
        return this.duplicateValue;
    }
    
    
    public com.commercetools.api.models.common.Reference getConflictingResource(){
        return this.conflictingResource;
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
    
    public void setConflictingResource(final com.commercetools.api.models.common.Reference conflictingResource){
        this.conflictingResource = conflictingResource;
    }

}
