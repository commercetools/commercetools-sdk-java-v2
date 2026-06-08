
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

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentActionImpl(
            @JsonProperty("action") final com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action) {
        this.action = action;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntentActionImpl that = (PaymentIntentActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public PaymentIntentAction copyDeep() {
        return PaymentIntentAction.deepCopy(this);
    }
}
