
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLineItemTotalPriceActionBuilder {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    public StagedOrderSetLineItemTotalPriceActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public StagedOrderSetLineItemTotalPriceAction build() {
        return new StagedOrderSetLineItemTotalPriceActionImpl(lineItemId, externalTotalPrice);
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder of() {
        return new StagedOrderSetLineItemTotalPriceActionBuilder();
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder of(
            final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionBuilder builder = new StagedOrderSetLineItemTotalPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
