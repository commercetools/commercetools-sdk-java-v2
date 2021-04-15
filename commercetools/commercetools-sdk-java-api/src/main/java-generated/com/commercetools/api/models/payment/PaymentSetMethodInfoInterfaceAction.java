
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoInterfaceActionImpl.class)
public interface PaymentSetMethodInfoInterfaceAction extends PaymentUpdateAction {

    String SET_METHOD_INFO_INTERFACE = "setMethodInfoInterface";

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
