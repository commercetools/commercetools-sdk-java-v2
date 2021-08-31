
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddAddressActionBuilder implements Builder<CustomerAddAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public CustomerAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public CustomerAddAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CustomerAddAddressAction build() {
        Objects.requireNonNull(address, CustomerAddAddressAction.class + ": address is missing");
        return new CustomerAddAddressActionImpl(address);
    }

    /**
     * builds CustomerAddAddressAction without checking for non null required values
     */
    public CustomerAddAddressAction buildUnchecked() {
        return new CustomerAddAddressActionImpl(address);
    }

    public static CustomerAddAddressActionBuilder of() {
        return new CustomerAddAddressActionBuilder();
    }

    public static CustomerAddAddressActionBuilder of(final CustomerAddAddressAction template) {
        CustomerAddAddressActionBuilder builder = new CustomerAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
