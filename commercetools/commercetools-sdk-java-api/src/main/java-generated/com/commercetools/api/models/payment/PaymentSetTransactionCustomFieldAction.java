
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetTransactionCustomFieldActionImpl.class)
public interface PaymentSetTransactionCustomFieldAction extends PaymentUpdateAction {

    String SET_TRANSACTION_CUSTOM_FIELD = "setTransactionCustomField";

    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setTransactionId(final String transactionId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static PaymentSetTransactionCustomFieldAction of() {
        return new PaymentSetTransactionCustomFieldActionImpl();
    }

    public static PaymentSetTransactionCustomFieldAction of(final PaymentSetTransactionCustomFieldAction template) {
        PaymentSetTransactionCustomFieldActionImpl instance = new PaymentSetTransactionCustomFieldActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PaymentSetTransactionCustomFieldActionBuilder builder() {
        return PaymentSetTransactionCustomFieldActionBuilder.of();
    }

    public static PaymentSetTransactionCustomFieldActionBuilder builder(
            final PaymentSetTransactionCustomFieldAction template) {
        return PaymentSetTransactionCustomFieldActionBuilder.of(template);
    }

    default <T> T withPaymentSetTransactionCustomFieldAction(
            Function<PaymentSetTransactionCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
