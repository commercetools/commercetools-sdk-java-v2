
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.application.ApplicationReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentIntegration
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegration paymentIntegration = PaymentIntegration.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .application(applicationBuilder -> applicationBuilder)
 *             .type("{type}")
 *             .name("{name}")
 *             .componentType(PaymentComponentType.COMPONENT)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationImpl.class)
public interface PaymentIntegration {

    /**
     *  <p>Unique identifier of the PaymentIntegration.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the PaymentIntegration.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

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
     *  <p>Indicates whether the Payment Integration is active or not.</p>
     * @return status
     */

    @JsonProperty("status")
    public PaymentIntegrationStatus getStatus();

    /**
     *  <p>Type of the PaymentIntegration, for example, card, Paypal, or Applepay. This field must be same as used by the payment service provider (PSP) and must be supported by the Connector.</p>
     *  <p>Use <code>drop-in</code> for drop-in Payment Integrations.</p>
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
     *  <p>Indicates the component type of Payment Integration.</p>
     * @return componentType
     */
    @NotNull
    @JsonProperty("componentType")
    public PaymentComponentType getComponentType();

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
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
     *  <p>Sorting information of the Payment Integration.</p>
     * @return sortingInfo
     */
    @Valid
    @JsonProperty("sortingInfo")
    public SortingInfo getSortingInfo();

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @return automatedReversalConfiguration
     */
    @Valid
    @JsonProperty("automatedReversalConfiguration")
    public AutomatedReversalConfiguration getAutomatedReversalConfiguration();

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Unique identifier of the PaymentIntegration.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the PaymentIntegration.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

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
     *  <p>Indicates whether the Payment Integration is active or not.</p>
     * @param status value to be set
     */

    public void setStatus(final PaymentIntegrationStatus status);

    /**
     *  <p>Type of the PaymentIntegration, for example, card, Paypal, or Applepay. This field must be same as used by the payment service provider (PSP) and must be supported by the Connector.</p>
     *  <p>Use <code>drop-in</code> for drop-in Payment Integrations.</p>
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
     *  <p>Indicates the component type of Payment Integration.</p>
     * @param componentType value to be set
     */

    public void setComponentType(final PaymentComponentType componentType);

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     * @param connectorDeployment value to be set
     */

    public void setConnectorDeployment(final ConnectorDeploymentReference connectorDeployment);

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     * @param displayInfo value to be set
     */

    public void setDisplayInfo(final DisplayInfo displayInfo);

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     * @param sortingInfo value to be set
     */

    public void setSortingInfo(final SortingInfo sortingInfo);

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     * @param automatedReversalConfiguration value to be set
     */

    public void setAutomatedReversalConfiguration(final AutomatedReversalConfiguration automatedReversalConfiguration);

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     * factory method
     * @return instance of PaymentIntegration
     */
    public static PaymentIntegration of() {
        return new PaymentIntegrationImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegration
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegration of(final PaymentIntegration template) {
        PaymentIntegrationImpl instance = new PaymentIntegrationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    public PaymentIntegration copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegration deepCopy(@Nullable final PaymentIntegration template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationImpl instance = new PaymentIntegrationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
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
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCreatedBy(
            com.commercetools.checkout.models.payment_integration.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.checkout.models.payment_integration.LastModifiedBy
                .deepCopy(template.getLastModifiedBy()));
        return instance;
    }

    /**
     * builder factory method for PaymentIntegration
     * @return builder
     */
    public static PaymentIntegrationBuilder builder() {
        return PaymentIntegrationBuilder.of();
    }

    /**
     * create builder for PaymentIntegration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationBuilder builder(final PaymentIntegration template) {
        return PaymentIntegrationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegration(Function<PaymentIntegration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegration>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegration>";
            }
        };
    }
}
