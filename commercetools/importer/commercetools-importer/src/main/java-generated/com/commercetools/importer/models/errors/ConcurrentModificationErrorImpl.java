package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>The request conflicts with the current state of the involved resource(s). Typically, the request attempts to modify a resource
*  that is out of date, i.e. that has been modified by another client since the last time it was retrieved.
*  The client application should resolve the conflict (with or without involving the end-user) before retrying the request</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ConcurrentModificationErrorImpl implements ConcurrentModificationError {

    private String code;
    
    private String message;
    
    private Long specifiedVersion;
    
    private Long currentVersion;
    
    private com.fasterxml.jackson.databind.JsonNode conflictedResource;

    @JsonCreator
    ConcurrentModificationErrorImpl(@JsonProperty("message") final String message, @JsonProperty("specifiedVersion") final Long specifiedVersion, @JsonProperty("currentVersion") final Long currentVersion, @JsonProperty("conflictedResource") final com.fasterxml.jackson.databind.JsonNode conflictedResource) {
        this.message = message;
        this.specifiedVersion = specifiedVersion;
        this.currentVersion = currentVersion;
        this.conflictedResource = conflictedResource;
        this.code = "ConcurrentModification";
    }
    public ConcurrentModificationErrorImpl() {
       
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
    *  <p>The version specified in the failed request.</p>
    */
    public Long getSpecifiedVersion(){
        return this.specifiedVersion;
    }
    
    /**
    *  <p>The current version of the resource.</p>
    */
    public Long getCurrentVersion(){
        return this.currentVersion;
    }
    
    /**
    *  <p>The conflicted resource.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getConflictedResource(){
        return this.conflictedResource;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setSpecifiedVersion(final Long specifiedVersion){
        this.specifiedVersion = specifiedVersion;
    }
    
    public void setCurrentVersion(final Long currentVersion){
        this.currentVersion = currentVersion;
    }
    
    public void setConflictedResource(final com.fasterxml.jackson.databind.JsonNode conflictedResource){
        this.conflictedResource = conflictedResource;
    }

}
