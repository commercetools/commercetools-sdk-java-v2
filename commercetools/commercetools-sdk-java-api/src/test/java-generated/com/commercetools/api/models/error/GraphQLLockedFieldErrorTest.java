
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLLockedFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLLockedFieldErrorBuilder builder) {
        GraphQLLockedFieldError graphQLLockedFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLLockedFieldError).isInstanceOf(GraphQLLockedFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", GraphQLLockedFieldError.builder().field("field") } };
    }

    @Test
    public void field() {
        GraphQLLockedFieldError value = GraphQLLockedFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }
}
