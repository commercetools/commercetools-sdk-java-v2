package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class AttributeDefinitionAlreadyExistsErrorImpl implements AttributeDefinitionAlreadyExistsError {

    private String code;
    
    private String message;
    
    private String conflictingProductTypeId;
    
    private String conflictingProductTypeName;
    
    private String conflictingAttributeName;

    @JsonCreator
    AttributeDefinitionAlreadyExistsErrorImpl(@JsonProperty("message") final String message, @JsonProperty("conflictingProductTypeId") final String conflictingProductTypeId, @JsonProperty("conflictingProductTypeName") final String conflictingProductTypeName, @JsonProperty("conflictingAttributeName") final String conflictingAttributeName) {
        this.message = message;
        this.conflictingProductTypeId = conflictingProductTypeId;
        this.conflictingProductTypeName = conflictingProductTypeName;
        this.conflictingAttributeName = conflictingAttributeName;
        this.code = "AttributeDefinitionAlreadyExists";
    }
    public AttributeDefinitionAlreadyExistsErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public String getConflictingProductTypeId(){
        return this.conflictingProductTypeId;
    }
    
    
    public String getConflictingProductTypeName(){
        return this.conflictingProductTypeName;
    }
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    public void setMessage(final String message){
        this.message = message;
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

}
