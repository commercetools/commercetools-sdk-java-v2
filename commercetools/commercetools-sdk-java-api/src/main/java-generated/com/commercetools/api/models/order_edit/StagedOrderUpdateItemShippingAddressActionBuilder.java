
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderUpdateItemShippingAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public StagedOrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public StagedOrderUpdateItemShippingAddressAction build() {
        return new StagedOrderUpdateItemShippingAddressActionImpl(address);
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder of() {
        return new StagedOrderUpdateItemShippingAddressActionBuilder();
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder of(
            final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionBuilder builder = new StagedOrderUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
