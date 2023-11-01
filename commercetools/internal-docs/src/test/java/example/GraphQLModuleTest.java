
package example;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.graph_ql.GraphQLResponse;
import com.commercetools.graphql.api.GraphQL;
import com.commercetools.graphql.api.GraphQLData;
import com.commercetools.graphql.api.GraphQLDataResponse;
import com.commercetools.graphql.api.GraphQLRequest;
import com.commercetools.graphql.api.types.ProductQueryResult;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphQLModuleTest {

    ProjectApiRoot projectApiRoot;

    // spotless:off
    @Test
    public void queryBuilding() {

        final GraphQLRequest<ProductQueryResult> productsQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());

        String query = "{\n"
                + "  products(localeProjection: [\"en\"]) {\n"
                + "    results {\n"
                + "      id\n"
                + "      key\n"
                + "      productType {\n"
                + "        key\n"
                + "      }\n"
                + "      createdAt\n"
                + "    }\n"
                + "  }\n"
                + "}";
        Assertions.assertThat(productsQuery.getQuery()).isEqualTo(query);
    }
    // spotless:on

    public void responseData() {

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());

        final ApiHttpResponse<GraphQLDataResponse> response = projectApiRoot.graphql()
                .post(productQuery)
                .executeBlocking(GraphQLDataResponse.class);
    }

    public void resultData() {

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());

        final ApiHttpResponse<GraphQLDataResponse> response = projectApiRoot.graphql()
                .post(productQuery)
                .executeBlocking(GraphQLDataResponse.class);

        final ProductQueryResult data = response.getBody().getData(productQuery);
    }

    public void graphQLJacksonModule() {

        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt().key());

        final ApiHttpResponse<GraphQLResponse> response = projectApiRoot.graphql().post(productQuery).executeBlocking();

        Assertions.assertThat(response.getBody().getData()).isInstanceOf(GraphQLData.class);

        GraphQLData data = (GraphQLData) response.getBody().getData();
        final ProductQueryResult products = data.get(productQuery);
    }

    public void graphQLExecute() {
        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL
                .products(query -> query.localeProjection(Collections.singletonList("en")))
                .projection(root -> root.results().id().key().productType().key().getParent().createdAt());

        final ApiHttpResponse<com.commercetools.graphql.api.GraphQLResponse<ProductQueryResult>> response = projectApiRoot
                .graphql()
                .query(productQuery)
                .executeBlocking();

        Assertions.assertThat(response.getBody()).isNotNull();

        final ProductQueryResult data = response.getBody().getData();
        Assertions.assertThat(data.getResults()).isNotNull();
    }

    public void graphQLCustom() {
        final GraphQLRequest<ProductQueryResult> productQuery = GraphQL.query(
            "query($localeProjection:[Locale!]) { products(localeProjection: $localeProjection) { results { id } } }")
                .variables(b -> b.addValue("$localeProjection", Collections.singletonList("en")))
                .dataMapper(GraphQLData::getProducts)
                .build();

        final ApiHttpResponse<com.commercetools.graphql.api.GraphQLResponse<ProductQueryResult>> response = projectApiRoot
                .graphql()
                .query(productQuery)
                .executeBlocking();

        Assertions.assertThat(response.getBody()).isNotNull();

        final ProductQueryResult data = response.getBody().getData();
        Assertions.assertThat(data.getResults()).isNotNull();
    }
}
