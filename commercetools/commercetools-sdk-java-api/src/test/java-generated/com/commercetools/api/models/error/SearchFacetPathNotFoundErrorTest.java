
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchFacetPathNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchFacetPathNotFoundErrorBuilder builder) {
        SearchFacetPathNotFoundError searchFacetPathNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(searchFacetPathNotFoundError).isInstanceOf(SearchFacetPathNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SearchFacetPathNotFoundError.builder().message("message") } };
    }

    @Test
    public void message() {
        SearchFacetPathNotFoundError value = SearchFacetPathNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
