
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
 *  <p>Generated after a successful Create PaymentMethod request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCreatedMessagePayloadImpl implements PaymentMethodCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment_method.PaymentMethod paymentMethod;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodCreatedMessagePayloadImpl(
            @JsonProperty("paymentMethod") final com.commercetools.api.models.payment_method.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.type = PAYMENT_METHOD_CREATED;
    }

    /**
     * create empty instance
     */
    public PaymentMethodCreatedMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>PaymentMethod that was created.</p>
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

        PaymentMethodCreatedMessagePayloadImpl that = (PaymentMethodCreatedMessagePayloadImpl) o;

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
    public PaymentMethodCreatedMessagePayload copyDeep() {
        return PaymentMethodCreatedMessagePayload.deepCopy(this);
    }
}
