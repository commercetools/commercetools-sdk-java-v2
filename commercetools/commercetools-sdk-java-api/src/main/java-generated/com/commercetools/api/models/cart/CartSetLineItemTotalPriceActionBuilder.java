
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemTotalPriceActionBuilder implements Builder<CartSetLineItemTotalPriceAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    public CartSetLineItemTotalPriceActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemTotalPriceActionBuilder externalTotalPrice(
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

    public CartSetLineItemTotalPriceAction build() {
        Objects.requireNonNull(lineItemId);
        return new CartSetLineItemTotalPriceActionImpl(lineItemId, externalTotalPrice);
    }

    /**
     * builds CartSetLineItemTotalPriceAction without checking for non null required values
     */
    public CartSetLineItemTotalPriceAction buildUnchecked() {
        return new CartSetLineItemTotalPriceActionImpl(lineItemId, externalTotalPrice);
    }

    public static CartSetLineItemTotalPriceActionBuilder of() {
        return new CartSetLineItemTotalPriceActionBuilder();
    }

    public static CartSetLineItemTotalPriceActionBuilder of(final CartSetLineItemTotalPriceAction template) {
        CartSetLineItemTotalPriceActionBuilder builder = new CartSetLineItemTotalPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
