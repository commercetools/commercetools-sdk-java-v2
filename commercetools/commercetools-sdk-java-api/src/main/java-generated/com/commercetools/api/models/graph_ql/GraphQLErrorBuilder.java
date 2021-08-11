
package com.commercetools.api.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLErrorBuilder implements Builder<GraphQLError> {

    private String message;

    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations;

    private java.util.List<java.lang.Object> path;

    public GraphQLErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public GraphQLErrorBuilder locations(
            final com.commercetools.api.models.graph_ql.GraphQLErrorLocation... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }

    public GraphQLErrorBuilder withLocations(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        this.locations = new ArrayList<>();
        this.locations
                .add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    public GraphQLErrorBuilder plusLocations(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations
                .add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    public GraphQLErrorBuilder locations(
            final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
        return this;
    }

    public GraphQLErrorBuilder path(final java.lang.Object... path) {
        this.path = new ArrayList<>(Arrays.asList(path));
        return this;
    }

    public GraphQLErrorBuilder path(final java.util.List<java.lang.Object> path) {
        this.path = path;
        return this;
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

    public GraphQLError build() {
        Objects.requireNonNull(message, GraphQLError.class + ": message is missing");
        Objects.requireNonNull(locations, GraphQLError.class + ": locations is missing");
        Objects.requireNonNull(path, GraphQLError.class + ": path is missing");
        return new GraphQLErrorImpl(message, locations, path);
    }

    /**
     * builds GraphQLError without checking for non null required values
     */
    public GraphQLError buildUnchecked() {
        return new GraphQLErrorImpl(message, locations, path);
    }

    public static GraphQLErrorBuilder of() {
        return new GraphQLErrorBuilder();
    }

    public static GraphQLErrorBuilder of(final GraphQLError template) {
        GraphQLErrorBuilder builder = new GraphQLErrorBuilder();
        builder.message = template.getMessage();
        builder.locations = template.getLocations();
        builder.path = template.getPath();
        return builder;
    }

}
