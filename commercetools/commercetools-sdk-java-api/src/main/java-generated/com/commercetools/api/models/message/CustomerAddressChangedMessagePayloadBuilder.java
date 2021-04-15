
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerAddressChangedMessagePayloadBuilder {

    private com.commercetools.api.models.common.Address address;

    public CustomerAddressChangedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CustomerAddressChangedMessagePayload build() {
        return new CustomerAddressChangedMessagePayloadImpl(address);
    }

    public static CustomerAddressChangedMessagePayloadBuilder of() {
        return new CustomerAddressChangedMessagePayloadBuilder();
    }

    public static CustomerAddressChangedMessagePayloadBuilder of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadBuilder builder = new CustomerAddressChangedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
