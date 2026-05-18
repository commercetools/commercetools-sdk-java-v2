
package com.commercetools.checkout.models.payment_integration_draft;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.application.ApplicationReference;
import com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration;
import com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference;
import com.commercetools.checkout.models.payment_integration.DisplayInfo;
import com.commercetools.checkout.models.payment_integration.PaymentComponentType;
import com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus;
import com.commercetools.checkout.models.payment_integration.SortingInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentIntegrationDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationDraft paymentIntegrationDraft = PaymentIntegrationDraft.builder()
 *             .application(applicationBuilder -> applicationBuilder)
 *             .type("{type}")
 *             .name("{name}")
 *             .componentType(PaymentComponentType.COMPONENT)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationDraftImpl.class)
public interface PaymentIntegrationDraft extends io.vrap.rmf.base.client.Draft<PaymentIntegrationDraft> {

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @return application
     */
    @NotNull
    @Valid
    @JsonProperty("application")
    public ApplicationReference getApplication();

    /**
     *  <p>Indicates whether the Payment Integration is active or not. By default in Inactive.</p>
     * @return status
     */

    @JsonProperty("status")
    public PaymentIntegrationStatus getStatus();

    /**
     *  <p>Type of the PaymentIntegration. ie. card, paypal, applepay.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Indicates the component type of payment integration.</p>
     * @return componentType
     */
    @NotNull
    @JsonProperty("componentType")
    public PaymentComponentType getComponentType();

    /**
     *  <p>Connector deployment info for the payment integration.</p>
     * @return connectorDeployment
     */
    @NotNull
    @Valid
    @JsonProperty("connectorDeployment")
    public ConnectorDeploymentReference getConnectorDeployment();

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @return displayInfo
     */
    @Valid
    @JsonProperty("displayInfo")
    public DisplayInfo getDisplayInfo();

    /**
     *  <p>Sorting info of the payment integration.</p>
     * @return sortingInfo
     */
    @Valid
    @JsonProperty("sortingInfo")
    public SortingInfo getSortingInfo();

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @return automatedReversalConfiguration
     */
    @Valid
    @JsonProperty("automatedReversalConfiguration")
    public AutomatedReversalConfiguration getAutomatedReversalConfiguration();

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     * @param application value to be set
     */

    public void setApplication(final ApplicationReference application);

    /**
     *  <p>Indicates whether the Payment Integration is active or not. By default in Inactive.</p>
     * @param status value to be set
     */

    public void setStatus(final PaymentIntegrationStatus status);

    /**
     *  <p>Type of the PaymentIntegration. ie. card, paypal, applepay.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Indicates the component type of payment integration.</p>
     * @param componentType value to be set
     */

    public void setComponentType(final PaymentComponentType componentType);

    /**
     *  <p>Connector deployment info for the payment integration.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param displayInfo value to be set
     */

    public void setDisplayInfo(final DisplayInfo displayInfo);

    /**
     *  <p>Sorting info of the payment integration.</p>
     * @param sortingInfo value to be set
     */

    public void setSortingInfo(final SortingInfo sortingInfo);

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     * @param automatedReversalConfiguration value to be set
     */

    public void setAutomatedReversalConfiguration(final AutomatedReversalConfiguration automatedReversalConfiguration);

    /**
     * factory method
     * @return instance of PaymentIntegrationDraft
     */
    public static PaymentIntegrationDraft of() {
        return new PaymentIntegrationDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationDraft of(final PaymentIntegrationDraft template) {
        PaymentIntegrationDraftImpl instance = new PaymentIntegrationDraftImpl();
        instance.setKey(template.getKey());
        instance.setApplication(template.getApplication());
        instance.setStatus(template.getStatus());
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setPredicate(template.getPredicate());
        instance.setComponentType(template.getComponentType());
        instance.setConnectorDeployment(template.getConnectorDeployment());
        instance.setDisplayInfo(template.getDisplayInfo());
        instance.setSortingInfo(template.getSortingInfo());
        instance.setAutomatedReversalConfiguration(template.getAutomatedReversalConfiguration());
        return instance;
    }

    public PaymentIntegrationDraft copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationDraft deepCopy(@Nullable final PaymentIntegrationDraft template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationDraftImpl instance = new PaymentIntegrationDraftImpl();
        instance.setKey(template.getKey());
        instance.setApplication(
            com.commercetools.checkout.models.application.ApplicationReference.deepCopy(template.getApplication()));
        instance.setStatus(template.getStatus());
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setPredicate(template.getPredicate());
        instance.setComponentType(template.getComponentType());
        instance.setConnectorDeployment(
            com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference
                    .deepCopy(template.getConnectorDeployment()));
        instance.setDisplayInfo(
            com.commercetools.checkout.models.payment_integration.DisplayInfo.deepCopy(template.getDisplayInfo()));
        instance.setSortingInfo(
            com.commercetools.checkout.models.payment_integration.SortingInfo.deepCopy(template.getSortingInfo()));
        instance.setAutomatedReversalConfiguration(
            com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration
                    .deepCopy(template.getAutomatedReversalConfiguration()));
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationDraft
     * @return builder
     */
    public static PaymentIntegrationDraftBuilder builder() {
        return PaymentIntegrationDraftBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationDraftBuilder builder(final PaymentIntegrationDraft template) {
        return PaymentIntegrationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationDraft(Function<PaymentIntegrationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationDraft>";
            }
        };
    }
}
