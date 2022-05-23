
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeoJsonPointBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeoJsonPointBuilder implements Builder<GeoJsonPoint> {

    private java.util.List<Double> coordinates;

    /**
     <*  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>>
     */

    public GeoJsonPointBuilder coordinates(final Double... coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
        return this;
    }

    /**
     <*  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>>
     */

    public GeoJsonPointBuilder coordinates(final java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     <*  <p>Longitude (stored on index <code>[0]</code>) and latitude (stored on index <code>[1]</code>) of the Point.</p>>
     */

    public GeoJsonPointBuilder plusCoordinates(final Double... coordinates) {
        if (this.coordinates == null) {
            this.coordinates = new ArrayList<>();
        }
        this.coordinates.addAll(Arrays.asList(coordinates));
        return this;
    }

    public java.util.List<Double> getCoordinates() {
        return this.coordinates;
    }

    public GeoJsonPoint build() {
        Objects.requireNonNull(coordinates, GeoJsonPoint.class + ": coordinates is missing");
        return new GeoJsonPointImpl(coordinates);
    }

    /**
     * builds GeoJsonPoint without checking for non null required values
     */
    public GeoJsonPoint buildUnchecked() {
        return new GeoJsonPointImpl(coordinates);
    }

    public static GeoJsonPointBuilder of() {
        return new GeoJsonPointBuilder();
    }

    public static GeoJsonPointBuilder of(final GeoJsonPoint template) {
        GeoJsonPointBuilder builder = new GeoJsonPointBuilder();
        builder.coordinates = template.getCoordinates();
        return builder;
    }

}
