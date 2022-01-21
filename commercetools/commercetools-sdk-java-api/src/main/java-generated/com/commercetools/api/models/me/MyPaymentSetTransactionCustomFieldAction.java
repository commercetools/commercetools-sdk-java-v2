
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

    @NotNull
    @JsonProperty("name")
    public String getName();

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
}
