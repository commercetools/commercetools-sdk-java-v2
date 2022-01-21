
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetTransactionCustomTypeActionImpl.class)
public interface PaymentSetTransactionCustomTypeAction extends PaymentUpdateAction {

    String SET_TRANSACTION_CUSTOM_TYPE = "setTransactionCustomType";

    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setTransactionId(final String transactionId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static PaymentSetTransactionCustomTypeAction of() {
        return new PaymentSetTransactionCustomTypeActionImpl();
    }

    public static PaymentSetTransactionCustomTypeAction of(final PaymentSetTransactionCustomTypeAction template) {
        PaymentSetTransactionCustomTypeActionImpl instance = new PaymentSetTransactionCustomTypeActionImpl();
        instance.setTransactionId(template.getTransactionId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static PaymentSetTransactionCustomTypeActionBuilder builder() {
        return PaymentSetTransactionCustomTypeActionBuilder.of();
    }

    public static PaymentSetTransactionCustomTypeActionBuilder builder(
            final PaymentSetTransactionCustomTypeAction template) {
        return PaymentSetTransactionCustomTypeActionBuilder.of(template);
    }

    default <T> T withPaymentSetTransactionCustomTypeAction(Function<PaymentSetTransactionCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
