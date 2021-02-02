
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidStateTransitionErrorImpl implements InvalidStateTransitionError {

    private String code;

    private String message;

    private com.commercetools.importapi.models.common.ProcessingState currentState;

    private com.commercetools.importapi.models.common.ProcessingState newState;

    @JsonCreator
    InvalidStateTransitionErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("currentState") final com.commercetools.importapi.models.common.ProcessingState currentState,
            @JsonProperty("newState") final com.commercetools.importapi.models.common.ProcessingState newState) {
        this.message = message;
        this.currentState = currentState;
        this.newState = newState;
        this.code = INVALID_TRANSITION;
    }

    public InvalidStateTransitionErrorImpl() {
        this.code = INVALID_TRANSITION;
    }

    public String getCode() {
        return this.code;
    }

    /**
    *  <p>The error's description.</p>
    */
    public String getMessage() {
        return this.message;
    }

    /**
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    public com.commercetools.importapi.models.common.ProcessingState getCurrentState() {
        return this.currentState;
    }

    /**
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    public com.commercetools.importapi.models.common.ProcessingState getNewState() {
        return this.newState;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCurrentState(final com.commercetools.importapi.models.common.ProcessingState currentState) {
        this.currentState = currentState;
    }

    public void setNewState(final com.commercetools.importapi.models.common.ProcessingState newState) {
        this.newState = newState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidStateTransitionErrorImpl that = (InvalidStateTransitionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(currentState,
            that.currentState).append(newState, that.newState).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(currentState).append(
            newState).toHashCode();
    }

}
