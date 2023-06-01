package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddShippingRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddShippingRateAction shippingMethodAddShippingRateAction = ShippingMethodAddShippingRateAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodAddShippingRateActionBuilder implements Builder<ShippingMethodAddShippingRateAction> {

    
    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;
    
    
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    
    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder zone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder withZone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @param zone value to be set
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder zone( final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder shippingRate(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder withShippingRate(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @param shippingRate value to be set
     * @return Builder
     */
    
    public ShippingMethodAddShippingRateActionBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }
    
    

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @return zone
     */
    
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }
    
    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @return shippingRate
     */
    
    
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }

    /**
     * builds ShippingMethodAddShippingRateAction with checking for non-null required values
     * @return ShippingMethodAddShippingRateAction
     */
    public ShippingMethodAddShippingRateAction build() {
        Objects.requireNonNull(zone, ShippingMethodAddShippingRateAction.class + ": zone is missing");
        Objects.requireNonNull(shippingRate, ShippingMethodAddShippingRateAction.class + ": shippingRate is missing");
        return new ShippingMethodAddShippingRateActionImpl(zone, shippingRate);
    }
    
    /**
     * builds ShippingMethodAddShippingRateAction without checking for non-null required values
     * @return ShippingMethodAddShippingRateAction
     */
    public ShippingMethodAddShippingRateAction buildUnchecked() {
        return new ShippingMethodAddShippingRateActionImpl(zone, shippingRate);
    }

    /**
     * factory method for an instance of ShippingMethodAddShippingRateActionBuilder
     * @return builder 
     */
    public static ShippingMethodAddShippingRateActionBuilder of() {
        return new ShippingMethodAddShippingRateActionBuilder();
    }

    /**
     * create builder for ShippingMethodAddShippingRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddShippingRateActionBuilder of(final ShippingMethodAddShippingRateAction template) {
        ShippingMethodAddShippingRateActionBuilder builder = new ShippingMethodAddShippingRateActionBuilder();
        builder.zone = template.getZone();
        builder.shippingRate = template.getShippingRate();
        return builder;
    }

}
