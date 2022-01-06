
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyPaymentSetTransactionCustomFieldActionBuilder
        implements Builder<MyPaymentSetTransactionCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyPaymentSetTransactionCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyPaymentSetTransactionCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyPaymentSetTransactionCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetTransactionCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetTransactionCustomFieldAction without checking for non null required values
     */
    public MyPaymentSetTransactionCustomFieldAction buildUnchecked() {
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder of() {
        return new MyPaymentSetTransactionCustomFieldActionBuilder();
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder of(
            final MyPaymentSetTransactionCustomFieldAction template) {
        MyPaymentSetTransactionCustomFieldActionBuilder builder = new MyPaymentSetTransactionCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
