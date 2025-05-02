
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLOutOfStockErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLOutOfStockErrorBuilder builder) {
        GraphQLOutOfStockError graphQLOutOfStockError = builder.buildUnchecked();
        Assertions.assertThat(graphQLOutOfStockError).isInstanceOf(GraphQLOutOfStockError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItems",
                        GraphQLOutOfStockError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { "skus", GraphQLOutOfStockError.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void lineItems() {
        GraphQLOutOfStockError value = GraphQLOutOfStockError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void skus() {
        GraphQLOutOfStockError value = GraphQLOutOfStockError.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
