
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoMethodActionImpl.class)
public interface PaymentSetMethodInfoMethodAction extends PaymentUpdateAction {

    String SET_METHOD_INFO_METHOD = "setMethodInfoMethod";

    /**
    *  <p>If not provided, the method is unset.</p>
    */

    @JsonProperty("method")
    public String getMethod();

    public void setMethod(final String method);

    public static PaymentSetMethodInfoMethodAction of() {
        return new PaymentSetMethodInfoMethodActionImpl();
    }

    public static PaymentSetMethodInfoMethodAction of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionImpl instance = new PaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    public static PaymentSetMethodInfoMethodActionBuilder builder() {
        return PaymentSetMethodInfoMethodActionBuilder.of();
    }

    public static PaymentSetMethodInfoMethodActionBuilder builder(final PaymentSetMethodInfoMethodAction template) {
        return PaymentSetMethodInfoMethodActionBuilder.of(template);
    }

    default <T> T withPaymentSetMethodInfoMethodAction(Function<PaymentSetMethodInfoMethodAction, T> helper) {
        return helper.apply(this);
    }
}
