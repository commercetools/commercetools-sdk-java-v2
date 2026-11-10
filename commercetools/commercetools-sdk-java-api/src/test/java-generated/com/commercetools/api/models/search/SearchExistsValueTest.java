
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchExistsValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchExistsValueBuilder builder) {
        SearchExistsValue searchExistsValue = builder.buildUnchecked();
        Assertions.assertThat(searchExistsValue).isInstanceOf(SearchExistsValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "language", SearchExistsValue.builder().language("language") } };
    }

    @Test
    public void language() {
        SearchExistsValue value = SearchExistsValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }
}
