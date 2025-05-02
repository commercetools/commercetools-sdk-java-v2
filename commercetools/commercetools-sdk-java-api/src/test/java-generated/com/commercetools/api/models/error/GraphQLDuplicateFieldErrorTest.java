
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLDuplicateFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLDuplicateFieldErrorBuilder builder) {
        GraphQLDuplicateFieldError graphQLDuplicateFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateFieldError).isInstanceOf(GraphQLDuplicateFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", GraphQLDuplicateFieldError.builder().field("field") },
                new Object[] { "duplicateValue",
                        GraphQLDuplicateFieldError.builder().duplicateValue("duplicateValue") } };
    }

    @Test
    public void field() {
        GraphQLDuplicateFieldError value = GraphQLDuplicateFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        GraphQLDuplicateFieldError value = GraphQLDuplicateFieldError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }
}
