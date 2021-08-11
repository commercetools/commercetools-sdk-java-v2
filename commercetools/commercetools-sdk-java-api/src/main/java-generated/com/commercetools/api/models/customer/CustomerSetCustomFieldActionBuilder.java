
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetCustomFieldActionBuilder implements Builder<CustomerSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CustomerSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CustomerSetCustomFieldAction build() {
        Objects.requireNonNull(name, CustomerSetCustomFieldAction.class + ": name is missing");
        return new CustomerSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CustomerSetCustomFieldAction without checking for non null required values
     */
    public CustomerSetCustomFieldAction buildUnchecked() {
        return new CustomerSetCustomFieldActionImpl(name, value);
    }

    public static CustomerSetCustomFieldActionBuilder of() {
        return new CustomerSetCustomFieldActionBuilder();
    }

    public static CustomerSetCustomFieldActionBuilder of(final CustomerSetCustomFieldAction template) {
        CustomerSetCustomFieldActionBuilder builder = new CustomerSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
