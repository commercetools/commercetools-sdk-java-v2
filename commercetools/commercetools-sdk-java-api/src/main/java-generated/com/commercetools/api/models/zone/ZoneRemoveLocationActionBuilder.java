package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.Location;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneRemoveLocationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRemoveLocationAction zoneRemoveLocationAction = ZoneRemoveLocationAction.builder()
 *             .location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneRemoveLocationActionBuilder implements Builder<ZoneRemoveLocationAction> {

    
    
    private com.commercetools.api.models.zone.Location location;

    
    /**
     *  <p>Location to be removed from the Zone.</p>
     * @param builder function to build the location value
     * @return Builder
     */
    
    public ZoneRemoveLocationActionBuilder location(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.location = builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Location to be removed from the Zone.</p>
     * @param builder function to build the location value
     * @return Builder
     */
    
    public ZoneRemoveLocationActionBuilder withLocation(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.Location> builder) {
        this.location = builder.apply(com.commercetools.api.models.zone.LocationBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Location to be removed from the Zone.</p>
     * @param location value to be set
     * @return Builder
     */
    
    public ZoneRemoveLocationActionBuilder location( final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        return this;
    }
    
    

    /**
     *  <p>Location to be removed from the Zone.</p>
     * @return location
     */
    
    
    public com.commercetools.api.models.zone.Location getLocation(){
        return this.location;
    }

    /**
     * builds ZoneRemoveLocationAction with checking for non-null required values
     * @return ZoneRemoveLocationAction
     */
    public ZoneRemoveLocationAction build() {
        Objects.requireNonNull(location, ZoneRemoveLocationAction.class + ": location is missing");
        return new ZoneRemoveLocationActionImpl(location);
    }
    
    /**
     * builds ZoneRemoveLocationAction without checking for non-null required values
     * @return ZoneRemoveLocationAction
     */
    public ZoneRemoveLocationAction buildUnchecked() {
        return new ZoneRemoveLocationActionImpl(location);
    }

    /**
     * factory method for an instance of ZoneRemoveLocationActionBuilder
     * @return builder 
     */
    public static ZoneRemoveLocationActionBuilder of() {
        return new ZoneRemoveLocationActionBuilder();
    }

    /**
     * create builder for ZoneRemoveLocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneRemoveLocationActionBuilder of(final ZoneRemoveLocationAction template) {
        ZoneRemoveLocationActionBuilder builder = new ZoneRemoveLocationActionBuilder();
        builder.location = template.getLocation();
        return builder;
    }

}
