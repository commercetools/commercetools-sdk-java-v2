
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLInvalidFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLInvalidFieldErrorBuilder builder) {
        GraphQLInvalidFieldError graphQLInvalidFieldError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidFieldError).isInstanceOf(GraphQLInvalidFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", GraphQLInvalidFieldError.builder().field("field") },
                new Object[] { "invalidValue", GraphQLInvalidFieldError.builder().invalidValue("invalidValue") },
                new Object[] { "allowedValues", GraphQLInvalidFieldError.builder()
                        .allowedValues(Collections.singletonList("allowedValues")) } };
    }

    @Test
    public void field() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void invalidValue() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setInvalidValue("invalidValue");
        Assertions.assertThat(value.getInvalidValue()).isEqualTo("invalidValue");
    }

    @Test
    public void allowedValues() {
        GraphQLInvalidFieldError value = GraphQLInvalidFieldError.of();
        value.setAllowedValues(Collections.singletonList("allowedValues"));
        Assertions.assertThat(value.getAllowedValues()).isEqualTo(Collections.singletonList("allowedValues"));
    }
}
