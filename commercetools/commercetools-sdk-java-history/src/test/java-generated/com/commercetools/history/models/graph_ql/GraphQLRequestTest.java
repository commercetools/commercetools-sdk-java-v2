
package com.commercetools.history.models.graph_ql;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLRequestBuilder builder) {
        GraphQLRequest graphQLRequest = builder.buildUnchecked();
        Assertions.assertThat(graphQLRequest).isInstanceOf(GraphQLRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "query", GraphQLRequest.builder().query("query") },
                new Object[] { "operationName", GraphQLRequest.builder().operationName("operationName") },
                new Object[] { "variables", GraphQLRequest.builder()
                        .variables(new com.commercetools.history.models.graph_ql.GraphQLVariablesMapImpl()) } };
    }

    @Test
    public void query() {
        GraphQLRequest value = GraphQLRequest.of();
        value.setQuery("query");
        Assertions.assertThat(value.getQuery()).isEqualTo("query");
    }

    @Test
    public void operationName() {
        GraphQLRequest value = GraphQLRequest.of();
        value.setOperationName("operationName");
        Assertions.assertThat(value.getOperationName()).isEqualTo("operationName");
    }

    @Test
    public void variables() {
        GraphQLRequest value = GraphQLRequest.of();
        value.setVariables(new com.commercetools.history.models.graph_ql.GraphQLVariablesMapImpl());
        Assertions.assertThat(value.getVariables())
                .isEqualTo(new com.commercetools.history.models.graph_ql.GraphQLVariablesMapImpl());
    }
}
