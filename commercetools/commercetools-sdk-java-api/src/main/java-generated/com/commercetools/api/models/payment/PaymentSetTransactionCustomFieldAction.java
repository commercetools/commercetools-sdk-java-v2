
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

    /**
    *  <p>description: |
    *  Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetTransactionCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetTransactionCustomFieldAction>";
            }
        };
    }
}
