
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRateBuilder implements Builder<ShippingRate> {

    private com.commercetools.history.models.common.Money price;

    private com.commercetools.history.models.common.Money freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers;

    public ShippingRateBuilder price(final com.commercetools.history.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ShippingRateBuilder freeAbove(final com.commercetools.history.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    public ShippingRateBuilder isMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    public ShippingRateBuilder tiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    public ShippingRateBuilder tiers(
            final java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    public com.commercetools.history.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.history.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public ShippingRate build() {
        Objects.requireNonNull(price);
        Objects.requireNonNull(freeAbove);
        Objects.requireNonNull(isMatching);
        Objects.requireNonNull(tiers);
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * builds ShippingRate without checking for non null required values
     */
    public ShippingRate buildUnchecked() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
