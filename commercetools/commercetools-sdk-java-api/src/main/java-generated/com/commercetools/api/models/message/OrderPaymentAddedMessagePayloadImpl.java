
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderPaymentAddedMessagePayloadImpl implements OrderPaymentAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment.PaymentReference payment;

    @JsonCreator
    OrderPaymentAddedMessagePayloadImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
        this.type = ORDER_PAYMENT_ADDED;
    }

    public OrderPaymentAddedMessagePayloadImpl() {
        this.type = ORDER_PAYMENT_ADDED;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Payment">Payment</a>.</p>
    */
    public com.commercetools.api.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPaymentAddedMessagePayloadImpl that = (OrderPaymentAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(payment, that.payment).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(payment).toHashCode();
    }

}
