
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
 *  <p>Requests to <span>reverse</span> a <span>Payment</span>. Checkout reverses the Payment, and then requests the PSP or gift card management system to proceed with the relevant process to reverse the Payment.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentReverseActionImpl implements PaymentIntentReverseAction, ModelBase {

    private String action;

    private String merchantReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentReverseActionImpl(@JsonProperty("merchantReference") final String merchantReference) {
        this.merchantReference = merchantReference;
        this.action = REVERSE_PAYMENT;
    }

    /**
     * create empty instance
     */
    public PaymentIntentReverseActionImpl() {
        this.action = REVERSE_PAYMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     */

    public String getMerchantReference() {
        return this.merchantReference;
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

        PaymentIntentReverseActionImpl that = (PaymentIntentReverseActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(merchantReference, that.merchantReference)
                .append(action, that.action)
                .append(merchantReference, that.merchantReference)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(merchantReference).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("merchantReference", merchantReference)
                .build();
    }

    @Override
    public PaymentIntentReverseAction copyDeep() {
        return PaymentIntentReverseAction.deepCopy(this);
    }
}
