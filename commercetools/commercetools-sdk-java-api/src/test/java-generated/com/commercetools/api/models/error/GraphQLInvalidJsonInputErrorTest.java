
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLInvalidJsonInputErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLInvalidJsonInputErrorBuilder builder) {
        GraphQLInvalidJsonInputError graphQLInvalidJsonInputError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidJsonInputError).isInstanceOf(GraphQLInvalidJsonInputError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "detailedErrorMessage",
                GraphQLInvalidJsonInputError.builder().detailedErrorMessage("detailedErrorMessage") } };
    }

    @Test
    public void detailedErrorMessage() {
        GraphQLInvalidJsonInputError value = GraphQLInvalidJsonInputError.of();
        value.setDetailedErrorMessage("detailedErrorMessage");
        Assertions.assertThat(value.getDetailedErrorMessage()).isEqualTo("detailedErrorMessage");
    }
}
