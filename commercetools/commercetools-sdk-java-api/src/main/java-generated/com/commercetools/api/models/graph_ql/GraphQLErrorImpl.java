
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLErrorImpl implements GraphQLError {

    private String message;

    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations;

    private java.util.List<java.lang.Object> path;

    @JsonCreator
    GraphQLErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("locations") final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations,
            @JsonProperty("path") final java.util.List<java.lang.Object> path) {
        this.message = message;
        this.locations = locations;
        this.path = path;
    }

    public GraphQLErrorImpl() {
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> getLocations() {
        return this.locations;
    }

    public java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setLocations(final com.commercetools.api.models.graph_ql.GraphQLErrorLocation... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
    }

    public void setLocations(
            final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
    }

    public void setPath(final java.lang.Object... path) {
        this.path = new ArrayList<>(Arrays.asList(path));
    }

    public void setPath(final java.util.List<java.lang.Object> path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLErrorImpl that = (GraphQLErrorImpl) o;

        return new EqualsBuilder().append(message, that.message).append(locations, that.locations).append(path,
            that.path).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(message).append(locations).append(path).toHashCode();
    }

}
