
package com.commercetools.api.models.graph_ql;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLRequestBuilder implements Builder<GraphQLRequest> {

    private String query;

    @Nullable
    private String operationName;

    @Nullable
    private com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables;

    public GraphQLRequestBuilder query(final String query) {
        this.query = query;
        return this;
    }

    public GraphQLRequestBuilder operationName(@Nullable final String operationName) {
        this.operationName = operationName;
        return this;
    }

    public GraphQLRequestBuilder variables(
            Function<com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder, com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder> builder) {
        this.variables = builder.apply(com.commercetools.api.models.graph_ql.GraphQLVariablesMapBuilder.of()).build();
        return this;
    }

    public GraphQLRequestBuilder variables(
            @Nullable final com.commercetools.api.models.graph_ql.GraphQLVariablesMap variables) {
        this.variables = variables;
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    @Nullable
    public String getOperationName() {
        return this.operationName;
    }

    @Nullable
    public com.commercetools.api.models.graph_ql.GraphQLVariablesMap getVariables() {
        return this.variables;
    }

    public GraphQLRequest build() {
        Objects.requireNonNull(query, GraphQLRequest.class + ": query is missing");
        return new GraphQLRequestImpl(query, operationName, variables);
    }

    /**
     * builds GraphQLRequest without checking for non null required values
     */
    public GraphQLRequest buildUnchecked() {
        return new GraphQLRequestImpl(query, operationName, variables);
    }

    public static GraphQLRequestBuilder of() {
        return new GraphQLRequestBuilder();
    }

    public static GraphQLRequestBuilder of(final GraphQLRequest template) {
        GraphQLRequestBuilder builder = new GraphQLRequestBuilder();
        builder.query = template.getQuery();
        builder.operationName = template.getOperationName();
        builder.variables = template.getVariables();
        return builder;
    }

}
