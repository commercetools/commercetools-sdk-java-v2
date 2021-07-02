
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProcessingState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidStateTransitionErrorImpl.class)
public interface InvalidStateTransitionError extends ErrorObject {

    String INVALID_TRANSITION = "InvalidTransition";

    /**
    *  <p>Represents the status of a resource under an import process. Every resource has the initial state <code>Unresolved</code>.</p>
    */
    @NotNull
    @JsonProperty("currentState")
    public ProcessingState getCurrentState();

    /**
    *  <p>Represents the status of a resource under an import process. Every resource has the initial state <code>Unresolved</code>.</p>
    */
    @NotNull
    @JsonProperty("newState")
    public ProcessingState getNewState();

    public void setCurrentState(final ProcessingState currentState);

    public void setNewState(final ProcessingState newState);

    public static InvalidStateTransitionError of() {
        return new InvalidStateTransitionErrorImpl();
    }

    public static InvalidStateTransitionError of(final InvalidStateTransitionError template) {
        InvalidStateTransitionErrorImpl instance = new InvalidStateTransitionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setCurrentState(template.getCurrentState());
        instance.setNewState(template.getNewState());
        return instance;
    }

    public static InvalidStateTransitionErrorBuilder builder() {
        return InvalidStateTransitionErrorBuilder.of();
    }

    public static InvalidStateTransitionErrorBuilder builder(final InvalidStateTransitionError template) {
        return InvalidStateTransitionErrorBuilder.of(template);
    }

    default <T> T withInvalidStateTransitionError(Function<InvalidStateTransitionError, T> helper) {
        return helper.apply(this);
    }
}
