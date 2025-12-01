
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the automated reversal configuration status of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationStatusUpdateAction setAutomatedReversalConfigurationStatusUpdateAction = SetAutomatedReversalConfigurationStatusUpdateAction.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAutomatedReversalConfigurationStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAutomatedReversalConfigurationStatusUpdateActionImpl.class)
public interface SetAutomatedReversalConfigurationStatusUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetAutomatedReversalConfigurationStatusUpdateAction
     */
    String SET_AUTOMATED_REVERSAL_CONFIGURATION_STATUS = "setAutomatedReversalConfigurationStatus";

    /**
     *  <p>Value to set as the automated reversal configuration status of the PaymentIntegration.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public String getStatus();

    /**
     *  <p>Value to set as the automated reversal configuration status of the PaymentIntegration.</p>
     * @param status value to be set
     */

    public void setStatus(final String status);

    /**
     * factory method
     * @return instance of SetAutomatedReversalConfigurationStatusUpdateAction
     */
    public static SetAutomatedReversalConfigurationStatusUpdateAction of() {
        return new SetAutomatedReversalConfigurationStatusUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetAutomatedReversalConfigurationStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAutomatedReversalConfigurationStatusUpdateAction of(
            final SetAutomatedReversalConfigurationStatusUpdateAction template) {
        SetAutomatedReversalConfigurationStatusUpdateActionImpl instance = new SetAutomatedReversalConfigurationStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public SetAutomatedReversalConfigurationStatusUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetAutomatedReversalConfigurationStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAutomatedReversalConfigurationStatusUpdateAction deepCopy(
            @Nullable final SetAutomatedReversalConfigurationStatusUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetAutomatedReversalConfigurationStatusUpdateActionImpl instance = new SetAutomatedReversalConfigurationStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for SetAutomatedReversalConfigurationStatusUpdateAction
     * @return builder
     */
    public static SetAutomatedReversalConfigurationStatusUpdateActionBuilder builder() {
        return SetAutomatedReversalConfigurationStatusUpdateActionBuilder.of();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationStatusUpdateActionBuilder builder(
            final SetAutomatedReversalConfigurationStatusUpdateAction template) {
        return SetAutomatedReversalConfigurationStatusUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAutomatedReversalConfigurationStatusUpdateAction(
            Function<SetAutomatedReversalConfigurationStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationStatusUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAutomatedReversalConfigurationStatusUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetAutomatedReversalConfigurationStatusUpdateAction>";
            }
        };
    }
}
