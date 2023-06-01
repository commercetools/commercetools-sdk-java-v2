package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveZoneActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveZoneAction shippingMethodRemoveZoneAction = ShippingMethodRemoveZoneAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodRemoveZoneActionBuilder implements Builder<ShippingMethodRemoveZoneAction> {

    
    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    
    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ShippingMethodRemoveZoneActionBuilder zone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ShippingMethodRemoveZoneActionBuilder withZone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @param zone value to be set
     * @return Builder
     */
    
    public ShippingMethodRemoveZoneActionBuilder zone( final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }
    
    

    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @return zone
     */
    
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }

    /**
     * builds ShippingMethodRemoveZoneAction with checking for non-null required values
     * @return ShippingMethodRemoveZoneAction
     */
    public ShippingMethodRemoveZoneAction build() {
        Objects.requireNonNull(zone, ShippingMethodRemoveZoneAction.class + ": zone is missing");
        return new ShippingMethodRemoveZoneActionImpl(zone);
    }
    
    /**
     * builds ShippingMethodRemoveZoneAction without checking for non-null required values
     * @return ShippingMethodRemoveZoneAction
     */
    public ShippingMethodRemoveZoneAction buildUnchecked() {
        return new ShippingMethodRemoveZoneActionImpl(zone);
    }

    /**
     * factory method for an instance of ShippingMethodRemoveZoneActionBuilder
     * @return builder 
     */
    public static ShippingMethodRemoveZoneActionBuilder of() {
        return new ShippingMethodRemoveZoneActionBuilder();
    }

    /**
     * create builder for ShippingMethodRemoveZoneAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveZoneActionBuilder of(final ShippingMethodRemoveZoneAction template) {
        ShippingMethodRemoveZoneActionBuilder builder = new ShippingMethodRemoveZoneActionBuilder();
        builder.zone = template.getZone();
        return builder;
    }

}
