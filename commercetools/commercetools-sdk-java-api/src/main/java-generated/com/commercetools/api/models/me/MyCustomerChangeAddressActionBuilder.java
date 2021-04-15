
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerChangeAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.Address address;

    public MyCustomerChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public MyCustomerChangeAddressActionBuilder address(final com.commercetools.api.models.common.Address address) {
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

    public MyCustomerChangeAddressAction build() {
        return new MyCustomerChangeAddressActionImpl(addressId, addressKey, address);
    }

    public static MyCustomerChangeAddressActionBuilder of() {
        return new MyCustomerChangeAddressActionBuilder();
    }

    public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
