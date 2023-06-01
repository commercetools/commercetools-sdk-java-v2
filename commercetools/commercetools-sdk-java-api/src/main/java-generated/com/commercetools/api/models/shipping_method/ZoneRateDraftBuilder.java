package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ZoneRateDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRateDraft zoneRateDraft = ZoneRateDraft.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .plusShippingRates(shippingRatesBuilder -> shippingRatesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneRateDraftBuilder implements Builder<ZoneRateDraft> {

    
    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;
    
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates;

    
    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder zone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     * @param builder function to build the zone value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder withZone(Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     * @param zone value to be set
     * @return Builder
     */
    
    public ZoneRateDraftBuilder zone( final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }
    
    
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param shippingRates value to be set
     * @return Builder
     */
    
    public ZoneRateDraftBuilder shippingRates( final com.commercetools.api.models.shipping_method.ShippingRateDraft ...shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
        return this;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param shippingRates value to be set
     * @return Builder
     */
    
    public ZoneRateDraftBuilder shippingRates( final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.shippingRates = shippingRates;
        return this;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param shippingRates value to be set
     * @return Builder
     */
    
    public ZoneRateDraftBuilder plusShippingRates( final com.commercetools.api.models.shipping_method.ShippingRateDraft ...shippingRates) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates.addAll(Arrays.asList(shippingRates));
        return this;
    }
    
    
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param builder function to build the shippingRates value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder plusShippingRates(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param builder function to build the shippingRates value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder withShippingRates(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRates = new ArrayList<>();
        this.shippingRates.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param builder function to build the shippingRates value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder addShippingRates(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        return plusShippingRates(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()));
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @param builder function to build the shippingRates value
     * @return Builder
     */
    
    public ZoneRateDraftBuilder setShippingRates(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        return shippingRates(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()));
    }
                    

    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     * @return zone
     */
    
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     * @return shippingRates
     */
    
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> getShippingRates(){
        return this.shippingRates;
    }

    /**
     * builds ZoneRateDraft with checking for non-null required values
     * @return ZoneRateDraft
     */
    public ZoneRateDraft build() {
        Objects.requireNonNull(zone, ZoneRateDraft.class + ": zone is missing");
        Objects.requireNonNull(shippingRates, ZoneRateDraft.class + ": shippingRates is missing");
        return new ZoneRateDraftImpl(zone, shippingRates);
    }
    
    /**
     * builds ZoneRateDraft without checking for non-null required values
     * @return ZoneRateDraft
     */
    public ZoneRateDraft buildUnchecked() {
        return new ZoneRateDraftImpl(zone, shippingRates);
    }

    /**
     * factory method for an instance of ZoneRateDraftBuilder
     * @return builder 
     */
    public static ZoneRateDraftBuilder of() {
        return new ZoneRateDraftBuilder();
    }

    /**
     * create builder for ZoneRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneRateDraftBuilder of(final ZoneRateDraft template) {
        ZoneRateDraftBuilder builder = new ZoneRateDraftBuilder();
        builder.zone = template.getZone();
        builder.shippingRates = template.getShippingRates();
        return builder;
    }

}
