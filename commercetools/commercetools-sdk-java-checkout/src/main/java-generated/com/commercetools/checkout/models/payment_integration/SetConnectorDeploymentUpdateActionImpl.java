
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
 *  <p>Sets the connector deployment reference of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetConnectorDeploymentUpdateActionImpl implements SetConnectorDeploymentUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetConnectorDeploymentUpdateActionImpl(
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        this.action = SET_CONNECTOR_DEPLOYMENT;
    }

    /**
     * create empty instance
     */
    public SetConnectorDeploymentUpdateActionImpl() {
        this.action = SET_CONNECTOR_DEPLOYMENT;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set as the connector deployment reference of the PaymentIntegration.</p>
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    public void setConnectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetConnectorDeploymentUpdateActionImpl that = (SetConnectorDeploymentUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(connectorDeployment, that.connectorDeployment)
                .append(action, that.action)
                .append(connectorDeployment, that.connectorDeployment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(connectorDeployment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("connectorDeployment", connectorDeployment)
                .build();
    }

    @Override
    public SetConnectorDeploymentUpdateAction copyDeep() {
        return SetConnectorDeploymentUpdateAction.deepCopy(this);
    }
}
