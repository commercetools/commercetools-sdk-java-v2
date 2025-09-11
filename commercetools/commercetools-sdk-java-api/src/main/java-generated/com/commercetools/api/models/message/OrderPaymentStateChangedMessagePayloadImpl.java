
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change PaymentState</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentStateChangedMessagePayloadImpl implements OrderPaymentStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.PaymentState oldPaymentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderPaymentStateChangedMessagePayloadImpl(
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("oldPaymentState") final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.paymentState = paymentState;
        this.oldPaymentState = oldPaymentState;
        this.type = ORDER_PAYMENT_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public OrderPaymentStateChangedMessagePayloadImpl() {
        this.type = ORDER_PAYMENT_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     */

    public com.commercetools.api.models.order.PaymentState getOldPaymentState() {
        return this.oldPaymentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setOldPaymentState(final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.oldPaymentState = oldPaymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPaymentStateChangedMessagePayloadImpl that = (OrderPaymentStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(paymentState, that.paymentState)
                .append(oldPaymentState, that.oldPaymentState)
                .append(type, that.type)
                .append(paymentState, that.paymentState)
                .append(oldPaymentState, that.oldPaymentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(paymentState).append(oldPaymentState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("paymentState", paymentState)
                .append("oldPaymentState", oldPaymentState)
                .build();
    }

    @Override
    public OrderPaymentStateChangedMessagePayload copyDeep() {
        return OrderPaymentStateChangedMessagePayload.deepCopy(this);
    }
}
