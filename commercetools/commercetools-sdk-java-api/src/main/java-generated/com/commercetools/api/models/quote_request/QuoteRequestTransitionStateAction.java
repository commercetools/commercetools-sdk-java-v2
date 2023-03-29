
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Quote Request State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestTransitionStateAction quoteRequestTransitionStateAction = QuoteRequestTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestTransitionStateActionImpl.class)
public interface QuoteRequestTransitionStateAction extends QuoteRequestUpdateAction {

    /**
     * discriminator value for QuoteRequestTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Switch validations on or off.</p>
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of QuoteRequestTransitionStateAction
     */
    public static QuoteRequestTransitionStateAction of() {
        return new QuoteRequestTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestTransitionStateAction of(final QuoteRequestTransitionStateAction template) {
        QuoteRequestTransitionStateActionImpl instance = new QuoteRequestTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestTransitionStateAction deepCopy(
            @Nullable final QuoteRequestTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        QuoteRequestTransitionStateActionImpl instance = new QuoteRequestTransitionStateActionImpl();
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestTransitionStateAction
     * @return builder
     */
    public static QuoteRequestTransitionStateActionBuilder builder() {
        return QuoteRequestTransitionStateActionBuilder.of();
    }

    /**
     * create builder for QuoteRequestTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestTransitionStateActionBuilder builder(final QuoteRequestTransitionStateAction template) {
        return QuoteRequestTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestTransitionStateAction(Function<QuoteRequestTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestTransitionStateAction>";
            }
        };
    }
}
