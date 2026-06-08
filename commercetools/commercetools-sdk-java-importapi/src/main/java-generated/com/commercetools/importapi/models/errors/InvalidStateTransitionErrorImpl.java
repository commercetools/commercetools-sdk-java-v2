
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * InvalidStateTransitionError
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidStateTransitionErrorImpl implements InvalidStateTransitionError, ModelBase {

    private String code;

    private String message;

    private com.commercetools.importapi.models.common.ProcessingState currentState;

    private com.commercetools.importapi.models.common.ProcessingState newState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidStateTransitionErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("currentState") final com.commercetools.importapi.models.common.ProcessingState currentState,
            @JsonProperty("newState") final com.commercetools.importapi.models.common.ProcessingState newState) {
        this.message = message;
        this.currentState = currentState;
        this.newState = newState;
        this.code = INVALID_TRANSITION;
    }

    /**
     * create empty instance
     */
    public InvalidStateTransitionErrorImpl() {
        this.code = INVALID_TRANSITION;
    }

    /**
     *  <p>An error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
     */

    public com.commercetools.importapi.models.common.ProcessingState getCurrentState() {
        return this.currentState;
    }

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
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

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(currentState, that.currentState)
                .append(newState, that.newState)
                .append(code, that.code)
                .append(message, that.message)
                .append(currentState, that.currentState)
                .append(newState, that.newState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(currentState)
                .append(newState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("currentState", currentState)
                .append("newState", newState)
                .build();
    }

    @Override
    public InvalidStateTransitionError copyDeep() {
        return InvalidStateTransitionError.deepCopy(this);
    }
}
