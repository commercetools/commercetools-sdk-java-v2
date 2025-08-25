
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/payments:POST" rel="nofollow">Create Payment</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentCreatedMessagePayloadImpl implements PaymentCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment.Payment payment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentCreatedMessagePayloadImpl(
            @JsonProperty("payment") final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
        this.type = PAYMENT_CREATED;
    }

    /**
     * create empty instance
     */
    public PaymentCreatedMessagePayloadImpl() {
        this.type = PAYMENT_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was created.</p>
     */

    public com.commercetools.api.models.payment.Payment getPayment() {
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentCreatedMessagePayloadImpl that = (PaymentCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(payment, that.payment)
                .append(type, that.type)
                .append(payment, that.payment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(payment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("payment", payment)
                .build();
    }

    @Override
    public PaymentCreatedMessagePayload copyDeep() {
        return PaymentCreatedMessagePayload.deepCopy(this);
    }
}
