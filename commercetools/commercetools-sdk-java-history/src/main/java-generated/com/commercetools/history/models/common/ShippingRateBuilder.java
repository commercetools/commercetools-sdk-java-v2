
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateBuilder implements Builder<ShippingRate> {

    private com.commercetools.history.models.common.Money price;

    private com.commercetools.history.models.common.Money freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers;

    public ShippingRateBuilder price(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ShippingRateBuilder price(final com.commercetools.history.models.common.Money price) {
        this.price = price;
        return this;
    }

    public ShippingRateBuilder freeAbove(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
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

    public ShippingRateBuilder plusTiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    public ShippingRateBuilder plusTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, com.commercetools.history.models.common.ShippingRatePriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    public ShippingRateBuilder withTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, com.commercetools.history.models.common.ShippingRatePriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
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
        Objects.requireNonNull(price, ShippingRate.class + ": price is missing");
        Objects.requireNonNull(freeAbove, ShippingRate.class + ": freeAbove is missing");
        Objects.requireNonNull(isMatching, ShippingRate.class + ": isMatching is missing");
        Objects.requireNonNull(tiers, ShippingRate.class + ": tiers is missing");
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
