
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QueryTimedOutErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QueryTimedOutErrorBuilder builder) {
        QueryTimedOutError queryTimedOutError = builder.buildUnchecked();
        Assertions.assertThat(queryTimedOutError).isInstanceOf(QueryTimedOutError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", QueryTimedOutError.builder().message("message") } };
    }

    @Test
    public void message() {
        QueryTimedOutError value = QueryTimedOutError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
