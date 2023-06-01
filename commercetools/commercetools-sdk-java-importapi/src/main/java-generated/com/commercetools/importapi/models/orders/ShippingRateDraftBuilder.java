package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.ShippingRatePriceTier;
import com.commercetools.importapi.models.orders.ShippingRateDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateDraft shippingRateDraft = ShippingRateDraft.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateDraftBuilder implements Builder<ShippingRateDraft> {

    
    
    private com.commercetools.importapi.models.common.Money price;
    
    
    @Nullable
    private com.commercetools.importapi.models.common.Money freeAbove;
    
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;

    
    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder price(Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder withPrice(Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the price
     * @param price value to be set
     * @return Builder
     */
    
    public ShippingRateDraftBuilder price( final com.commercetools.importapi.models.common.Money price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     * set the value to the freeAbove using the builder function
     * @param builder function to build the freeAbove value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder freeAbove(Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the freeAbove using the builder function
     * @param builder function to build the freeAbove value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder withFreeAbove(Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        this.freeAbove = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the freeAbove
     * @param freeAbove value to be set
     * @return Builder
     */
    
    public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.importapi.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }
    
    
    
    /**
     * set values to the tiers
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateDraftBuilder tiers(@Nullable final com.commercetools.importapi.models.orders.ShippingRatePriceTier ...tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }
    
    /**
     * set value to the tiers
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateDraftBuilder tiers(@Nullable final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }
    
    /**
     * add values to the tiers
     * @param tiers value to be set
     * @return Builder
     */
    
    public ShippingRateDraftBuilder plusTiers(@Nullable final com.commercetools.importapi.models.orders.ShippingRatePriceTier ...tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }
    
    
    /**
     * add a value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder plusTiers(Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */
    
    public ShippingRateDraftBuilder withTiers(Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }
                    
    

    /**
     * value of price}
     * @return price
     */
    
    
    public com.commercetools.importapi.models.common.Money getPrice(){
        return this.price;
    }
    
    /**
     * value of freeAbove}
     * @return freeAbove
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.Money getFreeAbove(){
        return this.freeAbove;
    }
    
    /**
     * value of tiers}
     * @return tiers
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }

    /**
     * builds ShippingRateDraft with checking for non-null required values
     * @return ShippingRateDraft
     */
    public ShippingRateDraft build() {
        Objects.requireNonNull(price, ShippingRateDraft.class + ": price is missing");
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }
    
    /**
     * builds ShippingRateDraft without checking for non-null required values
     * @return ShippingRateDraft
     */
    public ShippingRateDraft buildUnchecked() {
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    /**
     * factory method for an instance of ShippingRateDraftBuilder
     * @return builder 
     */
    public static ShippingRateDraftBuilder of() {
        return new ShippingRateDraftBuilder();
    }

    /**
     * create builder for ShippingRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
        ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.tiers = template.getTiers();
        return builder;
    }

}
