
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetExternalIdActionImpl.class)
public interface PaymentSetExternalIdAction extends PaymentUpdateAction {

    String SET_EXTERNAL_ID = "setExternalId";

    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static PaymentSetExternalIdAction of() {
        return new PaymentSetExternalIdActionImpl();
    }

    public static PaymentSetExternalIdAction of(final PaymentSetExternalIdAction template) {
        PaymentSetExternalIdActionImpl instance = new PaymentSetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public static PaymentSetExternalIdActionBuilder builder() {
        return PaymentSetExternalIdActionBuilder.of();
    }

    public static PaymentSetExternalIdActionBuilder builder(final PaymentSetExternalIdAction template) {
        return PaymentSetExternalIdActionBuilder.of(template);
    }

    default <T> T withPaymentSetExternalIdAction(Function<PaymentSetExternalIdAction, T> helper) {
        return helper.apply(this);
    }
}
