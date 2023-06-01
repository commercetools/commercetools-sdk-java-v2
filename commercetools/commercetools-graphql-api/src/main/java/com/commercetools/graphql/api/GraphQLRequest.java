
package com.commercetools.graphql.api;

import java.util.function.Function;

public interface GraphQLRequest<T> extends com.commercetools.api.models.graph_ql.GraphQLRequest {
    Function<GraphQLData, T> getDataMapper();

    void setDataMapper(Function<GraphQLData, T> dataMapper);

    /**
     * builder factory method for GraphQLRequest
     * @return builder
     */
    public static <T> GraphQLRequestBuilder<T> builder() {
        return GraphQLRequestBuilder.of();
    }

}
