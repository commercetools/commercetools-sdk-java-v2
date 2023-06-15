
package com.commercetools.graphql.api;

import java.util.List;
import java.util.function.Function;

import com.commercetools.api.models.graph_ql.GraphQLError;

public class GraphQLResponse<T> {

    private final GraphQLDataResponse response;

    private final Function<GraphQLData, T> mapper;

    public GraphQLResponse(final GraphQLDataResponse response, final Function<GraphQLData, T> mapper) {
        this.response = response;
        this.mapper = mapper;
    }

    public T getData() {
        return mapper.apply(response.getData());
    }

    public List<GraphQLError> getErrors() {
        return response.getErrors();
    }

    public static <T> GraphQLResponse<T> of(final GraphQLDataResponse response, final GraphQLRequest<T> request) {
        return new GraphQLResponse<>(response, request.getDataMapper());
    }
}
