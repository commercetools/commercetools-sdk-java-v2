
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetKeyActionImpl.class)
public interface PaymentSetKeyAction extends PaymentUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>User-specific unique identifier for the payment (max.
    *  256 characters).
    *  If not provided an existing key will be removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static PaymentSetKeyAction of() {
        return new PaymentSetKeyActionImpl();
    }

    public static PaymentSetKeyAction of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionImpl instance = new PaymentSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static PaymentSetKeyActionBuilder builder() {
        return PaymentSetKeyActionBuilder.of();
    }

    public static PaymentSetKeyActionBuilder builder(final PaymentSetKeyAction template) {
        return PaymentSetKeyActionBuilder.of(template);
    }

    default <T> T withPaymentSetKeyAction(Function<PaymentSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
