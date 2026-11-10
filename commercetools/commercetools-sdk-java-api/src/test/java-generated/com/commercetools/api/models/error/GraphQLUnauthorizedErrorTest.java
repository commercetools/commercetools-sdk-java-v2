
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLUnauthorizedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLUnauthorizedErrorBuilder builder) {
        GraphQLUnauthorizedError graphQLUnauthorizedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLUnauthorizedError).isInstanceOf(GraphQLUnauthorizedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "storesWithoutPermission", GraphQLUnauthorizedError.builder()
                .storesWithoutPermission(Collections.singletonList("storesWithoutPermission")) } };
    }

    @Test
    public void storesWithoutPermission() {
        GraphQLUnauthorizedError value = GraphQLUnauthorizedError.of();
        value.setStoresWithoutPermission(Collections.singletonList("storesWithoutPermission"));
        Assertions.assertThat(value.getStoresWithoutPermission())
                .isEqualTo(Collections.singletonList("storesWithoutPermission"));
    }
}
