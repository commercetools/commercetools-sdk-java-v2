
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddressAddedMessagePayloadBuilder {

    private com.commercetools.api.models.common.Address address;

    public CustomerAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerAddressAddedMessagePayload build() {
        return new CustomerAddressAddedMessagePayloadImpl(address);
    }

    public static CustomerAddressAddedMessagePayloadBuilder of() {
        return new CustomerAddressAddedMessagePayloadBuilder();
    }

    public static CustomerAddressAddedMessagePayloadBuilder of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadBuilder builder = new CustomerAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
