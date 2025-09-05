
package com.commercetools.checkout.models.transaction;

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
 * TransactionItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemDraftImpl implements TransactionItemDraft, ModelBase {

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration;

    private com.commercetools.checkout.models.common.Amount amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemDraftImpl(
            @JsonProperty("paymentIntegration") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount) {
        this.paymentIntegration = paymentIntegration;
        this.amount = amount;
    }

    /**
     * create empty instance
     */
    public TransactionItemDraftImpl() {
    }

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier getPaymentIntegration() {
        return this.paymentIntegration;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    public void setPaymentIntegration(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemDraftImpl that = (TransactionItemDraftImpl) o;

        return new EqualsBuilder().append(paymentIntegration, that.paymentIntegration)
                .append(amount, that.amount)
                .append(paymentIntegration, that.paymentIntegration)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(paymentIntegration).append(amount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("paymentIntegration", paymentIntegration)
                .append("amount", amount)
                .build();
    }

    @Override
    public TransactionItemDraft copyDeep() {
        return TransactionItemDraft.deepCopy(this);
    }
}
