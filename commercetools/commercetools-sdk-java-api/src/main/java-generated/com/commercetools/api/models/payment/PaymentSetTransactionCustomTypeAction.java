
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
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Transaction with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Transaction.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetTransactionCustomTypeAction>";
            }
        };
    }
}
