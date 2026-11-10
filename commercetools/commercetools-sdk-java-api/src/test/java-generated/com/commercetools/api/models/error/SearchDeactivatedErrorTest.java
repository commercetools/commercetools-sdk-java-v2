
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchDeactivatedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchDeactivatedErrorBuilder builder) {
        SearchDeactivatedError searchDeactivatedError = builder.buildUnchecked();
        Assertions.assertThat(searchDeactivatedError).isInstanceOf(SearchDeactivatedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SearchDeactivatedError.builder().message("message") } };
    }

    @Test
    public void message() {
        SearchDeactivatedError value = SearchDeactivatedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
