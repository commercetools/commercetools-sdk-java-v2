package com.commercetools.api.models.order;

import com.commercetools.api.models.payment.PaymentReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentInfoImpl implements PaymentInfo {

    private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;

    @JsonCreator
    PaymentInfoImpl(@JsonProperty("payments") final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
        this.payments = payments;
    }
    public PaymentInfoImpl() {
    }

    
    public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments(){
        return this.payments;
    }

    public void setPayments(final com.commercetools.api.models.payment.PaymentReference ...payments){
       this.payments = new ArrayList<>(Arrays.asList(payments));
    }
    
    public void setPayments(final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments){
       this.payments = payments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentInfoImpl that = (PaymentInfoImpl) o;
    
        return new EqualsBuilder()
                .append(payments, that.payments)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(payments)
            .toHashCode();
    }

}
