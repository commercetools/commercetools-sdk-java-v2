
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetAddressCustomFieldActionBuilder implements Builder<CustomerSetAddressCustomFieldAction> {

    private String addressId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CustomerSetAddressCustomFieldActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CustomerSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CustomerSetAddressCustomFieldAction build() {
        Objects.requireNonNull(addressId, CustomerSetAddressCustomFieldAction.class + ": addressId is missing");
        Objects.requireNonNull(name, CustomerSetAddressCustomFieldAction.class + ": name is missing");
        return new CustomerSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    /**
     * builds CustomerSetAddressCustomFieldAction without checking for non null required values
     */
    public CustomerSetAddressCustomFieldAction buildUnchecked() {
        return new CustomerSetAddressCustomFieldActionImpl(addressId, name, value);
    }

    public static CustomerSetAddressCustomFieldActionBuilder of() {
        return new CustomerSetAddressCustomFieldActionBuilder();
    }

    public static CustomerSetAddressCustomFieldActionBuilder of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionBuilder builder = new CustomerSetAddressCustomFieldActionBuilder();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
