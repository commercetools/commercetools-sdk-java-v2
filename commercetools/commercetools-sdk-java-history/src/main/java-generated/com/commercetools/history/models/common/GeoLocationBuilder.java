package com.commercetools.history.models.common;


import com.commercetools.history.models.common.GeoLocation;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeoLocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoLocation geoLocation = GeoLocation.builder()
 *             .type("{type}")
 *             .plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeoLocationBuilder implements Builder<GeoLocation> {

    
    
    private String type;
    
    
    
    private java.util.List<Integer> coordinates;

    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public GeoLocationBuilder type( final String type) {
        this.type = type;
        return this;
    }
    
    
    
    /**
     * set values to the coordinates
     * @param coordinates value to be set
     * @return Builder
     */
    
    public GeoLocationBuilder coordinates( final Integer ...coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
        return this;
    }
    
    /**
     * set value to the coordinates
     * @param coordinates value to be set
     * @return Builder
     */
    
    public GeoLocationBuilder coordinates( final java.util.List<Integer> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
    
    /**
     * add values to the coordinates
     * @param coordinates value to be set
     * @return Builder
     */
    
    public GeoLocationBuilder plusCoordinates( final Integer ...coordinates) {
        if (this.coordinates == null) {
            this.coordinates = new ArrayList<>();
        }
        this.coordinates.addAll(Arrays.asList(coordinates));
        return this;
    }
    
    
    

    /**
     * value of type}
     * @return type
     */
    
    
    public String getType(){
        return this.type;
    }
    
    /**
     * value of coordinates}
     * @return coordinates
     */
    
    
    public java.util.List<Integer> getCoordinates(){
        return this.coordinates;
    }

    /**
     * builds GeoLocation with checking for non-null required values
     * @return GeoLocation
     */
    public GeoLocation build() {
        Objects.requireNonNull(type, GeoLocation.class + ": type is missing");
        Objects.requireNonNull(coordinates, GeoLocation.class + ": coordinates is missing");
        return new GeoLocationImpl(type, coordinates);
    }
    
    /**
     * builds GeoLocation without checking for non-null required values
     * @return GeoLocation
     */
    public GeoLocation buildUnchecked() {
        return new GeoLocationImpl(type, coordinates);
    }

    /**
     * factory method for an instance of GeoLocationBuilder
     * @return builder 
     */
    public static GeoLocationBuilder of() {
        return new GeoLocationBuilder();
    }

    /**
     * create builder for GeoLocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeoLocationBuilder of(final GeoLocation template) {
        GeoLocationBuilder builder = new GeoLocationBuilder();
        builder.type = template.getType();
        builder.coordinates = template.getCoordinates();
        return builder;
    }

}
