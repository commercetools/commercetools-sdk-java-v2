
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerAddBillingAddressIdActionBuilder implements Builder<MyCustomerAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    public MyCustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    public MyCustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerAddBillingAddressIdAction build() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerAddBillingAddressIdAction without checking for non null required values
     */
    public MyCustomerAddBillingAddressIdAction buildUnchecked() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of() {
        return new MyCustomerAddBillingAddressIdActionBuilder();
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
