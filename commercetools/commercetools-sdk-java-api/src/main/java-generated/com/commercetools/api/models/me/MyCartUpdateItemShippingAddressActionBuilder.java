
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartUpdateItemShippingAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public MyCartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public MyCartUpdateItemShippingAddressAction build() {
        return new MyCartUpdateItemShippingAddressActionImpl(address);
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of() {
        return new MyCartUpdateItemShippingAddressActionBuilder();
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of(
            final MyCartUpdateItemShippingAddressAction template) {
        MyCartUpdateItemShippingAddressActionBuilder builder = new MyCartUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
