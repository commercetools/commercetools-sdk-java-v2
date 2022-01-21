
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class GeoJsonPointImpl implements GeoJsonPoint, ModelBase {

    private String type;

    private java.util.List<Double> coordinates;

    @JsonCreator
    GeoJsonPointImpl(@JsonProperty("coordinates") final java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
        this.type = POINT;
    }

    public GeoJsonPointImpl() {
        this.type = POINT;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<Double> getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(final Double... coordinates) {
        this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
    }

    public void setCoordinates(final java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GeoJsonPointImpl that = (GeoJsonPointImpl) o;

        return new EqualsBuilder().append(type, that.type).append(coordinates, that.coordinates).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(coordinates).toHashCode();
    }

}
