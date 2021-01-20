
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderRemoveItemShippingAddressActionBuilder {

    private String addressKey;

    public StagedOrderRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public StagedOrderRemoveItemShippingAddressAction build() {
        return new StagedOrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder of() {
        return new StagedOrderRemoveItemShippingAddressActionBuilder();
    }

    public static StagedOrderRemoveItemShippingAddressActionBuilder of(
            final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionBuilder builder = new StagedOrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
