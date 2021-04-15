
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetDefaultBillingAddressActionBuilder {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public CustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerSetDefaultBillingAddressAction build() {
        return new CustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    public static CustomerSetDefaultBillingAddressActionBuilder of() {
        return new CustomerSetDefaultBillingAddressActionBuilder();
    }

    public static CustomerSetDefaultBillingAddressActionBuilder of(
            final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionBuilder builder = new CustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
