
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateTransitionMessagePayload recurringOrderStateTransitionMessagePayload = RecurringOrderStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderStateTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderStateTransitionMessagePayloadImpl.class)
public interface RecurringOrderStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderStateTransitionMessagePayload
     */
    String RECURRING_ORDER_STATE_TRANSITION = "RecurringOrderStateTransition";

    /**
     *  <p>RecurringOrderState after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>RecurringOrderState before the Transition State update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>RecurringOrderState after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>RecurringOrderState before the Transition State update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final StateReference oldState);

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of RecurringOrderStateTransitionMessagePayload
     */
    public static RecurringOrderStateTransitionMessagePayload of() {
        return new RecurringOrderStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderStateTransitionMessagePayload of(
            final RecurringOrderStateTransitionMessagePayload template) {
        RecurringOrderStateTransitionMessagePayloadImpl instance = new RecurringOrderStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public RecurringOrderStateTransitionMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStateTransitionMessagePayload deepCopy(
            @Nullable final RecurringOrderStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderStateTransitionMessagePayloadImpl instance = new RecurringOrderStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderStateTransitionMessagePayload
     * @return builder
     */
    public static RecurringOrderStateTransitionMessagePayloadBuilder builder() {
        return RecurringOrderStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStateTransitionMessagePayloadBuilder builder(
            final RecurringOrderStateTransitionMessagePayload template) {
        return RecurringOrderStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStateTransitionMessagePayload(
            Function<RecurringOrderStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStateTransitionMessagePayload>";
            }
        };
    }
}
