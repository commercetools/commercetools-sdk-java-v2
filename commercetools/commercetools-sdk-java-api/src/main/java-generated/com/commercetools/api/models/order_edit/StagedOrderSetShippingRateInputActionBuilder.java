
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingRateInputActionBuilder {

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    public StagedOrderSetShippingRateInputActionBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    public StagedOrderSetShippingRateInputAction build() {
        return new StagedOrderSetShippingRateInputActionImpl(shippingRateInput);
    }

    public static StagedOrderSetShippingRateInputActionBuilder of() {
        return new StagedOrderSetShippingRateInputActionBuilder();
    }

    public static StagedOrderSetShippingRateInputActionBuilder of(
            final StagedOrderSetShippingRateInputAction template) {
        StagedOrderSetShippingRateInputActionBuilder builder = new StagedOrderSetShippingRateInputActionBuilder();
        builder.shippingRateInput = template.getShippingRateInput();
        return builder;
    }

}
