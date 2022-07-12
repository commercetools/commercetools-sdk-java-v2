
package example;

import java.util.Map;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.graph_ql.GraphQLRequest;
import com.commercetools.api.models.graph_ql.GraphQLResponse;
import com.commercetools.api.models.product.Product;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;

public class GraphQLTest {
    private ProjectApiRoot createProjectClient() {
        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build("my-project");
    }

    public void graphql(Product product) {
        ProjectApiRoot apiRoot = createProjectClient();

        GraphQLRequest request = GraphQLRequest.builder()
                .query("query($productFilter:String) { products(where: $productFilter) { results { id } } }")
                .variables(builder -> builder.addValue("productFilter", "id = \"" + product.getId() + "\""))
                .build();
        final ApiHttpResponse<GraphQLResponse> response = apiRoot.graphql().post(request).executeBlocking();

        Assertions.assertThat(response.getBody()).isInstanceOf(GraphQLResponse.class);
        Assertions.assertThat(response.getBody().getData()).isInstanceOf(Map.class);
    }

    public void graphqlMapToClass(Product product) {
        ProjectApiRoot apiRoot = createProjectClient();

        GraphQLRequest request = GraphQLRequest.builder()
                .query("query($productFilter:String) { products(where: $productFilter) { results { id } } }")
                .variables(builder -> builder.addValue("productFilter", "id = \"" + product.getId() + "\""))
                .build();
        final ApiHttpResponse<JsonNode> response = apiRoot.graphql().post(request).executeBlocking(JsonNode.class);

        Assertions.assertThat(response.getBody()).isInstanceOf(JsonNode.class);
    }
}
