
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
 *     StagedQuoteStateTransitionMessagePayload stagedQuoteStateTransitionMessagePayload = StagedQuoteStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteStateTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteStateTransitionMessagePayloadImpl.class)
public interface StagedQuoteStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteStateTransitionMessagePayload
     */
    String STAGED_QUOTE_STATE_TRANSITION = "StagedQuoteStateTransition";

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
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
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
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
     * @return instance of StagedQuoteStateTransitionMessagePayload
     */
    public static StagedQuoteStateTransitionMessagePayload of() {
        return new StagedQuoteStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteStateTransitionMessagePayload of(final StagedQuoteStateTransitionMessagePayload template) {
        StagedQuoteStateTransitionMessagePayloadImpl instance = new StagedQuoteStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public StagedQuoteStateTransitionMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteStateTransitionMessagePayload deepCopy(
            @Nullable final StagedQuoteStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        StagedQuoteStateTransitionMessagePayloadImpl instance = new StagedQuoteStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteStateTransitionMessagePayload
     * @return builder
     */
    public static StagedQuoteStateTransitionMessagePayloadBuilder builder() {
        return StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateTransitionMessagePayloadBuilder builder(
            final StagedQuoteStateTransitionMessagePayload template) {
        return StagedQuoteStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteStateTransitionMessagePayload(
            Function<StagedQuoteStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateTransitionMessagePayload>";
            }
        };
    }
}
