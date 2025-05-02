
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchExecutionFailureErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchExecutionFailureErrorBuilder builder) {
        SearchExecutionFailureError searchExecutionFailureError = builder.buildUnchecked();
        Assertions.assertThat(searchExecutionFailureError).isInstanceOf(SearchExecutionFailureError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SearchExecutionFailureError.builder().message("message") } };
    }

    @Test
    public void message() {
        SearchExecutionFailureError value = SearchExecutionFailureError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
