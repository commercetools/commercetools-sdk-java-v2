
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoImpl.class)
public interface PaymentMethodInfo {

    /**
    *  <p>The interface that handles the payment (usually a PSP).
    *  Cannot be changed once it has been set.
    *  The combination of Payment<code>interfaceId</code> and this field must be unique.</p>
    */

    @JsonProperty("paymentInterface")
    public String getPaymentInterface();

    /**
    *  <p>The payment method that is used, e.g.
    *  e.g.
    *  a conventional string representing Credit Card, Cash Advance etc.</p>
    */

    @JsonProperty("method")
    public String getMethod();

    /**
    *  <p>A human-readable, localized name for the payment method, e.g.
    *  'Credit Card'.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setPaymentInterface(final String paymentInterface);

    public void setMethod(final String method);

    public void setName(final LocalizedString name);

    public static PaymentMethodInfo of() {
        return new PaymentMethodInfoImpl();
    }

    public static PaymentMethodInfo of(final PaymentMethodInfo template) {
        PaymentMethodInfoImpl instance = new PaymentMethodInfoImpl();
        instance.setPaymentInterface(template.getPaymentInterface());
        instance.setMethod(template.getMethod());
        instance.setName(template.getName());
        return instance;
    }

    public static PaymentMethodInfoBuilder builder() {
        return PaymentMethodInfoBuilder.of();
    }

    public static PaymentMethodInfoBuilder builder(final PaymentMethodInfo template) {
        return PaymentMethodInfoBuilder.of(template);
    }

    default <T> T withPaymentMethodInfo(Function<PaymentMethodInfo, T> helper) {
        return helper.apply(this);
    }
}
