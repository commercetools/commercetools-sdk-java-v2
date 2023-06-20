
package com.commercetools.graphql.api;

import java.util.function.Function;

import com.commercetools.api.client.ProjectRequestBuilder;

import io.vrap.rmf.base.client.ApiHttpClient;

public interface GraphQLRequest<T> extends com.commercetools.api.models.graph_ql.GraphQLRequest,
        ProjectRequestBuilder<ByProjectKeyGraphqlQuery<T>> {
    Function<GraphQLData, T> getDataMapper();

    void setDataMapper(Function<GraphQLData, T> dataMapper);

    @Override
    default ByProjectKeyGraphqlQuery<T> build(ApiHttpClient client, String projectKey) {
        return new ByProjectKeyGraphqlQuery<>(client, projectKey, this);
    }

    /**
     * builder factory method for GraphQLRequest
     * @return builder
     */
    public static <T> GraphQLRequestBuilder<T> builder() {
        return GraphQLRequestBuilder.of();
    }
}
