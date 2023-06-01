package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.errors.ErrorObject;
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
 * InvalidStateTransitionError
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InvalidStateTransitionErrorImpl implements InvalidStateTransitionError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private com.commercetools.importapi.models.common.ProcessingState currentState;
    
    
    private com.commercetools.importapi.models.common.ProcessingState newState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidStateTransitionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("currentState") final com.commercetools.importapi.models.common.ProcessingState currentState, @JsonProperty("newState") final com.commercetools.importapi.models.common.ProcessingState newState) {
        this.message = message;
        this.currentState = currentState;
        this.newState = newState;
        this.code =  INVALID_TRANSITION;
    }
    /**
     * create empty instance
     */
    public InvalidStateTransitionErrorImpl() {
        this.code =  INVALID_TRANSITION;
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
     *  <p>Every Import Operation is assigned with one of the following states.</p>
     */
    
    public com.commercetools.importapi.models.common.ProcessingState getCurrentState(){
        return this.currentState;
    }
    
    /**
     *  <p>Every Import Operation is assigned with one of the following states.</p>
     */
    
    public com.commercetools.importapi.models.common.ProcessingState getNewState(){
        return this.newState;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setCurrentState(final com.commercetools.importapi.models.common.ProcessingState currentState){
        this.currentState = currentState;
    }
    
    
    public void setNewState(final com.commercetools.importapi.models.common.ProcessingState newState){
        this.newState = newState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InvalidStateTransitionErrorImpl that = (InvalidStateTransitionErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(currentState, that.currentState)
                .append(newState, that.newState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(currentState)
            .append(newState)
            .toHashCode();
    }

}
