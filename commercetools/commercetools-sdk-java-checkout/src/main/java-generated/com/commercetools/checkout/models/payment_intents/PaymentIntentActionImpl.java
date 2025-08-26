
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
 *  <p>Depending on the action specified, Checkout requests the <span>payment service provider</span> (PSP) or gift card management system to capture, refund, or cancel the authorization for the given Payment.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentActionImpl implements PaymentIntentAction, ModelBase {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action;

    private com.commercetools.checkout.models.common.Amount amount;

    private String merchantReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentActionImpl(
            @JsonProperty("action") final com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("merchantReference") final String merchantReference) {
        this.action = action;
        this.amount = amount;
        this.merchantReference = merchantReference;
    }

    /**
     * create empty instance
     */
    public PaymentIntentActionImpl() {
    }

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOperation getAction() {
        return this.action;
    }

    /**
     *  <p>Amount to be captured or refunded.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>A merchant-defined identifier associated with the Payment to track and reconcile the Payment Intent Action on the merchant's side. For example, an invoice number.</p>
     */

    public String getMerchantReference() {
        return this.merchantReference;
    }

    public void setAction(final com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action) {
        this.action = action;
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

        PaymentIntentActionImpl that = (PaymentIntentActionImpl) o;

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
    public PaymentIntentAction copyDeep() {
        return PaymentIntentAction.deepCopy(this);
    }
}
