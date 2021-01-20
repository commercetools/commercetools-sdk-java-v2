
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

    @NotNull
    @JsonProperty("interface")
    public String getInterface();

    public void setInterface(final String _interface);

    public static PaymentSetMethodInfoInterfaceAction of() {
        return new PaymentSetMethodInfoInterfaceActionImpl();
    }

    public static PaymentSetMethodInfoInterfaceAction of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionImpl instance = new PaymentSetMethodInfoInterfaceActionImpl();
        instance.setInterface(template.getInterface());
        return instance;
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder builder() {
        return PaymentSetMethodInfoInterfaceActionBuilder.of();
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder builder(
            final PaymentSetMethodInfoInterfaceAction template) {
        return PaymentSetMethodInfoInterfaceActionBuilder.of(template);
    }

    default <T> T withPaymentSetMethodInfoInterfaceAction(Function<PaymentSetMethodInfoInterfaceAction, T> helper) {
        return helper.apply(this);
    }
}
