
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetShippingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public MyCartSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public MyCartSetShippingAddressAction build() {
        return new MyCartSetShippingAddressActionImpl(address);
    }

    public static MyCartSetShippingAddressActionBuilder of() {
        return new MyCartSetShippingAddressActionBuilder();
    }

    public static MyCartSetShippingAddressActionBuilder of(final MyCartSetShippingAddressAction template) {
        MyCartSetShippingAddressActionBuilder builder = new MyCartSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
