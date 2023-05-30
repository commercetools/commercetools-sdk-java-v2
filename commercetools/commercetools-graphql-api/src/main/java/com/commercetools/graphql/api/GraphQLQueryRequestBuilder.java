
package com.commercetools.graphql.api;

import java.util.function.Function;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;

public class GraphQLQueryRequestBuilder<TData, T extends BaseProjectionNode> {
    private final GraphQLQuery query;
    private final T projectionRoot;

    private final Function<GraphQLData, TData> dataMapper;

    public GraphQLQueryRequestBuilder(GraphQLQuery query, T projectionRoot, Function<GraphQLData, TData> dataMapper) {
        this.query = query;
        this.projectionRoot = projectionRoot;
        this.dataMapper = dataMapper;
    }

    public GraphQLRequest<TData> projection(Function<T, BaseProjectionNode> projectionFn) {
        return GraphQLRequest.<TData> builder()
                .dataMapper(dataMapper)
                .query(new GraphQLQueryRequest(query, projectionFn.apply(projectionRoot)).serialize())
                .build();
    }
}
