
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLRecurringOrderFailureErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLRecurringOrderFailureErrorBuilder builder) {
        GraphQLRecurringOrderFailureError graphQLRecurringOrderFailureError = builder.buildUnchecked();
        Assertions.assertThat(graphQLRecurringOrderFailureError).isInstanceOf(GraphQLRecurringOrderFailureError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "details", GraphQLRecurringOrderFailureError.builder().details("details") } };
    }

    @Test
    public void details() {
        GraphQLRecurringOrderFailureError value = GraphQLRecurringOrderFailureError.of();
        value.setDetails("details");
        Assertions.assertThat(value.getDetails()).isEqualTo("details");
    }
}
