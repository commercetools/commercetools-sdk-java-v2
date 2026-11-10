
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLRequiredFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLRequiredFieldErrorBuilder builder) {
        GraphQLRequiredFieldError graphQLRequiredFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLRequiredFieldError).isInstanceOf(GraphQLRequiredFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", GraphQLRequiredFieldError.builder().field("field") } };
    }

    @Test
    public void field() {
        GraphQLRequiredFieldError value = GraphQLRequiredFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }
}
