
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddBillingAddressIdActionBuilder implements Builder<CustomerAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public CustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public CustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerAddBillingAddressIdAction build() {
        return new CustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerAddBillingAddressIdAction without checking for non null required values
     */
    public CustomerAddBillingAddressIdAction buildUnchecked() {
        return new CustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerAddBillingAddressIdActionBuilder of() {
        return new CustomerAddBillingAddressIdActionBuilder();
    }

    public static CustomerAddBillingAddressIdActionBuilder of(final CustomerAddBillingAddressIdAction template) {
        CustomerAddBillingAddressIdActionBuilder builder = new CustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
