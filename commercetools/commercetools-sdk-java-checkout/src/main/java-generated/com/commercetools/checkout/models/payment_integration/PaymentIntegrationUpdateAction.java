
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
 *  <p>Base type for all PaymentIntegration update actions.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationUpdateAction paymentIntegrationUpdateAction = PaymentIntegrationUpdateAction.setAutomatedReversalConfigurationPredicateBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentIntegrationUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = PaymentIntegrationUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentIntegrationUpdateAction {

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public PaymentIntegrationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationUpdateAction deepCopy(@Nullable final PaymentIntegrationUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof PaymentIntegrationUpdateActionImpl)) {
            return template.copyDeep();
        }
        PaymentIntegrationUpdateActionImpl instance = new PaymentIntegrationUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setAutomatedReversalConfigurationPredicate subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationPredicateUpdateActionBuilder setAutomatedReversalConfigurationPredicateBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationPredicateUpdateActionBuilder
                .of();
    }

    /**
     * builder for setAutomatedReversalConfigurationStatus subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationStatusUpdateActionBuilder setAutomatedReversalConfigurationStatusBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationStatusUpdateActionBuilder
                .of();
    }

    /**
     * builder for setAutomatedReversalConfiguration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationUpdateActionBuilder setAutomatedReversalConfigurationBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetAutomatedReversalConfigurationUpdateActionBuilder
                .of();
    }

    /**
     * builder for setConnectorDeployment subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetConnectorDeploymentUpdateActionBuilder setConnectorDeploymentBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetConnectorDeploymentUpdateActionBuilder.of();
    }

    /**
     * builder for setDisplayInfoDescription subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetDisplayInfoDescriptionUpdateActionBuilder setDisplayInfoDescriptionBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetDisplayInfoDescriptionUpdateActionBuilder.of();
    }

    /**
     * builder for setDisplayInfoLabel subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetDisplayInfoLabelUpdateActionBuilder setDisplayInfoLabelBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetDisplayInfoLabelUpdateActionBuilder.of();
    }

    /**
     * builder for setDisplayInfoLogoUrl subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetDisplayInfoLogoUrlUpdateActionBuilder setDisplayInfoLogoUrlBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetDisplayInfoLogoUrlUpdateActionBuilder.of();
    }

    /**
     * builder for setDisplayInfoPayButtonText subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetDisplayInfoPayButtonTextUpdateActionBuilder setDisplayInfoPayButtonTextBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetDisplayInfoPayButtonTextUpdateActionBuilder
                .of();
    }

    /**
     * builder for setDisplayInfo subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetDisplayInfoUpdateActionBuilder setDisplayInfoBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetDisplayInfoUpdateActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetKeyUpdateActionBuilder setKeyBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetKeyUpdateActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetNameUpdateActionBuilder setNameBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetNameUpdateActionBuilder.of();
    }

    /**
     * builder for setPredicate subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetPredicateUpdateActionBuilder setPredicateBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetPredicateUpdateActionBuilder.of();
    }

    /**
     * builder for setSortingInfo subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetSortingInfoUpdateActionBuilder setSortingInfoBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetSortingInfoUpdateActionBuilder.of();
    }

    /**
     * builder for setStatus subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetStatusUpdateActionBuilder setStatusBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetStatusUpdateActionBuilder.of();
    }

    /**
     * builder for setType subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.payment_integration.SetTypeUpdateActionBuilder setTypeBuilder() {
        return com.commercetools.checkout.models.payment_integration.SetTypeUpdateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationUpdateAction(Function<PaymentIntegrationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationUpdateAction>";
            }
        };
    }
}
