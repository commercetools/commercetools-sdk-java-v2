
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetDefaultBillingAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public MyCustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerSetDefaultBillingAddressAction build() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of() {
        return new MyCustomerSetDefaultBillingAddressActionBuilder();
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder of(
            final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionBuilder builder = new MyCustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
