
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ProcessingState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * InvalidStateTransitionError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidStateTransitionError invalidStateTransitionError = InvalidStateTransitionError.builder()
 *             .message("{message}")
 *             .currentState(ProcessingState.PROCESSING)
 *             .newState(ProcessingState.PROCESSING)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidStateTransitionErrorImpl.class)
public interface InvalidStateTransitionError extends ErrorObject {

    /**
     * discriminator value for InvalidStateTransitionError
     */
    String INVALID_TRANSITION = "InvalidTransition";

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
     * @return currentState
     */
    @NotNull
    @JsonProperty("currentState")
    public ProcessingState getCurrentState();

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
     * @return newState
     */
    @NotNull
    @JsonProperty("newState")
    public ProcessingState getNewState();

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
     * @param currentState value to be set
     */

    public void setCurrentState(final ProcessingState currentState);

    /**
     *  <p>Every <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> is assigned one of the following states.</p>
     * @param newState value to be set
     */

    public void setNewState(final ProcessingState newState);

    /**
     * factory method
     * @return instance of InvalidStateTransitionError
     */
    public static InvalidStateTransitionError of() {
        return new InvalidStateTransitionErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidStateTransitionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidStateTransitionError of(final InvalidStateTransitionError template) {
        InvalidStateTransitionErrorImpl instance = new InvalidStateTransitionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setCurrentState(template.getCurrentState());
        instance.setNewState(template.getNewState());
        return instance;
    }

    public InvalidStateTransitionError copyDeep();

    /**
     * factory method to create a deep copy of InvalidStateTransitionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidStateTransitionError deepCopy(@Nullable final InvalidStateTransitionError template) {
        if (template == null) {
            return null;
        }
        InvalidStateTransitionErrorImpl instance = new InvalidStateTransitionErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setCurrentState(template.getCurrentState());
        instance.setNewState(template.getNewState());
        return instance;
    }

    /**
     * builder factory method for InvalidStateTransitionError
     * @return builder
     */
    public static InvalidStateTransitionErrorBuilder builder() {
        return InvalidStateTransitionErrorBuilder.of();
    }

    /**
     * create builder for InvalidStateTransitionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidStateTransitionErrorBuilder builder(final InvalidStateTransitionError template) {
        return InvalidStateTransitionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidStateTransitionError(Function<InvalidStateTransitionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidStateTransitionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidStateTransitionError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidStateTransitionError>";
            }
        };
    }
}
