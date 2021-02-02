
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public StagedOrderSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public StagedOrderSetShippingAddressAction build() {
        return new StagedOrderSetShippingAddressActionImpl(address);
    }

    public static StagedOrderSetShippingAddressActionBuilder of() {
        return new StagedOrderSetShippingAddressActionBuilder();
    }

    public static StagedOrderSetShippingAddressActionBuilder of(final StagedOrderSetShippingAddressAction template) {
        StagedOrderSetShippingAddressActionBuilder builder = new StagedOrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
