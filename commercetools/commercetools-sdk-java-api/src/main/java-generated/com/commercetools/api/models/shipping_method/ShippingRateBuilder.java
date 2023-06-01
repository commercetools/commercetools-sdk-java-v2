package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRate shippingRate = ShippingRate.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateBuilder implements Builder<ShippingRate> {

    
    
    private com.commercetools.api.models.common.TypedMoney price;
    
    
    @Nullable
    private com.commercetools.api.models.common.TypedMoney freeAbove;
    
    
    @Nullable
    private Boolean isMatching;
    
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    
    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder price( final com.commercetools.api.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }
    
    
    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ShippingRateBuilder price(Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param freeAbove value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder freeAbove(@Nullable final com.commercetools.api.models.common.TypedMoney freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }
    
    
    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param builder function to build the freeAbove value
     * @return Builder
     */
    
    public ShippingRateBuilder freeAbove(Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p><code>true</code> if the ShippingRate matches given Cart or Location. Only appears in response to requests for Get ShippingMethods for a Cart or Get ShippingMethods for a Location.</p>
     * @param isMatching value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }
    
    
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder tiers( final com.commercetools.api.models.shipping_method.ShippingRatePriceTier ...tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder tiers( final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateBuilder plusTiers( final com.commercetools.api.models.shipping_method.ShippingRatePriceTier ...tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }
    
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public ShippingRateBuilder plusTiers(Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public ShippingRateBuilder withTiers(Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @return price
     */
    
    
    public com.commercetools.api.models.common.TypedMoney getPrice(){
        return this.price;
    }
    
    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @return freeAbove
     */
    
    @Nullable
    public com.commercetools.api.models.common.TypedMoney getFreeAbove(){
        return this.freeAbove;
    }
    
    /**
     *  <p><code>true</code> if the ShippingRate matches given Cart or Location. Only appears in response to requests for Get ShippingMethods for a Cart or Get ShippingMethods for a Location.</p>
     * @return isMatching
     */
    
    @Nullable
    public Boolean getIsMatching(){
        return this.isMatching;
    }
    
    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @return tiers
     */
    
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }

    /**
     * builds ShippingRate with checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate build() {
        Objects.requireNonNull(price, ShippingRate.class + ": price is missing");
        Objects.requireNonNull(tiers, ShippingRate.class + ": tiers is missing");
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }
    
    /**
     * builds ShippingRate without checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate buildUnchecked() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * factory method for an instance of ShippingRateBuilder
     * @return builder 
     */
    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    /**
     * create builder for ShippingRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
