
package com.commercetools.api.models.graph_ql;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLRequestBuilder {

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
