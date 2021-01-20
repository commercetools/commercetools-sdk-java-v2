
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetMethodInfoNameActionImpl.class)
public interface PaymentSetMethodInfoNameAction extends PaymentUpdateAction {

    /**
    *  <p>If not provided, the name is unset.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static PaymentSetMethodInfoNameAction of() {
        return new PaymentSetMethodInfoNameActionImpl();
    }

    public static PaymentSetMethodInfoNameAction of(final PaymentSetMethodInfoNameAction template) {
        PaymentSetMethodInfoNameActionImpl instance = new PaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static PaymentSetMethodInfoNameActionBuilder builder() {
        return PaymentSetMethodInfoNameActionBuilder.of();
    }

    public static PaymentSetMethodInfoNameActionBuilder builder(final PaymentSetMethodInfoNameAction template) {
        return PaymentSetMethodInfoNameActionBuilder.of(template);
    }

    default <T> T withPaymentSetMethodInfoNameAction(Function<PaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }
}
