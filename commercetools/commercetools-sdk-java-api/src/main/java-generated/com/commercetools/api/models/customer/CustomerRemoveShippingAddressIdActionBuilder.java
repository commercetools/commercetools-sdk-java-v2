
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerRemoveShippingAddressIdActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public CustomerRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
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

    public CustomerRemoveShippingAddressIdAction build() {
        return new CustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerRemoveShippingAddressIdActionBuilder of() {
        return new CustomerRemoveShippingAddressIdActionBuilder();
    }

    public static CustomerRemoveShippingAddressIdActionBuilder of(
            final CustomerRemoveShippingAddressIdAction template) {
        CustomerRemoveShippingAddressIdActionBuilder builder = new CustomerRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
