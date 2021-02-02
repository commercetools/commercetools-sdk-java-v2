
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerChangeAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.Address address;

    public CustomerChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public CustomerChangeAddressActionBuilder address(final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerChangeAddressAction build() {
        return new CustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    public static CustomerChangeAddressActionBuilder of() {
        return new CustomerChangeAddressActionBuilder();
    }

    public static CustomerChangeAddressActionBuilder of(final CustomerChangeAddressAction template) {
        CustomerChangeAddressActionBuilder builder = new CustomerChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
