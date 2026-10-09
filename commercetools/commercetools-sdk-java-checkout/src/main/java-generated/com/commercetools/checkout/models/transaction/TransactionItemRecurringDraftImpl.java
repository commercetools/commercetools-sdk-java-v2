
package com.commercetools.checkout.models.transaction;

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
 *  <p>Creates a Transaction Item to process a recurring payment for a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> using a specific connector deployment. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> referenced by the Transaction must have the same <code>customerId</code> as the referenced PaymentMethod.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemRecurringDraftImpl implements TransactionItemRecurringDraft, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemRecurringDraftImpl(
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("paymentMethod") final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod,
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.connectorDeployment = connectorDeployment;
        this.type = RECURRING;
    }

    /**
     * create empty instance
     */
    public TransactionItemRecurringDraftImpl() {
        this.type = RECURRING;
    }

    /**
     *  <p>Type of the Transaction Item to create.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
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

        TransactionItemRecurringDraftImpl that = (TransactionItemRecurringDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(amount)
                .append(paymentMethod)
                .append(connectorDeployment)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .append("paymentMethod", paymentMethod)
                .append("connectorDeployment", connectorDeployment)
                .build();
    }

    @Override
    public TransactionItemRecurringDraft copyDeep() {
        return TransactionItemRecurringDraft.deepCopy(this);
    }
}
