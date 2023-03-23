
package com.commercetools.history.models.common;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeoLocationBuilder implements Builder<GeoLocation> {

    private String type;

    private java.util.List<Integer> coordinates;

    /**
     *
     * @param type
     * @return Builder
     */

    public GeoLocationBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param coordinates
     * @return Builder
     */

    public GeoLocationBuilder coordinates(final Integer... coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
        return this;
    }

    /**
     *
     * @param coordinates
     * @return Builder
     */

    public GeoLocationBuilder coordinates(final java.util.List<Integer> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     *
     * @param coordinates
     * @return Builder
     */

    public GeoLocationBuilder plusCoordinates(final Integer... coordinates) {
        if (this.coordinates == null) {
            this.coordinates = new ArrayList<>();
        }
        this.coordinates.addAll(Arrays.asList(coordinates));
        return this;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<Integer> getCoordinates() {
        return this.coordinates;
    }

    public GeoLocation build() {
        Objects.requireNonNull(type, GeoLocation.class + ": type is missing");
        Objects.requireNonNull(coordinates, GeoLocation.class + ": coordinates is missing");
        return new GeoLocationImpl(type, coordinates);
    }

    /**
     * builds GeoLocation without checking for non null required values
     */
    public GeoLocation buildUnchecked() {
        return new GeoLocationImpl(type, coordinates);
    }

    public static GeoLocationBuilder of() {
        return new GeoLocationBuilder();
    }

    public static GeoLocationBuilder of(final GeoLocation template) {
        GeoLocationBuilder builder = new GeoLocationBuilder();
        builder.type = template.getType();
        builder.coordinates = template.getCoordinates();
        return builder;
    }

}
