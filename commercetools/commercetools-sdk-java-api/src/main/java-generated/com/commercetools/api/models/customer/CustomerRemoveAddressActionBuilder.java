
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerRemoveAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public CustomerRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerRemoveAddressAction build() {
        return new CustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    public static CustomerRemoveAddressActionBuilder of() {
        return new CustomerRemoveAddressActionBuilder();
    }

    public static CustomerRemoveAddressActionBuilder of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionBuilder builder = new CustomerRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
