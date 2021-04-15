
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddItemShippingAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public StagedOrderAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public StagedOrderAddItemShippingAddressAction build() {
        return new StagedOrderAddItemShippingAddressActionImpl(address);
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of() {
        return new StagedOrderAddItemShippingAddressActionBuilder();
    }

    public static StagedOrderAddItemShippingAddressActionBuilder of(
            final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
