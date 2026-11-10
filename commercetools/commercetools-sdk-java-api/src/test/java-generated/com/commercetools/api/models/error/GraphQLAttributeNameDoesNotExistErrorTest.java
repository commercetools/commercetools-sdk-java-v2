
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLAttributeNameDoesNotExistErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLAttributeNameDoesNotExistErrorBuilder builder) {
        GraphQLAttributeNameDoesNotExistError graphQLAttributeNameDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(graphQLAttributeNameDoesNotExistError)
                .isInstanceOf(GraphQLAttributeNameDoesNotExistError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "invalidAttributeName",
                GraphQLAttributeNameDoesNotExistError.builder().invalidAttributeName("invalidAttributeName") } };
    }

    @Test
    public void invalidAttributeName() {
        GraphQLAttributeNameDoesNotExistError value = GraphQLAttributeNameDoesNotExistError.of();
        value.setInvalidAttributeName("invalidAttributeName");
        Assertions.assertThat(value.getInvalidAttributeName()).isEqualTo("invalidAttributeName");
    }
}
