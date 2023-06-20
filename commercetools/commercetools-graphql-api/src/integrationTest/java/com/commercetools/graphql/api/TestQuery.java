
package com.commercetools.graphql.api;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.graphql.CommercetoolsTestUtils;
import com.commercetools.graphql.api.types.ProductQueryResult;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuery {

    @Test
    public void products() {
        final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt());

        final ApiHttpResponse<GraphQLDataResponse> response = projectRoot.graphql()
                .post(productQuery)
                .executeBlocking(GraphQLDataResponse.class);

        Assertions.assertThat(response.getBody()).isNotNull();
        Assertions.assertThat(response.getBody().getData().getProducts()).isNotNull();

        final ProductQueryResult data = response.getBody().getData(productQuery);
        Assertions.assertThat(data.getResults()).isNotNull();
    }

    @Test
    public void graphQLJacksonModule() {
        final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt());

        final ApiHttpResponse<com.commercetools.api.models.graph_ql.GraphQLResponse> response = projectRoot.graphql()
                .post(productQuery)
                .executeBlocking();

        Assertions.assertThat(response.getBody()).isNotNull();
        Assertions.assertThat(response.getBody().getData()).isInstanceOf(GraphQLData.class);
        GraphQLData data = (GraphQLData) response.getBody().getData();
        Assertions.assertThat(data.getProducts()).isNotNull();

        final ProductQueryResult products = data.get(productQuery);
        Assertions.assertThat(products.getResults()).isNotNull();
    }

    @Test
    public void graphQLExecute() {
        final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt());

        final ApiHttpResponse<GraphQLResponse<ProductQueryResult>> response = projectRoot.graphql()
                .query(productQuery)
                .executeBlocking();

        Assertions.assertThat(response.getBody()).isNotNull();

        final ProductQueryResult data = response.getBody().getData();
        Assertions.assertThat(data.getResults()).isNotNull();
    }

    @Test
    public void graphQLCustom() {
        final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL.query(
            "query($localeProjection:[Locale!]) { products(localeProjection: $localeProjection) { results { id } } }")
                .variables(b -> b.addValue("$localeProjection", Collections.singletonList("en")))
                .dataMapper(GraphQLData::getProducts)
                .build();

        final ApiHttpResponse<GraphQLResponse<ProductQueryResult>> response = projectRoot.graphql()
                .query(productQuery)
                .executeBlocking();

        Assertions.assertThat(response.getBody()).isNotNull();

        final ProductQueryResult data = response.getBody().getData();
        Assertions.assertThat(data.getResults()).isNotNull();
    }
}
