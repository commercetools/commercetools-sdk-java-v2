
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by Checkout after forwarding a Payment Intent request to the payment Connector. If the Connector response does not contain a valid <code>outcome</code> value, Checkout returns a <code>500 Internal Server Error</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentResponseImpl implements PaymentIntentResponse, ModelBase {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome outcome;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentIntentResponseImpl(
            @JsonProperty("outcome") final com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome outcome) {
        this.outcome = outcome;
    }

    /**
     * create empty instance
     */
    public PaymentIntentResponseImpl() {
    }

    /**
     *  <p>The outcome of the Payment Intent as reported by the payment <span>Connector</span>.</p>
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome getOutcome() {
        return this.outcome;
    }

    public void setOutcome(final com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome outcome) {
        this.outcome = outcome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentIntentResponseImpl that = (PaymentIntentResponseImpl) o;

        return new EqualsBuilder().append(outcome, that.outcome).append(outcome, that.outcome).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(outcome).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("outcome", outcome).build();
    }

    @Override
    public PaymentIntentResponse copyDeep() {
        return PaymentIntentResponse.deepCopy(this);
    }
}
