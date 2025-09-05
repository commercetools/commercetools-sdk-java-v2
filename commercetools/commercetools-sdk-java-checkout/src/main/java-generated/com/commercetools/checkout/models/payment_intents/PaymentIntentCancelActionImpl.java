
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
 *  <p>Requests to <span>cancel the authorization</span> for a Payment. Checkout will cancel the <span>Payment</span> and will request the PSP or gift card management system to proceed with the financial process to cancel the authorization.</p>
 *  <p>You cannot request to cancel the authorization for a Payment that has already been <span>captured</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentCancelActionImpl implements PaymentIntentCancelAction, ModelBase {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action;

    private String merchantReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentCancelActionImpl(@JsonProperty("merchantReference") final String merchantReference) {
        this.merchantReference = merchantReference;
        this.action = PaymentIntentOperation.findEnum("cancelPayment");
    }

    /**
     * create empty instance
     */
    public PaymentIntentCancelActionImpl() {
        this.action = PaymentIntentOperation.findEnum("cancelPayment");
    }

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOperation getAction() {
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

        PaymentIntentCancelActionImpl that = (PaymentIntentCancelActionImpl) o;

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
    public PaymentIntentCancelAction copyDeep() {
        return PaymentIntentCancelAction.deepCopy(this);
    }
}
