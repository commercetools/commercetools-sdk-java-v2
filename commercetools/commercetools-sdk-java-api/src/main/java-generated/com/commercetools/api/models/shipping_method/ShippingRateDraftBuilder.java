
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRateDraftBuilder {

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private com.commercetools.api.models.common.Money freeAbove;

    @Nullable
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    public ShippingRateDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.api.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    public ShippingRateDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    public ShippingRateDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public ShippingRateDraft build() {
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    public static ShippingRateDraftBuilder of() {
        return new ShippingRateDraftBuilder();
    }

    public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
        ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.tiers = template.getTiers();
        return builder;
    }

}
