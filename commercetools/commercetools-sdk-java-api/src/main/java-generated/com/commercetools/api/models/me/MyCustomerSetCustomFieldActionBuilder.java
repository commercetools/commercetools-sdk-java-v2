
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetCustomFieldActionBuilder implements Builder<MyCustomerSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyCustomerSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyCustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyCustomerSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyCustomerSetCustomFieldAction.class + ": name is missing");
        return new MyCustomerSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyCustomerSetCustomFieldAction without checking for non null required values
     */
    public MyCustomerSetCustomFieldAction buildUnchecked() {
        return new MyCustomerSetCustomFieldActionImpl(name, value);
    }

    public static MyCustomerSetCustomFieldActionBuilder of() {
        return new MyCustomerSetCustomFieldActionBuilder();
    }

    public static MyCustomerSetCustomFieldActionBuilder of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionBuilder builder = new MyCustomerSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
