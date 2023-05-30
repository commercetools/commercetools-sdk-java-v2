
package com.commercetools.graphql.api;

import java.util.Objects;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.graph_ql.GraphQLVariablesMap;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder;

import io.vrap.rmf.base.client.Builder;

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
public class GraphQLRequestBuilder<T> implements Builder<GraphQLRequest<T>> {

    private String query;

    @Nullable
    private String operationName;

    @Nullable
    private GraphQLVariablesMap variables;

    @Nullable
    private Function<GraphQLData, T> dataMapper;

    /**
     * set the value to the query
     * @param query value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder<T> query(final String query) {
        this.query = query;
        return this;
    }

    /**
     * set the value to the operationName
     * @param operationName value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder<T> operationName(@Nullable final String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * set the value to the variables using the builder function
     * @param builder function to build the variables value
     * @return Builder
     */

    public GraphQLRequestBuilder<T> variables(
            Function<GraphQLVariablesMapBuilder, GraphQLVariablesMapBuilder> builder) {
        this.variables = builder.apply(GraphQLVariablesMapBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the variables using the builder function
     * @param builder function to build the variables value
     * @return Builder
     */

    public GraphQLRequestBuilder<T> withVariables(Function<GraphQLVariablesMapBuilder, GraphQLVariablesMap> builder) {
        this.variables = builder.apply(GraphQLVariablesMapBuilder.of());
        return this;
    }

    /**
     * set the value to the variables
     * @param variables value to be set
     * @return Builder
     */

    public GraphQLRequestBuilder<T> variables(@Nullable final GraphQLVariablesMap variables) {
        this.variables = variables;
        return this;
    }

    public GraphQLRequestBuilder<T> dataMapper(Function<GraphQLData, T> dataMapper) {
        this.dataMapper = dataMapper;
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
    public GraphQLVariablesMap getVariables() {
        return this.variables;
    }

    @Nullable
    public Function<GraphQLData, T> getDataMapper() {
        return dataMapper;
    }

    /**
     * builds GraphQLRequest with checking for non-null required values
     * @return GraphQLRequest
     */
    public GraphQLRequest<T> build() {
        Objects.requireNonNull(query, GraphQLRequest.class + ": query is missing");
        return new GraphQLRequestImpl<T>(query, operationName, variables, dataMapper);
    }

    /**
     * builds GraphQLRequest without checking for non-null required values
     * @return GraphQLRequest
     */
    public com.commercetools.api.models.graph_ql.GraphQLRequest buildUnchecked() {
        return new GraphQLRequestImpl<T>(query, operationName, variables, dataMapper);
    }

    /**
     * factory method for an instance of GraphQLRequestBuilder
     * @return builder
     */
    public static <T> GraphQLRequestBuilder<T> of() {
        return new GraphQLRequestBuilder<T>();
    }

    /**
     * create builder for GraphQLRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static <T> GraphQLRequestBuilder<T> of(final GraphQLRequest<T> template) {
        GraphQLRequestBuilder<T> builder = new GraphQLRequestBuilder<T>();
        builder.query = template.getQuery();
        builder.operationName = template.getOperationName();
        builder.variables = template.getVariables();
        builder.dataMapper = template.getDataMapper();
        return builder;
    }

}
