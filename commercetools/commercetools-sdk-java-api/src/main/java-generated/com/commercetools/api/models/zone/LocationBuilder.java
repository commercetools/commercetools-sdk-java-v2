package com.commercetools.api.models.zone;


import com.commercetools.api.models.zone.Location;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Location location = Location.builder()
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocationBuilder implements Builder<Location> {

    
    
    private String country;
    
    
    @Nullable
    private String state;

    
    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public LocationBuilder country( final String country) {
        this.country = country;
        return this;
    }
    
    
    
    
    /**
     *  <p>State within the country.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public LocationBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }
    
    

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */
    
    
    public String getCountry(){
        return this.country;
    }
    
    /**
     *  <p>State within the country.</p>
     * @return state
     */
    
    @Nullable
    public String getState(){
        return this.state;
    }

    /**
     * builds Location with checking for non-null required values
     * @return Location
     */
    public Location build() {
        Objects.requireNonNull(country, Location.class + ": country is missing");
        return new LocationImpl(country, state);
    }
    
    /**
     * builds Location without checking for non-null required values
     * @return Location
     */
    public Location buildUnchecked() {
        return new LocationImpl(country, state);
    }

    /**
     * factory method for an instance of LocationBuilder
     * @return builder 
     */
    public static LocationBuilder of() {
        return new LocationBuilder();
    }

    /**
     * create builder for Location instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocationBuilder of(final Location template) {
        LocationBuilder builder = new LocationBuilder();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
