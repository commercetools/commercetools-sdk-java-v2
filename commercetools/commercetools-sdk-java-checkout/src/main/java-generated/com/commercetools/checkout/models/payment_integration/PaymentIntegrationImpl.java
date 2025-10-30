
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * PaymentIntegration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationImpl implements PaymentIntegration, ModelBase {

    private String id;

    private Long version;

    private String key;

    private com.commercetools.checkout.models.application.ApplicationReference application;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status;

    private String type;

    private String name;

    private String predicate;

    private com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    private com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo;

    private com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo;

    private com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.checkout.models.payment_integration.CreatedBy createdBy;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntegrationImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("key") final String key,
            @JsonProperty("application") final com.commercetools.checkout.models.application.ApplicationReference application,
            @JsonProperty("status") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status,
            @JsonProperty("type") final String type, @JsonProperty("name") final String name,
            @JsonProperty("predicate") final String predicate,
            @JsonProperty("componentType") final com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType,
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment,
            @JsonProperty("displayInfo") final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo,
            @JsonProperty("sortingInfo") final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo,
            @JsonProperty("automatedReversalConfiguration") final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("createdBy") final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.id = id;
        this.version = version;
        this.key = key;
        this.application = application;
        this.status = status;
        this.type = type;
        this.name = name;
        this.predicate = predicate;
        this.componentType = componentType;
        this.connectorDeployment = connectorDeployment;
        this.displayInfo = displayInfo;
        this.sortingInfo = sortingInfo;
        this.automatedReversalConfiguration = automatedReversalConfiguration;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * create empty instance
     */
    public PaymentIntegrationImpl() {
    }

    /**
     *  <p>Unique identifier of the PaymentIntegration.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the PaymentIntegration.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>User-defined unique identifier of the PaymentIntegration. <code>MinLength: 2 ​MaxLength: 256 ​Pattern: ^[A-Za-z0-9_-]+$</code></p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Reference to an Application associated with the PaymentIntegration.</p>
     */

    public com.commercetools.checkout.models.application.ApplicationReference getApplication() {
        return this.application;
    }

    /**
     *  <p>Indicates whether the Payment Integration is active or not.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Type of the PaymentIntegration, for example, card, Paypal, or Applepay. This field must be same as used by the payment service provider (PSP) and must be supported by the Connector.</p>
     *  <p>Use <code>drop-in</code> for drop-in Payment Integrations.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the PaymentIntegration in the Merchant Center.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Predicate in JSONata format. Applies only when <code>componentType</code> is <code>Component</code>.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Indicates the component type of Payment Integration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getComponentType() {
        return this.componentType;
    }

    /**
     *  <p>Connector deployment info for the Payment Integration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     *  <p>Customization for the information that is displayed in the UI. Applies only when <code>componentType</code> is <code>Component</code></p>
     */

    public com.commercetools.checkout.models.payment_integration.DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    /**
     *  <p>Sorting information of the Payment Integration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    /**
     *  <p>Configuration of the Payment Integration automatic reversal.</p>
     */

    public com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration getAutomatedReversalConfiguration() {
        return this.automatedReversalConfiguration;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>IDs and references that created the PaymentIntegration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Date and time (UTC) the PaymentIntegration was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the PaymentIntegration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setApplication(final com.commercetools.checkout.models.application.ApplicationReference application) {
        this.application = application;
    }

    public void setStatus(final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status) {
        this.status = status;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setComponentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType) {
        this.componentType = componentType;
    }

    public void setConnectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
    }

    public void setDisplayInfo(final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
    }

    public void setSortingInfo(final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo) {
        this.sortingInfo = sortingInfo;
    }

    public void setAutomatedReversalConfiguration(
            final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration) {
        this.automatedReversalConfiguration = automatedReversalConfiguration;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(final com.commercetools.checkout.models.payment_integration.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(
            final com.commercetools.checkout.models.payment_integration.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntegrationImpl that = (PaymentIntegrationImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(key, that.key)
                .append(application, that.application)
                .append(status, that.status)
                .append(type, that.type)
                .append(name, that.name)
                .append(predicate, that.predicate)
                .append(componentType, that.componentType)
                .append(connectorDeployment, that.connectorDeployment)
                .append(displayInfo, that.displayInfo)
                .append(sortingInfo, that.sortingInfo)
                .append(automatedReversalConfiguration, that.automatedReversalConfiguration)
                .append(createdAt, that.createdAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(id, that.id)
                .append(version, that.version)
                .append(key, that.key)
                .append(application, that.application)
                .append(status, that.status)
                .append(type, that.type)
                .append(name, that.name)
                .append(predicate, that.predicate)
                .append(componentType, that.componentType)
                .append(connectorDeployment, that.connectorDeployment)
                .append(displayInfo, that.displayInfo)
                .append(sortingInfo, that.sortingInfo)
                .append(automatedReversalConfiguration, that.automatedReversalConfiguration)
                .append(createdAt, that.createdAt)
                .append(createdBy, that.createdBy)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(key)
                .append(application)
                .append(status)
                .append(type)
                .append(name)
                .append(predicate)
                .append(componentType)
                .append(connectorDeployment)
                .append(displayInfo)
                .append(sortingInfo)
                .append(automatedReversalConfiguration)
                .append(createdAt)
                .append(createdBy)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("key", key)
                .append("application", application)
                .append("status", status)
                .append("type", type)
                .append("name", name)
                .append("predicate", predicate)
                .append("componentType", componentType)
                .append("connectorDeployment", connectorDeployment)
                .append("displayInfo", displayInfo)
                .append("sortingInfo", sortingInfo)
                .append("automatedReversalConfiguration", automatedReversalConfiguration)
                .append("createdAt", createdAt)
                .append("createdBy", createdBy)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .build();
    }

    @Override
    public PaymentIntegration copyDeep() {
        return PaymentIntegration.deepCopy(this);
    }
}
