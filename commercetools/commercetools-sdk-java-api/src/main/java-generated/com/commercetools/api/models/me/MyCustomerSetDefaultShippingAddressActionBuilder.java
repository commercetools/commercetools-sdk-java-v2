
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetDefaultShippingAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public MyCustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerSetDefaultShippingAddressAction build() {
        return new MyCustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder of() {
        return new MyCustomerSetDefaultShippingAddressActionBuilder();
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder of(
            final MyCustomerSetDefaultShippingAddressAction template) {
        MyCustomerSetDefaultShippingAddressActionBuilder builder = new MyCustomerSetDefaultShippingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
