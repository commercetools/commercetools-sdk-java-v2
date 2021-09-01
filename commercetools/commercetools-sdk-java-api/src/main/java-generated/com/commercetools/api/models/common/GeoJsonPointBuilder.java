
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeoJsonPointBuilder implements Builder<GeoJsonPoint> {

    private java.util.List<Double> coordinates;

    public GeoJsonPointBuilder coordinates(final Double... coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
        return this;
    }

    public GeoJsonPointBuilder coordinates(final java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
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
