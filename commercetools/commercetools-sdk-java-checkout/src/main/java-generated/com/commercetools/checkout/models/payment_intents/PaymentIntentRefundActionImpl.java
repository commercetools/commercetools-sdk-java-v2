
package com.commercetools.checkout.models.payment_intents;

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
 *  <p>Requests to <span>refund</span> the given amount to the customer. Checkout will request the PSP or gift card management system to proceed with the financial process to refund the amount.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentRefundActionImpl implements PaymentIntentRefundAction, ModelBase {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action;

    private com.commercetools.checkout.models.common.Amount amount;

    private String transactionId;

    private String merchantReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentRefundActionImpl(@JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("transactionId") final String transactionId,
            @JsonProperty("merchantReference") final String merchantReference) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.merchantReference = merchantReference;
        this.action = PaymentIntentOperation.findEnum("refundPayment");
    }

    /**
     * create empty instance
     */
    public PaymentIntentRefundActionImpl() {
        this.action = PaymentIntentOperation.findEnum("refundPayment");
    }

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOperation getAction() {
        return this.action;
    }

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>The identifier of the capture transaction that is associated with the refund action.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     */

    public String getMerchantReference() {
        return this.merchantReference;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setMerchantReference(final String merchantReference) {
        this.merchantReference = merchantReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntentRefundActionImpl that = (PaymentIntentRefundActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(amount, that.amount)
                .append(transactionId, that.transactionId)
                .append(merchantReference, that.merchantReference)
                .append(action, that.action)
                .append(amount, that.amount)
                .append(transactionId, that.transactionId)
                .append(merchantReference, that.merchantReference)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(amount)
                .append(transactionId)
                .append(merchantReference)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("amount", amount)
                .append("transactionId", transactionId)
                .append("merchantReference", merchantReference)
                .build();
    }

    @Override
    public PaymentIntentRefundAction copyDeep() {
        return PaymentIntentRefundAction.deepCopy(this);
    }
}
