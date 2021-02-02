
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerAddAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public MyCustomerAddAddressActionBuilder address(final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public MyCustomerAddAddressAction build() {
        return new MyCustomerAddAddressActionImpl(address);
    }

    public static MyCustomerAddAddressActionBuilder of() {
        return new MyCustomerAddAddressActionBuilder();
    }

    public static MyCustomerAddAddressActionBuilder of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionBuilder builder = new MyCustomerAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
