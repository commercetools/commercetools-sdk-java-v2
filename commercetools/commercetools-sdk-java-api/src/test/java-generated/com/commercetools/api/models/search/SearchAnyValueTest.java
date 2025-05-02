
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchAnyValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchAnyValueBuilder builder) {
        SearchAnyValue searchAnyValue = builder.buildUnchecked();
        Assertions.assertThat(searchAnyValue).isInstanceOf(SearchAnyValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", SearchAnyValue.builder().value("value") },
                new Object[] { "language", SearchAnyValue.builder().language("language") },
                new Object[] { "caseInsensitive", SearchAnyValue.builder().caseInsensitive(true) } };
    }

    @Test
    public void value() {
        SearchAnyValue value = SearchAnyValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        SearchAnyValue value = SearchAnyValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void caseInsensitive() {
        SearchAnyValue value = SearchAnyValue.of();
        value.setCaseInsensitive(true);
        Assertions.assertThat(value.getCaseInsensitive()).isEqualTo(true);
    }
}
