
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodPaymentMethodStatusSetMessagePayloadImpl
        implements PaymentMethodPaymentMethodStatusSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus status;

    private com.commercetools.api.models.payment_method.PaymentMethodStatus oldStatus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodPaymentMethodStatusSetMessagePayloadImpl(
            @JsonProperty("status") final com.commercetools.api.models.payment_method.PaymentMethodStatus status,
            @JsonProperty("oldStatus") final com.commercetools.api.models.payment_method.PaymentMethodStatus oldStatus) {
        this.status = status;
        this.oldStatus = oldStatus;
        this.type = PAYMENT_METHOD_PAYMENT_METHOD_STATUS_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodPaymentMethodStatusSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_PAYMENT_METHOD_STATUS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Status of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Status of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getOldStatus() {
        return this.oldStatus;
    }

    public void setStatus(final com.commercetools.api.models.payment_method.PaymentMethodStatus status) {
        this.status = status;
    }

    public void setOldStatus(final com.commercetools.api.models.payment_method.PaymentMethodStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodPaymentMethodStatusSetMessagePayloadImpl that = (PaymentMethodPaymentMethodStatusSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(status, that.status)
                .append(oldStatus, that.oldStatus)
                .append(type, that.type)
                .append(status, that.status)
                .append(oldStatus, that.oldStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(status).append(oldStatus).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("status", status)
                .append("oldStatus", oldStatus)
                .build();
    }

    @Override
    public PaymentMethodPaymentMethodStatusSetMessagePayload copyDeep() {
        return PaymentMethodPaymentMethodStatusSetMessagePayload.deepCopy(this);
    }
}
