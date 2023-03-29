
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteStateTransitionMessagePayload quoteStateTransitionMessagePayload = QuoteStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteStateTransitionMessagePayloadImpl.class)
public interface QuoteStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteStateTransitionMessagePayload
     */
    String QUOTE_STATE_TRANSITION = "QuoteStateTransition";

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
     * @return instance of QuoteStateTransitionMessagePayload
     */
    public static QuoteStateTransitionMessagePayload of() {
        return new QuoteStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteStateTransitionMessagePayload of(final QuoteStateTransitionMessagePayload template) {
        QuoteStateTransitionMessagePayloadImpl instance = new QuoteStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteStateTransitionMessagePayload deepCopy(
            @Nullable final QuoteStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteStateTransitionMessagePayloadImpl instance = new QuoteStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteStateTransitionMessagePayload
     * @return builder
     */
    public static QuoteStateTransitionMessagePayloadBuilder builder() {
        return QuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteStateTransitionMessagePayloadBuilder builder(final QuoteStateTransitionMessagePayload template) {
        return QuoteStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteStateTransitionMessagePayload(Function<QuoteStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateTransitionMessagePayload>";
            }
        };
    }
}
