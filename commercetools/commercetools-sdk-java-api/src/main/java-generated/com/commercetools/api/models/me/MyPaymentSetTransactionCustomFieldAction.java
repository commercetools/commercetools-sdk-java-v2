
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetTransactionCustomFieldActionImpl.class)
public interface MyPaymentSetTransactionCustomFieldAction extends MyPaymentUpdateAction {

    String SET_TRANSACTION_CUSTOM_FIELD = "setTransactionCustomField";

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
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

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyPaymentSetTransactionCustomFieldAction of() {
        return new MyPaymentSetTransactionCustomFieldActionImpl();
    }

    public static MyPaymentSetTransactionCustomFieldAction of(final MyPaymentSetTransactionCustomFieldAction template) {
        MyPaymentSetTransactionCustomFieldActionImpl instance = new MyPaymentSetTransactionCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder builder() {
        return MyPaymentSetTransactionCustomFieldActionBuilder.of();
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder builder(
            final MyPaymentSetTransactionCustomFieldAction template) {
        return MyPaymentSetTransactionCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyPaymentSetTransactionCustomFieldAction(
            Function<MyPaymentSetTransactionCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetTransactionCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetTransactionCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetTransactionCustomFieldAction>";
            }
        };
    }
}
