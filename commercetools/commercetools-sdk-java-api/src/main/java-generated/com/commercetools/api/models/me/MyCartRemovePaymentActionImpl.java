
package com.commercetools.api.models.me;

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
 * MyCartRemovePaymentAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemovePaymentActionImpl implements MyCartRemovePaymentAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartRemovePaymentActionImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        this.action = REMOVE_PAYMENT;
    }

    /**
     * create empty instance
     */
    public MyCartRemovePaymentActionImpl() {
        this.action = REMOVE_PAYMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Payment to remove from the Cart.</p>
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartRemovePaymentActionImpl that = (MyCartRemovePaymentActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(payment, that.payment)
                .append(action, that.action)
                .append(payment, that.payment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(payment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("payment", payment)
                .build();
    }

    @Override
    public MyCartRemovePaymentAction copyDeep() {
        return MyCartRemovePaymentAction.deepCopy(this);
    }
}
