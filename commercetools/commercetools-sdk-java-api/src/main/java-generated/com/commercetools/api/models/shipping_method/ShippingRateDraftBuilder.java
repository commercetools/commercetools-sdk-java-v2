
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRateDraftBuilder implements Builder<ShippingRateDraft> {

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private com.commercetools.api.models.common.Money freeAbove;

    @Nullable
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    public ShippingRateDraftBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ShippingRateDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ShippingRateDraftBuilder freeAbove(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
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
        Objects.requireNonNull(price, ShippingRateDraft.class + ": price is missing");
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    /**
     * builds ShippingRateDraft without checking for non null required values
     */
    public ShippingRateDraft buildUnchecked() {
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
