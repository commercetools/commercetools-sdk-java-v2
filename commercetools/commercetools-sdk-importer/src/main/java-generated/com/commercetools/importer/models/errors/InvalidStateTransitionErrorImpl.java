package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.common.ProcessingState;
import com.commercetools.importer.models.errors.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidStateTransitionErrorImpl implements InvalidStateTransitionError {

    private String code;
    
    private String message;
    
    private com.commercetools.importer.models.common.ProcessingState currentState;
    
    private com.commercetools.importer.models.common.ProcessingState newState;

    @JsonCreator
    InvalidStateTransitionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("currentState") final com.commercetools.importer.models.common.ProcessingState currentState, @JsonProperty("newState") final com.commercetools.importer.models.common.ProcessingState newState) {
        this.message = message;
        this.currentState = currentState;
        this.newState = newState;
        this.code = "InvalidTransition";
    }
    public InvalidStateTransitionErrorImpl() {
       
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
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    public com.commercetools.importer.models.common.ProcessingState getCurrentState(){
        return this.currentState;
    }
    
    /**
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    public com.commercetools.importer.models.common.ProcessingState getNewState(){
        return this.newState;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setCurrentState(final com.commercetools.importer.models.common.ProcessingState currentState){
        this.currentState = currentState;
    }
    
    public void setNewState(final com.commercetools.importer.models.common.ProcessingState newState){
        this.newState = newState;
    }

}
