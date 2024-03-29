
package com.commercetools.graphql.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;

/**
 * GraphQLDataResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDataResponse graphQLResponse = GraphQLDataResponseBuilder.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
public class GraphQLDataResponseBuilder implements Builder<GraphQLDataResponse> {

    @Nullable
    private GraphQLData data;

    @Nullable
    private List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    /**
     * set the value to the data
     * @param data value to be set
     * @return Builder
     */

    public GraphQLDataResponseBuilder data(@Nullable final GraphQLData data) {
        this.data = data;
        return this;
    }

    /**
     * set values to the errors
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLDataResponseBuilder errors(
            @Nullable final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     * set value to the errors
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLDataResponseBuilder errors(
            @Nullable final List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * add values to the errors
     * @param errors value to be set
     * @return Builder
     */

    public GraphQLDataResponseBuilder plusErrors(
            @Nullable final com.commercetools.api.models.graph_ql.GraphQLError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     * add the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLDataResponseBuilder plusErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLDataResponseBuilder withErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLDataResponseBuilder addErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLError> builder) {
        return plusErrors(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()));
    }

    /**
     * set the value to the errors using the builder function
     * @param builder function to build the errors value
     * @return Builder
     */

    public GraphQLDataResponseBuilder setErrors(
            Function<com.commercetools.api.models.graph_ql.GraphQLErrorBuilder, com.commercetools.api.models.graph_ql.GraphQLError> builder) {
        return errors(builder.apply(com.commercetools.api.models.graph_ql.GraphQLErrorBuilder.of()));
    }

    /**
     * value of data}
     * @return data
     */

    @Nullable
    public GraphQLData getData() {
        return this.data;
    }

    /**
     * value of errors}
     * @return errors
     */

    @Nullable
    public List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors() {
        return this.errors;
    }

    /**
     * builds GraphQLResponse with checking for non-null required values
     * @return GraphQLResponse
     */
    public GraphQLDataResponse build() {
        return new GraphQLDataResponseImpl(data, errors);
    }

    /**
     * builds GraphQLResponse without checking for non-null required values
     * @return GraphQLResponse
     */
    public GraphQLDataResponse buildUnchecked() {
        return new GraphQLDataResponseImpl(data, errors);
    }

    /**
     * factory method for an instance of GraphQLResponseBuilder
     * @return builder
     */
    public static GraphQLDataResponseBuilder of() {
        return new GraphQLDataResponseBuilder();
    }

    /**
     * create builder for GraphQLResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDataResponseBuilder of(final GraphQLDataResponse template) {
        GraphQLDataResponseBuilder builder = new GraphQLDataResponseBuilder();
        builder.data = template.getData();
        builder.errors = template.getErrors();
        return builder;
    }

}
