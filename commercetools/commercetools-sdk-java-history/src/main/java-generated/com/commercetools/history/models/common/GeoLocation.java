
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * GeoLocation
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoLocation geoLocation = GeoLocation.builder()
 *             .plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Point")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeoLocationImpl.class)
public interface GeoLocation extends GeoJson {

    /**
     * discriminator value for GeoLocation
     */
    String POINT = "Point";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return coordinates
     */
    @NotNull
    @JsonProperty("coordinates")
    public List<Integer> getCoordinates();

    /**
     * set coordinates
     * @param coordinates values to be set
     */

    @JsonIgnore
    public void setCoordinates(final Integer... coordinates);

    /**
     * set coordinates
     * @param coordinates values to be set
     */

    public void setCoordinates(final List<Integer> coordinates);

    /**
     * factory method
     * @return instance of GeoLocation
     */
    public static GeoLocation of() {
        return new GeoLocationImpl();
    }

    /**
     * factory method to create a shallow copy GeoLocation
     * @param template instance to be copied
     * @return copy instance
     */
    public static GeoLocation of(final GeoLocation template) {
        GeoLocationImpl instance = new GeoLocationImpl();
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

    public GeoLocation copyDeep();

    /**
     * factory method to create a deep copy of GeoLocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GeoLocation deepCopy(@Nullable final GeoLocation template) {
        if (template == null) {
            return null;
        }
        GeoLocationImpl instance = new GeoLocationImpl();
        instance.setCoordinates(Optional.ofNullable(template.getCoordinates()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GeoLocation
     * @return builder
     */
    public static GeoLocationBuilder builder() {
        return GeoLocationBuilder.of();
    }

    /**
     * create builder for GeoLocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeoLocationBuilder builder(final GeoLocation template) {
        return GeoLocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeoLocation(Function<GeoLocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeoLocation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeoLocation>() {
            @Override
            public String toString() {
                return "TypeReference<GeoLocation>";
            }
        };
    }
}
