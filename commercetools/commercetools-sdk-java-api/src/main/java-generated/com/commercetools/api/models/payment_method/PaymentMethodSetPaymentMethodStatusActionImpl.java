
package com.commercetools.api.models.payment_method;

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
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodPaymentMethodStatusSetMessage" rel="nofollow">PaymentMethodPaymentMethodStatusSet</a> Message.</p>
 *  <p>A default Payment Method cannot be set as inactive, and the action will return an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetPaymentMethodStatusActionImpl
        implements PaymentMethodSetPaymentMethodStatusAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodSetPaymentMethodStatusActionImpl(
            @JsonProperty("paymentMethodStatus") final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
        this.action = SET_PAYMENT_METHOD_STATUS;
    }

    /**
     * create empty instance
     */
    public PaymentMethodSetPaymentMethodStatusActionImpl() {
        this.action = SET_PAYMENT_METHOD_STATUS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getPaymentMethodStatus() {
        return this.paymentMethodStatus;
    }

    public void setPaymentMethodStatus(
            final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodSetPaymentMethodStatusActionImpl that = (PaymentMethodSetPaymentMethodStatusActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentMethodStatus, that.paymentMethodStatus)
                .append(action, that.action)
                .append(paymentMethodStatus, that.paymentMethodStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentMethodStatus).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentMethodStatus", paymentMethodStatus)
                .build();
    }

    @Override
    public PaymentMethodSetPaymentMethodStatusAction copyDeep() {
        return PaymentMethodSetPaymentMethodStatusAction.deepCopy(this);
    }
}
