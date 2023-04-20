
package com.commercetools.api.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRequest graphQLRequest = GraphQLRequest.builder()
 *             .query("{query}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLRequestBuilder implements Builder<GraphQLRequest> {

    private String query;

    @Nullable
    private String operationName;

    @Nullable
    private com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables;

    /**
     * set the value to the query
     * @param query value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder query(final String query) {
        this.query = query;
        return this;
    }

    /**
     * set the value to the operationName
     * @param operationName value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder operationName(@Nullable final String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * set the value to the variables using the builder function
     * @param builder function to build the variables value
     * @return Builder
     */

    public GraphQLRequestBuilder variables(
            Function<com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder, com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder> builder) {
        this.variables = builder.apply(com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the variables using the builder function
     * @param builder function to build the variables value
     * @return Builder
     */

    public GraphQLRequestBuilder withVariables(
            Function<com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder, com.commercetools.api.models.graph_ql.GraphQLVariablesMap> builder) {
        this.variables = builder.apply(com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder.of());
        return this;
    }

    /**
     * set the value to the variables
     * @param variables value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder variables(
            @Nullable final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.variables = variables;
        return this;
    }

    /**
     * value of query}
     * @return query
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * value of operationName}
     * @return operationName
     */

    @Nullable
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * value of variables}
     * @return variables
     */

    @Nullable
    public com.commercetools.api.models.graph_ql.GraphQLVariablesMap getVariables() {
        return this.variables;
    }

    /**
     * builds GraphQLRequest with checking for non-null required values
     * @return GraphQLRequest
     */
    public GraphQLRequest build() {
        Objects.requireNonNull(query, GraphQLRequest.class + ": query is missing");
        return new GraphQLRequestImpl(query, operationName, variables);
    }

    /**
     * builds GraphQLRequest without checking for non-null required values
     * @return GraphQLRequest
     */
    public GraphQLRequest buildUnchecked() {
        return new GraphQLRequestImpl(query, operationName, variables);
    }

    /**
     * factory method for an instance of GraphQLRequestBuilder
     * @return builder
     */
    public static GraphQLRequestBuilder of() {
        return new GraphQLRequestBuilder();
    }

    /**
     * create builder for GraphQLRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRequestBuilder of(final GraphQLRequest template) {
        GraphQLRequestBuilder builder = new GraphQLRequestBuilder();
        builder.query = template.getQuery();
        builder.operationName = template.getOperationName();
        builder.variables = template.getVariables();
        return builder;
    }

}
