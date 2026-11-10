
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLAgentQuoteRequestCreationFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLAgentQuoteRequestCreationFailedErrorBuilder builder) {
        GraphQLAgentQuoteRequestCreationFailedError graphQLAgentQuoteRequestCreationFailedError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLAgentQuoteRequestCreationFailedError)
                .isInstanceOf(GraphQLAgentQuoteRequestCreationFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "cartId", GraphQLAgentQuoteRequestCreationFailedError.builder().cartId("cartId") } };
    }

    @Test
    public void cartId() {
        GraphQLAgentQuoteRequestCreationFailedError value = GraphQLAgentQuoteRequestCreationFailedError.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }
}
