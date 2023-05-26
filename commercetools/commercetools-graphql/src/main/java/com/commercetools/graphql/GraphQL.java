
package com.commercetools.graphql;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.graph_ql.GraphQLRequest;
import com.commercetools.graphql.client.CategoriesGraphQLQuery;
import com.commercetools.graphql.client.CategoriesProjectionRoot;
import com.commercetools.graphql.client.ProductsGraphQLQuery;
import com.commercetools.graphql.client.ProductsProjectionRoot;
import com.commercetools.graphql.types.CategoryQueryResult;
import com.commercetools.graphql.types.ProductQueryResult;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.utils.ClientUtils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class GraphQL {

    private final ProjectApiRoot apiRoot;

    private final Duration timeout;

    public GraphQL(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
        this.timeout = Duration.ofSeconds(10);
    }

    public GraphQL(ProjectApiRoot apiRoot, Duration timeout) {
        this.apiRoot = apiRoot;
        this.timeout = timeout;
    }

    public static GraphQL of(ProjectApiRoot apiRoot) {
        return new GraphQL(apiRoot);
    }

    public <T> CompletableFuture<T> query(GraphQLQueryRequest request, TypeReference<T> typeReference) {
        String query = request.serialize();

        final CompletableFuture<ApiHttpResponse<JsonNode>> execute = apiRoot.graphql()
                .post(GraphQLRequest.builder().query(query).build())
                .execute(JsonNode.class);
        return execute.thenApply(apiHttpResponse -> JsonUtils.fromJsonNode(
            apiHttpResponse.getBody().get("data").get(request.getQuery().getOperationName()), typeReference));
    }

    public <T> T queryBlocking(GraphQLQueryRequest request, TypeReference<T> typeReference) {
        return ClientUtils.blockingWait(query(request, typeReference), timeout);
    }

    public CompletableFuture<ProductQueryResult> queryProducts(UnaryOperator<ProductsGraphQLQuery.Builder> query,
            Function<ProductsProjectionRoot<?, ?>, BaseProjectionNode> request) {
        return query(new GraphQLQueryRequest(query.apply(ProductsGraphQLQuery.newRequest()).build(),
            request.apply(new ProductsProjectionRoot<>())), new TypeReference<ProductQueryResult>() {
            });
    }

    public ProductQueryResult queryProductsBlocking(UnaryOperator<ProductsGraphQLQuery.Builder> query,
            Function<ProductsProjectionRoot<?, ?>, BaseProjectionNode> request) {
        return ClientUtils.blockingWait(queryProducts(query, request), timeout);
    }

    public CompletableFuture<CategoryQueryResult> queryCategories(UnaryOperator<CategoriesGraphQLQuery.Builder> query,
            Function<CategoriesProjectionRoot<?, ?>, BaseProjectionNode> request) {
        return query(new GraphQLQueryRequest(query.apply(CategoriesGraphQLQuery.newRequest()).build(),
            request.apply(new CategoriesProjectionRoot<>())), new TypeReference<CategoryQueryResult>() {
            });
    }

    public CategoryQueryResult queryCategoriesBlocking(UnaryOperator<CategoriesGraphQLQuery.Builder> query,
            Function<CategoriesProjectionRoot<?, ?>, BaseProjectionNode> request) {
        return ClientUtils.blockingWait(queryCategories(query, request), timeout);
    }
}
