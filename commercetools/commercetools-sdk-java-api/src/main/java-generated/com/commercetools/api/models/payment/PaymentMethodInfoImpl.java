
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentMethodInfoImpl implements PaymentMethodInfo {

    private String paymentInterface;

    private String method;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    PaymentMethodInfoImpl(@JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("method") final String method,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.paymentInterface = paymentInterface;
        this.method = method;
        this.name = name;
    }

    public PaymentMethodInfoImpl() {
    }

    /**
    *  <p>The interface that handles the payment (usually a PSP).
    *  Cannot be changed once it has been set.
    *  The combination of Payment<code>interfaceId</code> and this field must be unique.</p>
    */
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
    *  <p>The payment method that is used, e.g.
    *  e.g.
    *  a conventional string representing Credit Card, Cash Advance etc.</p>
    */
    public String getMethod() {
        return this.method;
    }

    /**
    *  <p>A human-readable, localized name for the payment method, e.g.
    *  'Credit Card'.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoImpl that = (PaymentMethodInfoImpl) o;

        return new EqualsBuilder().append(paymentInterface, that.paymentInterface).append(method, that.method).append(
            name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(paymentInterface).append(method).append(name).toHashCode();
    }

}
