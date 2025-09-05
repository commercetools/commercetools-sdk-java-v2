
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
 *  <p>Requests to <span>capture</span> the given amount from the customer. Checkout will request the PSP or gift card management system to proceed with the financial process to capture the amount.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentCaptureActionImpl implements PaymentIntentCaptureAction, ModelBase {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action;

    private com.commercetools.checkout.models.common.Amount amount;

    private String merchantReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentCaptureActionImpl(@JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("merchantReference") final String merchantReference) {
        this.amount = amount;
        this.merchantReference = merchantReference;
        this.action = PaymentIntentOperation.findEnum("capturePayment");
    }

    /**
     * create empty instance
     */
    public PaymentIntentCaptureActionImpl() {
        this.action = PaymentIntentOperation.findEnum("capturePayment");
    }

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOperation getAction() {
        return this.action;
    }

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
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

    public void setMerchantReference(final String merchantReference) {
        this.merchantReference = merchantReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntentCaptureActionImpl that = (PaymentIntentCaptureActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(amount, that.amount)
                .append(merchantReference, that.merchantReference)
                .append(action, that.action)
                .append(amount, that.amount)
                .append(merchantReference, that.merchantReference)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(amount).append(merchantReference).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("amount", amount)
                .append("merchantReference", merchantReference)
                .build();
    }

    @Override
    public PaymentIntentCaptureAction copyDeep() {
        return PaymentIntentCaptureAction.deepCopy(this);
    }
}
