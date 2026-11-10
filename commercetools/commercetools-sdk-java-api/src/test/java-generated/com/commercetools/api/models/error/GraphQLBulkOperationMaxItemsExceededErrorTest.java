
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLBulkOperationMaxItemsExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLBulkOperationMaxItemsExceededErrorBuilder builder) {
        GraphQLBulkOperationMaxItemsExceededError graphQLBulkOperationMaxItemsExceededError = builder.buildUnchecked();
        Assertions.assertThat(graphQLBulkOperationMaxItemsExceededError)
                .isInstanceOf(GraphQLBulkOperationMaxItemsExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "limit", GraphQLBulkOperationMaxItemsExceededError.builder().limit(7) },
                new Object[] { "provided", GraphQLBulkOperationMaxItemsExceededError.builder().provided(2) } };
    }

    @Test
    public void limit() {
        GraphQLBulkOperationMaxItemsExceededError value = GraphQLBulkOperationMaxItemsExceededError.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void provided() {
        GraphQLBulkOperationMaxItemsExceededError value = GraphQLBulkOperationMaxItemsExceededError.of();
        value.setProvided(2);
        Assertions.assertThat(value.getProvided()).isEqualTo(2);
    }
}
