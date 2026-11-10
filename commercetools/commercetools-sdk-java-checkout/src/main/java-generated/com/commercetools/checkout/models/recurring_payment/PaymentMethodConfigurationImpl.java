
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> and the <span>Connector</span> that processes it.</p>
 *  <p>Checkout only supports processing a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a> with one PaymentMethodConfiguration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodConfigurationImpl implements PaymentMethodConfiguration, ModelBase {

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodConfigurationImpl(
            @JsonProperty("paymentMethod") final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod,
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.paymentMethod = paymentMethod;
        this.connectorDeployment = connectorDeployment;
    }

    /**
     * create empty instance
     */
    public PaymentMethodConfigurationImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p><span>Connector</span> Deployment that processes the future payments of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    public void setPaymentMethod(final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
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

        PaymentMethodConfigurationImpl that = (PaymentMethodConfigurationImpl) o;

        return new EqualsBuilder().append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(paymentMethod).append(connectorDeployment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("paymentMethod", paymentMethod)
                .append("connectorDeployment", connectorDeployment)
                .build();
    }

    @Override
    public PaymentMethodConfiguration copyDeep() {
        return PaymentMethodConfiguration.deepCopy(this);
    }
}
