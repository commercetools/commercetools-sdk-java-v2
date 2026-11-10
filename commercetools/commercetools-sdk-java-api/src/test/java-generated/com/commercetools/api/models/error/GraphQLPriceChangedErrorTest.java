
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLPriceChangedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLPriceChangedErrorBuilder builder) {
        GraphQLPriceChangedError graphQLPriceChangedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLPriceChangedError).isInstanceOf(GraphQLPriceChangedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItems",
                        GraphQLPriceChangedError.builder().lineItems(Collections.singletonList("lineItems")) },
                new Object[] { "shipping", GraphQLPriceChangedError.builder().shipping(true) } };
    }

    @Test
    public void lineItems() {
        GraphQLPriceChangedError value = GraphQLPriceChangedError.of();
        value.setLineItems(Collections.singletonList("lineItems"));
        Assertions.assertThat(value.getLineItems()).isEqualTo(Collections.singletonList("lineItems"));
    }

    @Test
    public void shipping() {
        GraphQLPriceChangedError value = GraphQLPriceChangedError.of();
        value.setShipping(true);
        Assertions.assertThat(value.getShipping()).isEqualTo(true);
    }
}
