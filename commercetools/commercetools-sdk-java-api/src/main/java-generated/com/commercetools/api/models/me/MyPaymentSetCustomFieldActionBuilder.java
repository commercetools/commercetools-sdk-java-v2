
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentSetCustomFieldActionBuilder implements Builder<MyPaymentSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyPaymentSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyPaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyPaymentSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetCustomFieldAction without checking for non null required values
     */
    public MyPaymentSetCustomFieldAction buildUnchecked() {
        return new MyPaymentSetCustomFieldActionImpl(name, value);
    }

    public static MyPaymentSetCustomFieldActionBuilder of() {
        return new MyPaymentSetCustomFieldActionBuilder();
    }

    public static MyPaymentSetCustomFieldActionBuilder of(final MyPaymentSetCustomFieldAction template) {
        MyPaymentSetCustomFieldActionBuilder builder = new MyPaymentSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
