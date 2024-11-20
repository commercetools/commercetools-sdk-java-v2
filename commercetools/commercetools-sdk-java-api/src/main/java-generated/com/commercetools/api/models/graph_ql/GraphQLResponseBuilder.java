
package com.commercetools.api.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResponse graphQLResponse = GraphQLResponse.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLResponseBuilder implements Builder<GraphQLResponse> {

    @Nullable
    private java.lang.Object data;

    @Nullable
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    /**
     *  <p>JSON object that contains the results of a GraphQL query.</p>
     * @param data value to be set
     * @return Builder
     */

    public GraphQLResponseBuilder data(@Nullable final java.lang.Object data) {
        this.data = data;
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLResponseBuilder errors(@Nullable final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLResponseBuilder plusErrors(
            @Nullable final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLResponseBuilder plusErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLResponseBuilder withErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLResponseBuilder addErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLError> builder) {
        return plusErrors(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()));
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLResponseBuilder setErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLError> builder) {
        return errors(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()));
    }

    /**
     *  <p>JSON object that contains the results of a GraphQL query.</p>
     * @return data
     */

    @Nullable
    public java.lang.Object getData() {
        return this.data;
    }

    /**
     *  <p>Errors that the GraphQL query returns.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors() {
        return this.errors;
    }

    /**
     * builds GraphQLResponse with checking for non-null required values
     * @return GraphQLResponse
     */
    public GraphQLResponse build() {
        return new GraphQLResponseImpl(data, errors);
    }

    /**
     * builds GraphQLResponse without checking for non-null required values
     * @return GraphQLResponse
     */
    public GraphQLResponse buildUnchecked() {
        return new GraphQLResponseImpl(data, errors);
    }

    /**
     * factory method for an instance of GraphQLResponseBuilder
     * @return builder
     */
    public static GraphQLResponseBuilder of() {
        return new GraphQLResponseBuilder();
    }

    /**
     * create builder for GraphQLResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResponseBuilder of(final GraphQLResponse template) {
        GraphQLResponseBuilder builder = new GraphQLResponseBuilder();
        builder.data = template.getData();
        builder.errors = template.getErrors();
        return builder;
    }

}
