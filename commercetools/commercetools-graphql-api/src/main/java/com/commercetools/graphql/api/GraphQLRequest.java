
package com.commercetools.graphql.api;

import java.util.function.Function;

import javax.annotation.Nullable;

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

    /**
     * factory method to create a deep copy of GraphQLRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static <T> GraphQLRequest<T> deepCopy(@Nullable final GraphQLRequest<T> template) {
        if (template == null) {
            return null;
        }
        GraphQLRequestImpl<T> instance = new GraphQLRequestImpl<>();
        instance.setQuery(template.getQuery());
        instance.setOperationName(template.getOperationName());
        instance.setVariables(
            com.commercetools.api.models.graph_ql.GraphQLVariablesMap.deepCopy(template.getVariables()));
        instance.setDataMapper(template.getDataMapper());
        return instance;
    }
}
