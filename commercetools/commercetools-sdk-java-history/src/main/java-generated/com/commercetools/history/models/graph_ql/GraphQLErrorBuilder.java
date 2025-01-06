
package com.commercetools.history.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLError graphQLError = GraphQLError.builder()
 *             .message("{message}")
 *             .plusLocations(locationsBuilder -> locationsBuilder)
 *             .extensions(extensionsBuilder -> extensionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorBuilder implements Builder<GraphQLError> {

    private String message;

    private java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> locations;

    @Nullable
    private java.util.List<java.lang.Object> path;

    private com.commercetools.history.models.error.GraphQLErrorObject extensions;

    /**
     *  <p>Detailed description of the error explaining the root cause of the problem and suggesting how to correct the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param locations value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder locations(
            final com.commercetools.history.models.graph_ql.GraphQLErrorLocation... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param locations value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder locations(
            final java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param locations value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder plusLocations(
            final com.commercetools.history.models.graph_ql.GraphQLErrorLocation... locations) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.addAll(Arrays.asList(locations));
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param builder function to build the locations value
     * @return Builder
     */

    public GraphQLErrorBuilder plusLocations(
            Function<com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations
                .add(builder.apply(com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param builder function to build the locations value
     * @return Builder
     */

    public GraphQLErrorBuilder withLocations(
            Function<com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder> builder) {
        this.locations = new ArrayList<>();
        this.locations
                .add(builder.apply(com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param builder function to build the locations value
     * @return Builder
     */

    public GraphQLErrorBuilder addLocations(
            Function<com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.history.models.graph_ql.GraphQLErrorLocation> builder) {
        return plusLocations(builder.apply(com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder.of()));
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @param builder function to build the locations value
     * @return Builder
     */

    public GraphQLErrorBuilder setLocations(
            Function<com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder, com.commercetools.history.models.graph_ql.GraphQLErrorLocation> builder) {
        return locations(builder.apply(com.commercetools.history.models.graph_ql.GraphQLErrorLocationBuilder.of()));
    }

    /**
     *  <p>Query fields listed in order from the root of the query response up to the field in which the error occurred. <code>path</code> is displayed in the response only if an error is associated with a particular field in the query result.</p>
     * @param path value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder path(@Nullable final java.lang.Object... path) {
        this.path = new ArrayList<>(Arrays.asList(path));
        return this;
    }

    /**
     *  <p>Query fields listed in order from the root of the query response up to the field in which the error occurred. <code>path</code> is displayed in the response only if an error is associated with a particular field in the query result.</p>
     * @param path value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder path(@Nullable final java.util.List<java.lang.Object> path) {
        this.path = path;
        return this;
    }

    /**
     *  <p>Query fields listed in order from the root of the query response up to the field in which the error occurred. <code>path</code> is displayed in the response only if an error is associated with a particular field in the query result.</p>
     * @param path value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder plusPath(@Nullable final java.lang.Object... path) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.addAll(Arrays.asList(path));
        return this;
    }

    /**
     *  <p>Dictionary with additional information where applicable.</p>
     * @param extensions value to be set
     * @return Builder
     */

    public GraphQLErrorBuilder extensions(final com.commercetools.history.models.error.GraphQLErrorObject extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     *  <p>Dictionary with additional information where applicable.</p>
     * @param builder function to build the extensions value
     * @return Builder
     */

    public GraphQLErrorBuilder extensions(
            Function<com.commercetools.history.models.error.GraphQLErrorObjectBuilder, Builder<? extends com.commercetools.history.models.error.GraphQLErrorObject>> builder) {
        this.extensions = builder.apply(com.commercetools.history.models.error.GraphQLErrorObjectBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Detailed description of the error explaining the root cause of the problem and suggesting how to correct the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     * @return locations
     */

    public java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> getLocations() {
        return this.locations;
    }

    /**
     *  <p>Query fields listed in order from the root of the query response up to the field in which the error occurred. <code>path</code> is displayed in the response only if an error is associated with a particular field in the query result.</p>
     * @return path
     */

    @Nullable
    public java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    /**
     *  <p>Dictionary with additional information where applicable.</p>
     * @return extensions
     */

    public com.commercetools.history.models.error.GraphQLErrorObject getExtensions() {
        return this.extensions;
    }

    /**
     * builds GraphQLError with checking for non-null required values
     * @return GraphQLError
     */
    public GraphQLError build() {
        Objects.requireNonNull(message, GraphQLError.class + ": message is missing");
        Objects.requireNonNull(locations, GraphQLError.class + ": locations is missing");
        Objects.requireNonNull(extensions, GraphQLError.class + ": extensions is missing");
        return new GraphQLErrorImpl(message, locations, path, extensions);
    }

    /**
     * builds GraphQLError without checking for non-null required values
     * @return GraphQLError
     */
    public GraphQLError buildUnchecked() {
        return new GraphQLErrorImpl(message, locations, path, extensions);
    }

    /**
     * factory method for an instance of GraphQLErrorBuilder
     * @return builder
     */
    public static GraphQLErrorBuilder of() {
        return new GraphQLErrorBuilder();
    }

    /**
     * create builder for GraphQLError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLErrorBuilder of(final GraphQLError template) {
        GraphQLErrorBuilder builder = new GraphQLErrorBuilder();
        builder.message = template.getMessage();
        builder.locations = template.getLocations();
        builder.path = template.getPath();
        builder.extensions = template.getExtensions();
        return builder;
    }

}
