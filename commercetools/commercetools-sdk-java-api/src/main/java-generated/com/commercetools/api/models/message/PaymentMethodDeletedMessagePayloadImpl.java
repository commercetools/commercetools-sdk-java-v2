
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
 *  <p>Generated after a successful <span>Delete PaymentMethod</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDeletedMessagePayloadImpl implements PaymentMethodDeletedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment_method.PaymentMethod paymentMethod;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodDeletedMessagePayloadImpl(
            @JsonProperty("paymentMethod") final com.commercetools.api.models.payment_method.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.type = PAYMENT_METHOD_DELETED;
    }

    /**
     * create empty instance
     */
    public PaymentMethodDeletedMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> that was deleted.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(final com.commercetools.api.models.payment_method.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodDeletedMessagePayloadImpl that = (PaymentMethodDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(paymentMethod, that.paymentMethod)
                .append(type, that.type)
                .append(paymentMethod, that.paymentMethod)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(paymentMethod).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("paymentMethod", paymentMethod)
                .build();
    }

    @Override
    public PaymentMethodDeletedMessagePayload copyDeep() {
        return PaymentMethodDeletedMessagePayload.deepCopy(this);
    }
}
