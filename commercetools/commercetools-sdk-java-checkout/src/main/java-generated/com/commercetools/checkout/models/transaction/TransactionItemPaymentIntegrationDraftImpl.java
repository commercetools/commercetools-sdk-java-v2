
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
 *  <p>Creates a Transaction Item that is processed through a <span>Payment Integration</span>. This is the default Transaction Item type used when <code>type</code> is omitted.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemPaymentIntegrationDraftImpl implements TransactionItemPaymentIntegrationDraft, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemPaymentIntegrationDraftImpl(@JsonProperty("type") final String type,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("paymentIntegration") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration) {
        this.type = type;
        this.amount = amount;
        this.paymentIntegration = paymentIntegration;
    }

    /**
     * create empty instance
     */
    public TransactionItemPaymentIntegrationDraftImpl() {
    }

    /**
     *  <p>Must not be set for TransactionItemPaymentIntegrationDraft.</p>
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
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier getPaymentIntegration() {
        return this.paymentIntegration;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    public void setPaymentIntegration(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemPaymentIntegrationDraftImpl that = (TransactionItemPaymentIntegrationDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(paymentIntegration, that.paymentIntegration)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(paymentIntegration, that.paymentIntegration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(amount).append(paymentIntegration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .append("paymentIntegration", paymentIntegration)
                .build();
    }

    @Override
    public TransactionItemPaymentIntegrationDraft copyDeep() {
        return TransactionItemPaymentIntegrationDraft.deepCopy(this);
    }
}
