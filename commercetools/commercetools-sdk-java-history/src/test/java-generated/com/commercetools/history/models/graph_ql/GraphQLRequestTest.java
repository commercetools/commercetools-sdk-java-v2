
package com.commercetools.history.models.graph_ql;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class GraphQLRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLRequestBuilder builder) {
        GraphQLRequest graphQLRequest = builder.buildUnchecked();
        Assertions.assertThat(graphQLRequest).isInstanceOf(GraphQLRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLRequest.builder().query("query") },
                new Object[] { GraphQLRequest.builder().operationName("operationName") },
                new Object[] { GraphQLRequest.builder()
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
