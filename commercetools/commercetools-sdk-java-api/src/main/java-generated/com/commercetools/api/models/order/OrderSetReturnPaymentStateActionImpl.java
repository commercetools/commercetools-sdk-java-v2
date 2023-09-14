
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>To set a ReturnPaymentState, the Order <code>returnInfo</code> must have at least one ReturnItem.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnPaymentStateActionImpl implements OrderSetReturnPaymentStateAction, ModelBase {

    private String action;

    private String returnItemId;

    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("returnItemKey") final String returnItemKey,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.returnItemId = returnItemId;
        this.returnItemKey = returnItemKey;
        this.paymentState = paymentState;
        this.action = SET_RETURN_PAYMENT_STATE;
    }

    /**
     * create empty instance
     */
    public OrderSetReturnPaymentStateActionImpl() {
        this.action = SET_RETURN_PAYMENT_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>New Payment status of the ReturnItem.</p>
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setReturnItemKey(final String returnItemKey) {
        this.returnItemKey = returnItemKey;
    }

    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetReturnPaymentStateActionImpl that = (OrderSetReturnPaymentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(paymentState, that.paymentState)
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(paymentState, that.paymentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(returnItemId)
                .append(returnItemKey)
                .append(paymentState)
                .toHashCode();
    }

}
