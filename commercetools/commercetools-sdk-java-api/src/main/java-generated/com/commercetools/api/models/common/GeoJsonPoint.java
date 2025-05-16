
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * GeoJsonPoint
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeoJsonPoint geoJsonPoint = GeoJsonPoint.builder()
 *             .plusCoordinates(coordinatesBuilder -> coordinatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Point")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeoJsonPointImpl.class)
public interface GeoJsonPoint extends GeoJson {

    /**
     * discriminator value for GeoJsonPoint
     */
    String POINT = "Point";

    /**
     *  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>
     * @return coordinates
     */
    @NotNull
    @JsonProperty("coordinates")
    public List<Double> getCoordinates();

    /**
     *  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>
     * @param coordinates values to be set
     */

    @JsonIgnore
    public void setCoordinates(final Double... coordinates);

    /**
     *  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>
     * @param coordinates values to be set
     */

    public void setCoordinates(final List<Double> coordinates);

    /**
     * factory method
     * @return instance of GeoJsonPoint
     */
    public static GeoJsonPoint of() {
        return new GeoJsonPointImpl();
    }

    /**
     * factory method to create a shallow copy GeoJsonPoint
     * @param template instance to be copied
     * @return copy instance
     */
    public static GeoJsonPoint of(final GeoJsonPoint template) {
        GeoJsonPointImpl instance = new GeoJsonPointImpl();
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

    public GeoJsonPoint copyDeep();

    /**
     * factory method to create a deep copy of GeoJsonPoint
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GeoJsonPoint deepCopy(@Nullable final GeoJsonPoint template) {
        if (template == null) {
            return null;
        }
        GeoJsonPointImpl instance = new GeoJsonPointImpl();
        instance.setCoordinates(Optional.ofNullable(template.getCoordinates()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GeoJsonPoint
     * @return builder
     */
    public static GeoJsonPointBuilder builder() {
        return GeoJsonPointBuilder.of();
    }

    /**
     * create builder for GeoJsonPoint instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeoJsonPointBuilder builder(final GeoJsonPoint template) {
        return GeoJsonPointBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeoJsonPoint(Function<GeoJsonPoint, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeoJsonPoint> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeoJsonPoint>() {
            @Override
            public String toString() {
                return "TypeReference<GeoJsonPoint>";
            }
        };
    }
}
