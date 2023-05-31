
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
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());

        final ApiHttpResponse<GraphQLDataResponse> response = projectRoot.graphql()
                .post(productQuery)
                .executeBlocking(GraphQLDataResponse.class);

        Assertions.assertThat(response.getBody()).isNotNull();
        Assertions.assertThat(response.getBody().getData().getProducts()).isNotNull();

        final ProductQueryResult data = response.getBody().getData(productQuery);
        Assertions.assertThat(data.getResults()).isNotNull();
    }
}
