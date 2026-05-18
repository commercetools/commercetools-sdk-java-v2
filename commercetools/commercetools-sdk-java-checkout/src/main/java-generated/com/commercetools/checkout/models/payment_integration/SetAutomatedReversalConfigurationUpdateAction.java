
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the automated reversal configuration of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationUpdateAction setAutomatedReversalConfigurationUpdateAction = SetAutomatedReversalConfigurationUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAutomatedReversalConfiguration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAutomatedReversalConfigurationUpdateActionImpl.class)
public interface SetAutomatedReversalConfigurationUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetAutomatedReversalConfigurationUpdateAction
     */
    String SET_AUTOMATED_REVERSAL_CONFIGURATION = "setAutomatedReversalConfiguration";

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @return automatedReversalConfiguration
     */
    @Valid
    @JsonProperty("automatedReversalConfiguration")
    public AutomatedReversalConfiguration getAutomatedReversalConfiguration();

    /**
     *  <p>Value to set as the automated reversal configuration of the PaymentIntegration.</p>
     * @param automatedReversalConfiguration value to be set
     */

    public void setAutomatedReversalConfiguration(final AutomatedReversalConfiguration automatedReversalConfiguration);

    /**
     * factory method
     * @return instance of SetAutomatedReversalConfigurationUpdateAction
     */
    public static SetAutomatedReversalConfigurationUpdateAction of() {
        return new SetAutomatedReversalConfigurationUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetAutomatedReversalConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAutomatedReversalConfigurationUpdateAction of(
            final SetAutomatedReversalConfigurationUpdateAction template) {
        SetAutomatedReversalConfigurationUpdateActionImpl instance = new SetAutomatedReversalConfigurationUpdateActionImpl();
        instance.setAutomatedReversalConfiguration(template.getAutomatedReversalConfiguration());
        return instance;
    }

    public SetAutomatedReversalConfigurationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetAutomatedReversalConfigurationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAutomatedReversalConfigurationUpdateAction deepCopy(
            @Nullable final SetAutomatedReversalConfigurationUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetAutomatedReversalConfigurationUpdateActionImpl instance = new SetAutomatedReversalConfigurationUpdateActionImpl();
        instance.setAutomatedReversalConfiguration(
            com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration
                    .deepCopy(template.getAutomatedReversalConfiguration()));
        return instance;
    }

    /**
     * builder factory method for SetAutomatedReversalConfigurationUpdateAction
     * @return builder
     */
    public static SetAutomatedReversalConfigurationUpdateActionBuilder builder() {
        return SetAutomatedReversalConfigurationUpdateActionBuilder.of();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationUpdateActionBuilder builder(
            final SetAutomatedReversalConfigurationUpdateAction template) {
        return SetAutomatedReversalConfigurationUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAutomatedReversalConfigurationUpdateAction(
            Function<SetAutomatedReversalConfigurationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetAutomatedReversalConfigurationUpdateAction>";
            }
        };
    }
}
