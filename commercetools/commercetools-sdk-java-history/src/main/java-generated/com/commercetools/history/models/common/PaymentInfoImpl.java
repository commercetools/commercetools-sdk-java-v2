
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentInfoImpl implements PaymentInfo, ModelBase {

    private java.util.List<com.commercetools.history.models.common.Reference> payments;

    @JsonCreator
    PaymentInfoImpl(
            @JsonProperty("payments") final java.util.List<com.commercetools.history.models.common.Reference> payments) {
        this.payments = payments;
    }

    public PaymentInfoImpl() {
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getPayments() {
        return this.payments;
    }

    public void setPayments(final com.commercetools.history.models.common.Reference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
    }

    public void setPayments(final java.util.List<com.commercetools.history.models.common.Reference> payments) {
        this.payments = payments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentInfoImpl that = (PaymentInfoImpl) o;

        return new EqualsBuilder().append(payments, that.payments).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(payments).toHashCode();
    }

}
