
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Staged Quote State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteTransitionStateAction stagedQuoteTransitionStateAction = StagedQuoteTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteTransitionStateActionImpl.class)
public interface StagedQuoteTransitionStateAction extends StagedQuoteUpdateAction {

    /**
     * discriminator value for StagedQuoteTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
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
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
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
     * @return instance of StagedQuoteTransitionStateAction
     */
    public static StagedQuoteTransitionStateAction of() {
        return new StagedQuoteTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteTransitionStateAction of(final StagedQuoteTransitionStateAction template) {
        StagedQuoteTransitionStateActionImpl instance = new StagedQuoteTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteTransitionStateAction deepCopy(@Nullable final StagedQuoteTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        StagedQuoteTransitionStateActionImpl instance = new StagedQuoteTransitionStateActionImpl();
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteTransitionStateAction
     * @return builder
     */
    public static StagedQuoteTransitionStateActionBuilder builder() {
        return StagedQuoteTransitionStateActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteTransitionStateActionBuilder builder(final StagedQuoteTransitionStateAction template) {
        return StagedQuoteTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteTransitionStateAction(Function<StagedQuoteTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteTransitionStateAction>";
            }
        };
    }
}
