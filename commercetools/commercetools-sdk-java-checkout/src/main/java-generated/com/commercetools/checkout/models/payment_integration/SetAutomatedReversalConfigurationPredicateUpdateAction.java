
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the automated reversal configuration predicate of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationPredicateUpdateAction setAutomatedReversalConfigurationPredicateUpdateAction = SetAutomatedReversalConfigurationPredicateUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAutomatedReversalConfigurationPredicate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAutomatedReversalConfigurationPredicateUpdateActionImpl.class)
public interface SetAutomatedReversalConfigurationPredicateUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetAutomatedReversalConfigurationPredicateUpdateAction
     */
    String SET_AUTOMATED_REVERSAL_CONFIGURATION_PREDICATE = "setAutomatedReversalConfigurationPredicate";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of SetAutomatedReversalConfigurationPredicateUpdateAction
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateAction of() {
        return new SetAutomatedReversalConfigurationPredicateUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetAutomatedReversalConfigurationPredicateUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateAction of(
            final SetAutomatedReversalConfigurationPredicateUpdateAction template) {
        SetAutomatedReversalConfigurationPredicateUpdateActionImpl instance = new SetAutomatedReversalConfigurationPredicateUpdateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public SetAutomatedReversalConfigurationPredicateUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetAutomatedReversalConfigurationPredicateUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAutomatedReversalConfigurationPredicateUpdateAction deepCopy(
            @Nullable final SetAutomatedReversalConfigurationPredicateUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetAutomatedReversalConfigurationPredicateUpdateActionImpl instance = new SetAutomatedReversalConfigurationPredicateUpdateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for SetAutomatedReversalConfigurationPredicateUpdateAction
     * @return builder
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateActionBuilder builder() {
        return SetAutomatedReversalConfigurationPredicateUpdateActionBuilder.of();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationPredicateUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateActionBuilder builder(
            final SetAutomatedReversalConfigurationPredicateUpdateAction template) {
        return SetAutomatedReversalConfigurationPredicateUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAutomatedReversalConfigurationPredicateUpdateAction(
            Function<SetAutomatedReversalConfigurationPredicateUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationPredicateUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationPredicateUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetAutomatedReversalConfigurationPredicateUpdateAction>";
            }
        };
    }
}
