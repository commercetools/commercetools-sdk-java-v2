
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddressRemovedMessagePayloadBuilder
        implements Builder<CustomerAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    public CustomerAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public CustomerAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, CustomerAddressRemovedMessagePayload.class + ": address is missing");
        return new CustomerAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds CustomerAddressRemovedMessagePayload without checking for non null required values
     */
    public CustomerAddressRemovedMessagePayload buildUnchecked() {
        return new CustomerAddressRemovedMessagePayloadImpl(address);
    }

    public static CustomerAddressRemovedMessagePayloadBuilder of() {
        return new CustomerAddressRemovedMessagePayloadBuilder();
    }

    public static CustomerAddressRemovedMessagePayloadBuilder of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadBuilder builder = new CustomerAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
