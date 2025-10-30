
package com.commercetools.checkout.models.payment_integration_draft;

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
 * PaymentIntegrationDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationDraftImpl implements PaymentIntegrationDraft, ModelBase {

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

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntegrationDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("application") final com.commercetools.checkout.models.application.ApplicationReference application,
            @JsonProperty("status") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus status,
            @JsonProperty("type") final String type, @JsonProperty("name") final String name,
            @JsonProperty("predicate") final String predicate,
            @JsonProperty("componentType") final com.commercetools.checkout.models.payment_integration.PaymentComponentType componentType,
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment,
            @JsonProperty("displayInfo") final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo,
            @JsonProperty("sortingInfo") final com.commercetools.checkout.models.payment_integration.SortingInfo sortingInfo,
            @JsonProperty("automatedReversalConfiguration") final com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration automatedReversalConfiguration) {
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
    }

    /**
     * create empty instance
     */
    public PaymentIntegrationDraftImpl() {
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
     *  <p>Indicates whether the Payment Integration is active or not. By default in Inactive.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Type of the PaymentIntegration. ie. card, paypal, applepay.</p>
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
     *  <p>Indicates the component type of payment integration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getComponentType() {
        return this.componentType;
    }

    /**
     *  <p>Connector deployment info for the payment integration.</p>
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
     *  <p>Sorting info of the payment integration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.SortingInfo getSortingInfo() {
        return this.sortingInfo;
    }

    /**
     *  <p>Configuration of the payment integration automatic reversal.</p>
     */

    public com.commercetools.checkout.models.payment_integration.AutomatedReversalConfiguration getAutomatedReversalConfiguration() {
        return this.automatedReversalConfiguration;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntegrationDraftImpl that = (PaymentIntegrationDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
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
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
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
                .build();
    }

    @Override
    public PaymentIntegrationDraft copyDeep() {
        return PaymentIntegrationDraft.deepCopy(this);
    }
}
