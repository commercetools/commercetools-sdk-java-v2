
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetBillingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public MyCartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public MyCartSetBillingAddressAction build() {
        return new MyCartSetBillingAddressActionImpl(address);
    }

    public static MyCartSetBillingAddressActionBuilder of() {
        return new MyCartSetBillingAddressActionBuilder();
    }

    public static MyCartSetBillingAddressActionBuilder of(final MyCartSetBillingAddressAction template) {
        MyCartSetBillingAddressActionBuilder builder = new MyCartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
