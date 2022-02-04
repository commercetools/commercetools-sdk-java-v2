
package commercetools.graphql;

import static commercetools.product.ProductFixtures.*;
import static io.vrap.rmf.base.client.utils.ClientUtils.*;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.graph_ql.GraphQLRequest;
import com.commercetools.api.models.graph_ql.GraphQLResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphQLTest {

    @Test
    public void request() {
        ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        withProduct(product -> {
            String query = "query ProductId {\n" + "    products {\n" + "        results {\n" + "            id\n"
                    + "        }\n" + "    }\n" + "}";
            final CompletableFuture<ApiHttpResponse<GraphQLResponse>> response = apiRoot.graphql()
                    .post(GraphQLRequest.builder().query(query).build())
                    .execute()
                    .thenApply(graphQLResponse -> {
                        if (graphQLResponse.getBody().getErrors() != null
                                && !graphQLResponse.getBody().getErrors().isEmpty()) {
                            throw new RuntimeException("errors happened");
                        }
                        return graphQLResponse;
                    });
            final GraphQLResponse body = blockingWait(response, Duration.ofSeconds(10)).getBody();
            Assertions.assertThat(body).isInstanceOf(GraphQLResponse.class);

            final CompletableFuture<ApiHttpResponse<JsonNode>> jsonResponse = apiRoot.graphql()
                    .post(GraphQLRequest.builder().query(query).build())
                    .execute(JsonNode.class);

            final ApiHttpResponse<JsonNode> jsonNode = blockingWait(jsonResponse, Duration.ofSeconds(10));
            Assertions.assertThat(jsonNode.getBody()).isInstanceOf(ObjectNode.class);

        });
    }
}
