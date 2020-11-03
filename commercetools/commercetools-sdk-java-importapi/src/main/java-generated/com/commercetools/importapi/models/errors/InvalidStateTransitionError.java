package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidStateTransitionErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidStateTransitionErrorImpl.class)
public interface InvalidStateTransitionError extends ErrorObject {

    /**
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    @NotNull
    @JsonProperty("currentState")
    public ProcessingState getCurrentState();
    /**
    *  <p>This enumeration describes the processing state of an import operation.</p>
    */
    @NotNull
    @JsonProperty("newState")
    public ProcessingState getNewState();

    public void setCurrentState(final ProcessingState currentState);
    
    public void setNewState(final ProcessingState newState);

    public static InvalidStateTransitionErrorImpl of(){
        return new InvalidStateTransitionErrorImpl();
    }
    

    public static InvalidStateTransitionErrorImpl of(final InvalidStateTransitionError template) {
        InvalidStateTransitionErrorImpl instance = new InvalidStateTransitionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setCurrentState(template.getCurrentState());
        instance.setNewState(template.getNewState());
        return instance;
    }

    default <T> T withInvalidStateTransitionError(Function<InvalidStateTransitionError, T> helper) {
        return helper.apply(this);
    }
}
