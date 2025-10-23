
package com.commercetools.history.models.common;

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
 * PaymentInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInfoImpl implements PaymentInfo, ModelBase {

    private java.util.List<com.commercetools.history.models.common.PaymentReference> payments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentInfoImpl(
            @JsonProperty("payments") final java.util.List<com.commercetools.history.models.common.PaymentReference> payments) {
        this.payments = payments;
    }

    /**
     * create empty instance
     */
    public PaymentInfoImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">References</a> to the Payments associated with the Order.</p>
     */

    public java.util.List<com.commercetools.history.models.common.PaymentReference> getPayments() {
        return this.payments;
    }

    public void setPayments(final com.commercetools.history.models.common.PaymentReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
    }

    public void setPayments(final java.util.List<com.commercetools.history.models.common.PaymentReference> payments) {
        this.payments = payments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentInfoImpl that = (PaymentInfoImpl) o;

        return new EqualsBuilder().append(payments, that.payments).append(payments, that.payments).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(payments).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("payments", payments).build();
    }

    @Override
    public PaymentInfo copyDeep() {
        return PaymentInfo.deepCopy(this);
    }
}
