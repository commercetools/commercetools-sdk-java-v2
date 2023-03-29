
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
 *     QuoteRequestStateTransitionMessagePayload quoteRequestStateTransitionMessagePayload = QuoteRequestStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateTransitionMessagePayloadImpl.class)
public interface QuoteRequestStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteRequestStateTransitionMessagePayload
     */
    String QUOTE_REQUEST_STATE_TRANSITION = "QuoteRequestStateTransition";

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
     * @return instance of QuoteRequestStateTransitionMessagePayload
     */
    public static QuoteRequestStateTransitionMessagePayload of() {
        return new QuoteRequestStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestStateTransitionMessagePayload of(
            final QuoteRequestStateTransitionMessagePayload template) {
        QuoteRequestStateTransitionMessagePayloadImpl instance = new QuoteRequestStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestStateTransitionMessagePayload deepCopy(
            @Nullable final QuoteRequestStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRequestStateTransitionMessagePayloadImpl instance = new QuoteRequestStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestStateTransitionMessagePayload
     * @return builder
     */
    public static QuoteRequestStateTransitionMessagePayloadBuilder builder() {
        return QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteRequestStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateTransitionMessagePayloadBuilder builder(
            final QuoteRequestStateTransitionMessagePayload template) {
        return QuoteRequestStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestStateTransitionMessagePayload(
            Function<QuoteRequestStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateTransitionMessagePayload>";
            }
        };
    }
}
