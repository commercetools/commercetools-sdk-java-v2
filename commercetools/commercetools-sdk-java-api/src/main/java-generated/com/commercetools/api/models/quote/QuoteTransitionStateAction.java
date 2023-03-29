
package com.commercetools.api.models.quote;

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
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Quote State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteTransitionStateAction quoteTransitionStateAction = QuoteTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteTransitionStateActionImpl.class)
public interface QuoteTransitionStateAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteTransitionStateAction
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
     * @return instance of QuoteTransitionStateAction
     */
    public static QuoteTransitionStateAction of() {
        return new QuoteTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy QuoteTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteTransitionStateAction of(final QuoteTransitionStateAction template) {
        QuoteTransitionStateActionImpl instance = new QuoteTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteTransitionStateAction deepCopy(@Nullable final QuoteTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        QuoteTransitionStateActionImpl instance = new QuoteTransitionStateActionImpl();
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteTransitionStateAction
     * @return builder
     */
    public static QuoteTransitionStateActionBuilder builder() {
        return QuoteTransitionStateActionBuilder.of();
    }

    /**
     * create builder for QuoteTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteTransitionStateActionBuilder builder(final QuoteTransitionStateAction template) {
        return QuoteTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteTransitionStateAction(Function<QuoteTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteTransitionStateAction>";
            }
        };
    }
}
