
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QueryComplexityLimitExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QueryComplexityLimitExceededErrorBuilder builder) {
        QueryComplexityLimitExceededError queryComplexityLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(queryComplexityLimitExceededError).isInstanceOf(QueryComplexityLimitExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", QueryComplexityLimitExceededError.builder().message("message") } };
    }

    @Test
    public void message() {
        QueryComplexityLimitExceededError value = QueryComplexityLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
