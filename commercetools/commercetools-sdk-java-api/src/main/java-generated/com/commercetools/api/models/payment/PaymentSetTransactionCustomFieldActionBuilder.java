
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetTransactionCustomFieldActionBuilder implements Builder<PaymentSetTransactionCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public PaymentSetTransactionCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public PaymentSetTransactionCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public PaymentSetTransactionCustomFieldAction build() {
        Objects.requireNonNull(name, PaymentSetTransactionCustomFieldAction.class + ": name is missing");
        return new PaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    /**
     * builds PaymentSetTransactionCustomFieldAction without checking for non null required values
     */
    public PaymentSetTransactionCustomFieldAction buildUnchecked() {
        return new PaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    public static PaymentSetTransactionCustomFieldActionBuilder of() {
        return new PaymentSetTransactionCustomFieldActionBuilder();
    }

    public static PaymentSetTransactionCustomFieldActionBuilder of(
            final PaymentSetTransactionCustomFieldAction template) {
        PaymentSetTransactionCustomFieldActionBuilder builder = new PaymentSetTransactionCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}