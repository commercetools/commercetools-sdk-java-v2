
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemovePaymentAction" rel="nofollow">Remove Payment</a> update action or when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> is removed via <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemovePaymentAction" rel="nofollow">Order Edits</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentRemovedMessagePayloadImpl implements OrderPaymentRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment.PaymentReference paymentRef;

    private Boolean removedPaymentInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderPaymentRemovedMessagePayloadImpl(
            @JsonProperty("paymentRef") final com.commercetools.api.models.payment.PaymentReference paymentRef,
            @JsonProperty("removedPaymentInfo") final Boolean removedPaymentInfo) {
        this.paymentRef = paymentRef;
        this.removedPaymentInfo = removedPaymentInfo;
        this.type = ORDER_PAYMENT_REMOVED;
    }

    /**
     * create empty instance
     */
    public OrderPaymentRemovedMessagePayloadImpl() {
        this.type = ORDER_PAYMENT_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     */

    public com.commercetools.api.models.payment.PaymentReference getPaymentRef() {
        return this.paymentRef;
    }

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     */

    public Boolean getRemovedPaymentInfo() {
        return this.removedPaymentInfo;
    }

    public void setPaymentRef(final com.commercetools.api.models.payment.PaymentReference paymentRef) {
        this.paymentRef = paymentRef;
    }

    public void setRemovedPaymentInfo(final Boolean removedPaymentInfo) {
        this.removedPaymentInfo = removedPaymentInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPaymentRemovedMessagePayloadImpl that = (OrderPaymentRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(paymentRef, that.paymentRef)
                .append(removedPaymentInfo, that.removedPaymentInfo)
                .append(type, that.type)
                .append(paymentRef, that.paymentRef)
                .append(removedPaymentInfo, that.removedPaymentInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(paymentRef).append(removedPaymentInfo).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("paymentRef", paymentRef)
                .append("removedPaymentInfo", removedPaymentInfo)
                .build();
    }

    @Override
    public OrderPaymentRemovedMessagePayload copyDeep() {
        return OrderPaymentRemovedMessagePayload.deepCopy(this);
    }
}
