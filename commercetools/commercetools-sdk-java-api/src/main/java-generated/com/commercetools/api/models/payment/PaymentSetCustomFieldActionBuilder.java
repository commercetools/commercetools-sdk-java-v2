
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetCustomFieldActionBuilder implements Builder<PaymentSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public PaymentSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public PaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public PaymentSetCustomFieldAction build() {
        Objects.requireNonNull(name, PaymentSetCustomFieldAction.class + ": name is missing");
        return new PaymentSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds PaymentSetCustomFieldAction without checking for non null required values
     */
    public PaymentSetCustomFieldAction buildUnchecked() {
        return new PaymentSetCustomFieldActionImpl(name, value);
    }

    public static PaymentSetCustomFieldActionBuilder of() {
        return new PaymentSetCustomFieldActionBuilder();
    }

    public static PaymentSetCustomFieldActionBuilder of(final PaymentSetCustomFieldAction template) {
        PaymentSetCustomFieldActionBuilder builder = new PaymentSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
