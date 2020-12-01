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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceDeletionErrorImpl implements ResourceDeletionError {

    private String code;
    
    private String message;
    
    private com.fasterxml.jackson.databind.JsonNode resource;

    @JsonCreator
    ResourceDeletionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("resource") final com.fasterxml.jackson.databind.JsonNode resource) {
        this.message = message;
        this.resource = resource;
        this.code = "ResourceDeletion";
    }
    public ResourceDeletionErrorImpl() {
        this.code = "ResourceDeletion";
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
    
    
    public com.fasterxml.jackson.databind.JsonNode getResource(){
        return this.resource;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setResource(final com.fasterxml.jackson.databind.JsonNode resource){
        this.resource = resource;
    }

}
