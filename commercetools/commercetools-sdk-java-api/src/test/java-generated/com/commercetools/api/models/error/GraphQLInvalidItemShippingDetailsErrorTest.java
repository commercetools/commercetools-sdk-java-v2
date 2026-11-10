
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLInvalidItemShippingDetailsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLInvalidItemShippingDetailsErrorBuilder builder) {
        GraphQLInvalidItemShippingDetailsError graphQLInvalidItemShippingDetailsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidItemShippingDetailsError)
                .isInstanceOf(GraphQLInvalidItemShippingDetailsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "subject", GraphQLInvalidItemShippingDetailsError.builder().subject("subject") },
                new Object[] { "itemId", GraphQLInvalidItemShippingDetailsError.builder().itemId("itemId") } };
    }

    @Test
    public void subject() {
        GraphQLInvalidItemShippingDetailsError value = GraphQLInvalidItemShippingDetailsError.of();
        value.setSubject("subject");
        Assertions.assertThat(value.getSubject()).isEqualTo("subject");
    }

    @Test
    public void itemId() {
        GraphQLInvalidItemShippingDetailsError value = GraphQLInvalidItemShippingDetailsError.of();
        value.setItemId("itemId");
        Assertions.assertThat(value.getItemId()).isEqualTo("itemId");
    }
}
