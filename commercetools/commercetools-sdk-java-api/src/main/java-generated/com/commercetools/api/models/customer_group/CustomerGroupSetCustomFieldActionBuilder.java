
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupSetCustomFieldActionBuilder implements Builder<CustomerGroupSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CustomerGroupSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CustomerGroupSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CustomerGroupSetCustomFieldAction build() {
        Objects.requireNonNull(name, CustomerGroupSetCustomFieldAction.class + ": name is missing");
        return new CustomerGroupSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CustomerGroupSetCustomFieldAction without checking for non null required values
     */
    public CustomerGroupSetCustomFieldAction buildUnchecked() {
        return new CustomerGroupSetCustomFieldActionImpl(name, value);
    }

    public static CustomerGroupSetCustomFieldActionBuilder of() {
        return new CustomerGroupSetCustomFieldActionBuilder();
    }

    public static CustomerGroupSetCustomFieldActionBuilder of(final CustomerGroupSetCustomFieldAction template) {
        CustomerGroupSetCustomFieldActionBuilder builder = new CustomerGroupSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
