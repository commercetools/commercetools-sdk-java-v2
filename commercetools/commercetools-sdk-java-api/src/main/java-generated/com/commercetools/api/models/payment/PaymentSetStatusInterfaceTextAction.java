
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetStatusInterfaceTextActionImpl.class)
public interface PaymentSetStatusInterfaceTextAction extends PaymentUpdateAction {

    String SET_STATUS_INTERFACE_TEXT = "setStatusInterfaceText";

    @NotNull
    @JsonProperty("interfaceText")
    public String getInterfaceText();

    public void setInterfaceText(final String interfaceText);

    public static PaymentSetStatusInterfaceTextAction of() {
        return new PaymentSetStatusInterfaceTextActionImpl();
    }

    public static PaymentSetStatusInterfaceTextAction of(final PaymentSetStatusInterfaceTextAction template) {
        PaymentSetStatusInterfaceTextActionImpl instance = new PaymentSetStatusInterfaceTextActionImpl();
        instance.setInterfaceText(template.getInterfaceText());
        return instance;
    }

    public static PaymentSetStatusInterfaceTextActionBuilder builder() {
        return PaymentSetStatusInterfaceTextActionBuilder.of();
    }

    public static PaymentSetStatusInterfaceTextActionBuilder builder(
            final PaymentSetStatusInterfaceTextAction template) {
        return PaymentSetStatusInterfaceTextActionBuilder.of(template);
    }

    default <T> T withPaymentSetStatusInterfaceTextAction(Function<PaymentSetStatusInterfaceTextAction, T> helper) {
        return helper.apply(this);
    }
}
