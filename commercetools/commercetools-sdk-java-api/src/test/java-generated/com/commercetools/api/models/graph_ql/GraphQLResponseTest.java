
package com.commercetools.api.models.graph_ql;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLResponseBuilder builder) {
        GraphQLResponse graphQLResponse = builder.buildUnchecked();
        Assertions.assertThat(graphQLResponse).isInstanceOf(GraphQLResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "data", GraphQLResponse.builder().data("data") },
                new Object[] { "errors",
                        GraphQLResponse.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.api.models.graph_ql.GraphQLErrorImpl())) } };
    }

    @Test
    public void data() {
        GraphQLResponse value = GraphQLResponse.of();
        value.setData("data");
        Assertions.assertThat(value.getData()).isEqualTo("data");
    }

    @Test
    public void errors() {
        GraphQLResponse value = GraphQLResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.graph_ql.GraphQLErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.graph_ql.GraphQLErrorImpl()));
    }
}
