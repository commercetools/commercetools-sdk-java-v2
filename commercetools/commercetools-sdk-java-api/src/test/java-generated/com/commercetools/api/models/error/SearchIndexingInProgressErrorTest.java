
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchIndexingInProgressErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchIndexingInProgressErrorBuilder builder) {
        SearchIndexingInProgressError searchIndexingInProgressError = builder.buildUnchecked();
        Assertions.assertThat(searchIndexingInProgressError).isInstanceOf(SearchIndexingInProgressError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", SearchIndexingInProgressError.builder().message("message") } };
    }

    @Test
    public void message() {
        SearchIndexingInProgressError value = SearchIndexingInProgressError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
