
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchNotReadyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchNotReadyErrorBuilder builder) {
        SearchNotReadyError searchNotReadyError = builder.buildUnchecked();
        Assertions.assertThat(searchNotReadyError).isInstanceOf(SearchNotReadyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SearchNotReadyError.builder().message("message") } };
    }

    @Test
    public void message() {
        SearchNotReadyError value = SearchNotReadyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
